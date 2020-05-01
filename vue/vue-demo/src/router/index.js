import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import DataList from '@/components/DataList'
import DashBoard from '@/components/DashBoard'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/data-list',
      name: 'DataList',
      component: DataList
    },
    {
      path: '/dash-board',
      name: 'DashBoard',
      component: DashBoard
    }
  ]
})
