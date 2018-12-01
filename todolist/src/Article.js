import React, {Component} from 'react';
class ArticleRestDisplay extends Component{
    constructor(props){
        super(props);
        this.state={
            data: [],
            count: 0
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

    newName(data){
        return "article_"+data+"_"+this.state.count;
    }
    
    render(){
        return(
            <div>
                {this.state.data.map(
                (data,index) => (
                    <div>
                        <h1 id={"A"+data.ID+"_title"}> {data.title} </h1>
                        <br/>
                        <h2 id={"A"+data.ID+"_author"}>{data.author}</h2>
                        <br/>
                        <span id={"A"+data.ID+"_article"}>{data.article}</span><hr/>
                    </div>
                )
                )}
            </div>
        )
    }
} 
export default ArticleRestDisplay;
