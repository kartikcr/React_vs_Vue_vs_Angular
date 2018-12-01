import Vue from 'vue'
import Router from 'vue-router'
import Text from '../components/Vue-Text.vue'
import images from '../components/Images.vue'
import Table from '../components/Table.vue'
import Todo from '../Todo.vue'
//import Hello from '../components/Hello'

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/text',
            name: 'vue-text',
            component: Text
        },
        {
            path: '/todo',
            name: 'to-do',
            component: Todo
        },
        {
            path: '/images',
            name: 'vue-images',
            component: images
        },
        {
            path: '/table',
            name: 'vue-table',
            component: Table
        }
        // {
        //     path: '/contact',
        //     name: 'contact',
        //     component: contact
        // },
        // {
        //     path: '/details/:Pid',
        //     name: 'details',
        //     component: details
        // }
    ]
})