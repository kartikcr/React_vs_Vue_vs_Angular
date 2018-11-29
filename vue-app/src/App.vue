<template>
    <div id="app">
        <router-view>
            <router-link  to="/text">
                <h4>Check Text rendering</h4>
            </router-link>
            <router-link  to="/images">
                <h4>Check images rendering</h4>
            </router-link>
            <router-link  to="/table">
                <h4>Check Table rendering</h4>
            </router-link>
            <router-link  to="/todo">
                <h4>Check Todo App</h4>
            </router-link>
        </router-view>
    </div>
</template>

<script>
    export default {
        name: 'app',
        template: '<App/>'
    }
</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        color: #2c3e50;
        margin-top: 60px;
    }
</style>