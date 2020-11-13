<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int c= 20;
	byte d =(byte)c;//데이터 타입 형변환

	int a= 10;
	int b;
	b=20;
	
	out.println("a = "+a);
	out.println("b = "+b);
	
	out.println(a+"+"+b+"="+(a+b));//()우선순위 지정
	
%>
</body>
</html>