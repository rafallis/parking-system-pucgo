import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            alias: '/contratos',
            name: 'contratos',
            component: () => import('./components/ContratosList')
        },
        {
            path: '/cliente',
            alias: '/cliente',
            name: 'clientes',
            component: () => import('./components/ClienteList')
        },
        {
            path: '/cliente/novo',
            name: 'add-cliente',
            component: () => import('./components/AddCliente')
        }
    ]
})