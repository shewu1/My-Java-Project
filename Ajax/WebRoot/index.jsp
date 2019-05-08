<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<script type="text/javascript" src="js/jquery-1.7.2.js""></script>
	<script type="text/javascript">
	/**
	*url:请求服务器地址
	data:请求参数
	dataType:服务器返回数据类型
	error:请求出错执行的功能
	success:请求成功执行的功能 function(data)  data服务器返回的数据
	type:请求方式
	*/
		$(function(){
			
			$("a").click(function(){
				/* $.ajax({
					url:"demo",
					data:{"name":"张三"},
					dataType:"html",
					error:function(){
						alert("请求出错.")
					},
					success:function(data){
						alert("请求成功,"+data)
					},
					type:"POST"
					
				}); */
				$.post("demo",{"name":"张三"},function(data){
					alert("请求成功,"+data)
				})
				return false;
			})
		});
	</script>
  </head>
  
  <body>
    <a href="demo">跳转</a>
  </body>
</html>
