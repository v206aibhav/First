<jsp:useBean id="ob" class="com.pheonix.web.models.LoginBean" scope="request">

</jsp:useBean>
<%@ include file = "header.html" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<h3>Dear <jsp:getProperty property="uname" name="ob"/> Welcome</h3>
	
	<%
		String username=request.getParameter("uname");
		session.setAttribute("user",username);
		session.setMaxInactiveInterval(5);
		String encodedProductUrl=response.encodeURL("products.jsp");
	%>
	<p>Session will be expired after <%=session.getMaxInactiveInterval() %> seconds </p>
	<p>To enjoy shopping <a href="<%= encodedProductUrl %>">click here</a>

	<h5><%@include file="footer.html" %></h5>
</body>
</html>