import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import ClimbView from '../views/ClimbView.vue'

//import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home,
    // meta: {
    //   requiresAuth: true
    // }
  },
  {
    path: '/my-climbs',
    name: 'my-climbs',
    component: ClimbView,
    // meta: {
    //   requiresAuth: true
    // }
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

