import React, {Component} from 'react';
class ArticleRestDisplay extends Component{
    constructor(props){
        super(props);
        this.state={
            data: []
        };
    }
    
    componentDidMount(){
        const this_reference = this;
        fetch('http://152.46.17.4:8080/pyapi/articles')
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
                        <h1> {data.title} </h1><br/><h2>{data.author}</h2><br/><span>{data.article}</span><hr/>
                    </div>
                )
                )}
            </div>
        )
    }
} 
export default ArticleRestDisplay;
