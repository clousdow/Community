$(function(){
	function creatReply(){
		var userName = user;
		var postId = post.postId;
		var replyFloorId = $(this).parents("td").eq(1).prev().children().eq(1).text();
		var replyText = $(this).prev().val();
		$.ajax({
			url:"/Community/reply/creatReply",
			type:"POST",
			dataType:"json",
			data:{"userName":userName,"postId":postId,"replyFloorId":replyFloorId,"replyText":replyText},
			async:true,
			success: function(result){
				
			},
			error: function(result){
				$("#message").text("发生未知错误");
			}
		});
	}
})