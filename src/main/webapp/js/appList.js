var app = new Vue ({  
    el:'#add',  
    data: {  
        message:'hello vue.js.' ,
        book:{name:'x',
        	secondName:'y',
        	years:'1',
        	isExist:'N',
        	isCheck:[]},

//		myOptions1:[
//		            	{text: 'A', value: 'a' },
//		            	{text: 'B', value: 'b' },
//		            	{text: 'C', value: 'c' }
//		            ],
//		myOptions2:[
//		            { label: 'A', options: ['a', 'b']},
//		            { label: 'B', options: ['c', 'd']}
//		            ],
		            myOptions:            [
		             { text: 'A', value: 'a' },
		             { text: 'B', value: 'b' }
		           ]

    }  
});  

