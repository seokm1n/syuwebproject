<%@ page language="java" contentType="text/html; charset=euc-kr"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<%
	Date now = new Date();
%>
<html>
<head>
<meta charset="UTF-8">
<title>현재 시간</title>
</head>
<body>
	현재 시각:
	<%= now %>
</body>
</html>