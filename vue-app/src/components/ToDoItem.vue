<template>
    <div class="container">
        <div class="ToDoItem">
            <p class="ToDoItem-Text">{{todo.text}}</p>
            <div class="ToDoItem-Delete justify-content-md-center"
                 @click="deleteItem(todo)">-
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "to-do-item",
        props: ['todo'],
        methods: {
            deleteItem(todo) {
                this.$emit('delete', todo)
            }
        }
    }
</script>