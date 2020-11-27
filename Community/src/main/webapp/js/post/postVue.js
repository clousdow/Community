var param = window.location.search;
var floorList = null;
var page = null;
var post = null;
var user = sessionStorage.getItem('user');
new Vue({
	  el: '#app',
	  data: {
		  post,
		  floorList,
		  page,
		  user,
		  floorText:'',
	  },
	  mounted:function(){
		  this.getdata();
	  },
	  methods:{	
		  getdata : function(){
    		//发送 post 请求
    		this.$http.post('/Community/post/getPostForPage',{param:param},{emulateJSON:true}).then(function(res){
    			this.floorList = res.body.page.pageList;
    			this.page = res.body.page;
    			this.post = res.body.post;
    		},function(res){
        		console.log(res.status);
    		});
		  },
	  	  creatFloor : function(){
	  		//发送 post 请求
	    		this.$http.post('/Community/post/creatFloor',{postId:this.post.postId,userName:this.user,floorText:this.floorText},{emulateJSON:true}).then(function(res){
	    			location.reload();
	    		},function(res){
	        		console.log(res.status);
	    		});
	  	  },
	  	  creatReply :function (event){
	  		var el = event.currentTarget;
	  		var userName = user;
	  		var postId = this.post.postId;
	  		var replyFloorId = $(el).parents("td").eq(1).prev().children().eq(1).text();
	  		var replyText = $(el).prev().val();
	  		this.$http.post('/Community/reply/creatReply',{userName:userName,postId:postId,replyFloorId:replyFloorId,replyText:replyText},{emulateJSON:true}).then(function(res){
    			location.reload();
    		},function(res){
        		console.log(res.status);
    		});
	  	}
	}	
})