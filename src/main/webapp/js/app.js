new Vue({  
    el:'#app',  
    data: {  
        message:'hello vue.js.'  
    }  
});  

var app2 = new Vue({
	  el: '#app-2',
	  data: {
	    message: '页面加载于 ' + new Date()
//		mess: 'time out out'
	  }
	})

var app3 = new Vue({
	  el: '#app-3',
	  data: {
	    seen: true
	  }
	})


var app4 = new Vue({
	  el: '#app-4',
	  data: {
	    todos: [
	      { text: '学习 JavaScript' },
	      { text: '学习 Vue' },
	      { text: '整个牛项目' }
	    ]
	  }
	})

var app5 = new Vue({
	el:'#app-5',
	data:{
		message:"hello world!"
	},
	methods:{
		dao: function(){
			this.message = this.message.split('').reverse().join('')
		}
	}
	
})

var app6 = new Vue({
	el:'#app-6',
	data:{
		message:'sd'
	}
})

Vue.component('todo-item', {
	  props: ['todo'],
	  template: '<li>{{ todo.text }}</li>'
	})
	
	
var app7 = new Vue({
  el: '#app-7',
  data: {
    groceryList: [
      { text: '蔬菜' },
      { text: '奶酪' },
      { text: '随便其他什么人吃的东西' }
    ]
  }
})

Vue.component('zz',{
	props:['user'],
	template:'<tr><td>{{user.name}} </td><td>{{user.age}}</td></tr>'
})

var apps = new Vue({
	el:'#apps',
	data:{
		items:[
		       	{'name':'zhang','age':16},
		       	{'name':'wang','age':18},
		       	{'name':'li','age':13}
		       ]
	}
})

var appe = new Vue({
	el:'#appe',
	data:{
		mw:'33'
	}
})



