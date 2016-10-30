<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="${ctp }/static/css/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${ctp }/static/css/themes/icon.css">
<script type="text/javascript" src="${ctp }/static/jquery/jquery.easyui.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#tt').tree({
			onClick: function(node){
				//检查当前节点是否有 attributes.url 属性
				if(node.attributes.url){
					//使当前 window 的父 window 的 name="content" 的子 window 的 src 属性发生改变
					window.parent.document.getElementById("content").src = node.attributes.url;
				}
			}
		});
	})
</script>


</head>
<body>
	
	<ul id="tt" class="easyui-tree" data-options="url:'${ctp }/commons/tree_data1.json',method:'get',animate:true"></ul>
	
</body>
</html>