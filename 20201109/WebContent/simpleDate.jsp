
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="include.html"%>
	<%
		//DB연결객체
	
		//jar 관리하는 회사...maven
		
	
	/*
	Connerction
	prepareStatement
	ResultSet
	*/

	Date today = new Date();
	out.println("today = " + today + "<br/>");
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");

	out.println("sdf1 = " + sdf1.format(today));
	out.println("sdf2 = " + sdf2.format(today));
	%>
	<%@ include file="include.jsp"%>
</body>
</html>