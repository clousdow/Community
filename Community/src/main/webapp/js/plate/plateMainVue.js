var param = window.location.search;
var postList = null;
var page = null;
var plate = null;
var user = sessionStorage.getItem('user');
new Vue({
	  el: '#app',
	  data: {
		  plate,
		  postList,
		  page,
		  user,
		  postName: '',
		  postText: '',
	  },
	  mounted:function(){
		  this.getdata();
	  },
	  methods:{	
		  getdata : function(){
    		//发送 post 请求
    		this.$http.post('/Community/post/getPostbyPlate',{param:param},{emulateJSON:true}).then(function(res){
    			this.postList = res.body.page.pageList;
    			this.page = res.body.page;
    			this.plate = res.body.plate;
    		},function(res){
        		console.log(res.status);
    		});
		  },
		  creatPost : function(){
		  	this.$http.post('/Community/post/creatPost',{plateId:this.plate.plateId,userName:this.user,postName:this.postName,postText:this.postText},{emulateJSON:true}).then(function(res){
		  		window.location = '/Community/view/post.html?postId=' +  res.body.post.postId + '&pageNo=1';
	    	},function(res){
	        		console.log(res.status);
	    	});
		 }
	 }	
})