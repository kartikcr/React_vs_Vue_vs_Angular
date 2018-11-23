import React from 'react';
class Task extends React.Component{
    render() {
        return (
            <div>
                <input type='text' className="TaskContent" value={this.props.taskcontent}></input>
                <button className="TaskDelete" onClick={this.props.taskdelete}> x </button>
            </div>
        );
    }
}
export default Task;
