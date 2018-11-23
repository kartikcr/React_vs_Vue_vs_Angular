import React from 'react';
import Task from './Task';

class ToDoList extends React.Component{
    constructor(props){
        super(props);
        // Persist state
        this.state = {
            list: [
                {
                    'task':'Enter tasks here'   
                }
            ]
        };
    }

    newTask = () => {
        this.setState(
            ({list,task}) => ({
                list:[
                    ...list,{task}
                ],
                task:''
            })
        )
    };

    handleInput = ele => {
        this.setState({
            task: ele.target.value
        });
    };

    deleteTask = delIndex => {
        this.setState( 
            ({list}) => ({
                list: list.filter((task, index) => index !== delIndex)
            })
        )
    };

    render(){
        return(
            <div>
                <h1> To do list </h1>
                <div className = "ToDoList">
                    {this.state.list.map(
                        (task,key)=>{
                            return <Task key={key} taskcontent={task.task} taskdelete={this.deleteTask.bind(this,key)} />
                        }
                    )}
                </div>
                <div>
                    <input type="text" value={this.state.task} onChange={this.handleInput} />
                    <button onClick={this.newTask}> + </button>
                </div>
            </div>
        )
    }

}
export default ToDoList;
