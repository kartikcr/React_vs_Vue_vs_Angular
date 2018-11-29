import React, {Component} from 'react'
import ToDoList from './ToDoList'
import ArticleRestDisplay from './Article'
import CarRestDisplay from './Car'
import ImageRestDisplay from './Image'
class Main extends Component{
    render(){
        return(
            <div>
                <ToDoList /> <hr />
                <ArticleRestDisplay /> <hr />
                <CarRestDisplay /> <hr />
                <ImageRestDisplay />
            </div> 
        );
    }
}
export default Main;
