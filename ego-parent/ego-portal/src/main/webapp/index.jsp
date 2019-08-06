<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){
	var index = 0 ;
	var imglength = ${list.size()};
	$(".imgindex").eq(index).css("background","green");
	$.each($(".adpic"),function(i,n){
		$(n).css("left",400*i+"px");
	})
	setInterval(function(){
		$.each($(".adpic"),function(i,n){
			$(n).animate({"left":parseInt($(n).css("left"))-400+"px"},1000,function(){
				//当动画执行完成后执行的功能
				if(i==0){
					var $newimg = $(n).clone();
					$(n).remove();
					$newimg.css("left","800px");
					$("#addiv").append($newimg);
				}
			});
		})
		index++;
		if(index>imglength-1){
			index=0;
		}
		$(".imgindex").css("background","red");
		$(".imgindex").eq(index).css("background","green");
	},3000);
})
</script>
  </head>
  
  <body>
    <button>按钮</button>
    <div id="addiv" style="width:400px; height:200px;border:1px solid black; margin-left:100px; position:absolute;overflow:hidden;">
    	<c:forEach items="${list }" var="pic">
    		<img class="adpic" src="${pic.path }" width="400" height="200" style="position:absolute;left:0px; top:0px;" />
    	</c:forEach>
    </div>
    <div style=" position:absolute;top:180px;left:300px;">
		<c:forEach begin="1" end="${list.size() }" var="step">
			<span class="imgindex" style="background-color:red;">${step }</span>
		</c:forEach>
	</div>
  </body>
</html>
