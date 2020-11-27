$(document).ready(function(){
  $(".more-plate").click(function(){
		$(this).parent().parent().next().children().last().toggle("slow");
	});
});