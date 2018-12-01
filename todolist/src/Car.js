import React, {Component} from 'react';
class CarRestDisplay extends Component{
    constructor(props){
        super(props);
        this.state={
            data: []
        };
    }
    
    componentDidMount(){
        const this_reference = this;
        fetch('http://152.46.17.4:8080/pyapi/cars')
            .then(results => {return results.json();})
            .then(jsonData => {
                this.setState({data: jsonData});
            })
    }
    
    render(){
        return(
            <div>
                {this.state.data.map(
                (data,index) => (
                    <div>
                         {data.company} <br/>{data.model}<br/>{data.price}<hr/>
                    </div>
                )
                )}
            </div>
        )
    }
} 
export default CarRestDisplay;
