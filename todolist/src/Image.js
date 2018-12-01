import React, {Component} from 'react';
class ImageRestDisplay extends Component{
    constructor(props){
        super(props);
        this.state={
            data: []
        };
    }
    
    componentDidMount(){
        const this_reference = this;
        fetch('http://152.46.17.4:8080/pyapi/images')
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
                        <img src={data.image_url} alt={data.image_alt_text}/><br />
                    </div>
                )
                )}
            </div>
        )
    }
} 
export default ImageRestDisplay;
