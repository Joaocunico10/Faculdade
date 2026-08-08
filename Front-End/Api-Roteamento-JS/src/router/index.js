import { createRouter, createWebHistory } from 'vue-router'

import HomeView from '@/views/HomeView.vue'
import UsuariosView from '@/views/UsuariosView.vue'

const routes = [
  {
    path: '/',
    component: HomeView
  },
  {
    path: '/usuarios',
    component: UsuariosView
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
