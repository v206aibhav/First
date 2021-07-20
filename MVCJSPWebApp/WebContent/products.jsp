<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<%@include file="header.html" %>	

<%@page session="false" %>
<%
	HttpSession s=request.getSession(false);
	if(s!=null)
	{ 
		out.println("<body bgcolor='pink'>"+"<h2> Dear " +(String) s.getAttribute("user")+ " welcome in the shopping page </h2>"+"</body>" );
	 	
	}else
	{
	out.println("<h3 style='color:red;'>Sorry! No Session,Please login again</h3>");
	//RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	//rd.forward(request, response);
	}
%>
<%@include file="footer.html" %>
</body>
</html>