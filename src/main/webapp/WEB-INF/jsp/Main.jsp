<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
	<title>MainPage</title>
	<style type="text/css">@import url("<c:url value="/css/sty.css"/>");</style>
</head>
<body>
<%@include file="./jspf/Navigation.jspf" %>
<div class="card">
	<img src="image/default" alt="Avatar" width="100%" height="100%"/>
	<div class="container">
		<h4><b>Title</b></h4>
		<p>FotTest</p>
	</div>
</div>
</body>
</html>