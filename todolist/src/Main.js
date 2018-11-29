import React, {Component} from 'react'
import ToDoList from './ToDoList'
import ArticleRestDisplay from './Article'
class Main extends Component{
    render(){
        return(
            <div>
                <ToDoList />
                <ArticleRestDisplay />
            </div> 
        );
    }
}
export default Main;
