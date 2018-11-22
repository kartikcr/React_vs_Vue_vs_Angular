import Vue from 'vue'
import ToDo from './Todo.vue'

Vue.config.productionTip = false

new Vue({
    render: h => h(ToDo)
}).$mount('#app')