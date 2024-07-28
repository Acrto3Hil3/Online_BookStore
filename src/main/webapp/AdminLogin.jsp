<%@page import="test.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>

<%
// only session object remain rest will be destroyed.

AdminBean ab= (AdminBean)session.getAttribute("adimnbean");
System.out.println(ab);
out.println("Welcome Admin : " +ab.getFname());

%>

<div class="container-fluid d-flex justify-content-center align-items-center ">
	<div class="text-center border border-2 m-4 p-3 d-block">
	<dl><a href="book.html"><input type="submit" value="AddBooks" /></a></dl>
	<dl><a href="view.html"><input type="submit" value="ViewBooks" /></a></dl>
	<dl><a href="logout"><input type="submit" value="Logout" /></a></dl>
	</div>
</div>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous">
	</script>
</body>
</html>