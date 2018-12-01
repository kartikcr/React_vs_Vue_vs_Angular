<template>
    <div class="container-main">
        <div class="ToDo ">
            <img class="Logo" :src="logo" alt="Vue logo"/>
            <h1 class="ToDo-Header">Vue To Do</h1>
            <div class="ToDo-Container ">
                <div class="ToDo-Content ">
                    <ToDoItem v-for="todo in list"
                              :todo="todo"
                              @delete="onDeleteItem"
                              :key="todo.id"/>
                </div>
                <input type="textbox" v-model="todo" v-on:keyup.enter="createNewToDoItem"/>
                <button class="ToDo-Add" @click="createNewToDoItem()">+</button>
            </div>
        </div>
    </div>
</template>

<script>
    import ToDoItem from './components/ToDoItem.vue'
    import Logo from './assets/logo.png';

    export default {
        name: 'to-do',
        components: {
            ToDoItem
        },
        data() {
            return {
                list: [
                    {
                        id: 1,
                        text: 'clean the house'
                    },
                    {
                        id: 2,
                        text: 'buy milk'
                    }
                ],
                todo: '',
                logo: Logo
            }
        },
        methods: {
            createNewToDoItem() {
                //validate todo
                if (!this.todo) {
                    alert("Please enter a todo!");
                    return
                }
                const newId = Math.max.apply(null, this.list.map(t => t.id)) + 1;
                this.list.push({id: newId, text: this.todo});
                this.todo = '';
            },
            onDeleteItem(todo) {
                this.list = this.list.filter(item => item !== todo);
            },
            swapComponent: function(component)
            {
                this.currentComponent = component;
            }
        },
    }
</script>