<template>
    <div id="app">
        <router-view>
        </router-view>
        <vue-text></vue-text>
        <>
    </div>
</template>

<script>
    import VueText from "./components/Vue-Text";
    export default {
        name: 'app',
        components: {VueText},
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