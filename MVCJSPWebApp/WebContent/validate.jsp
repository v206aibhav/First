<jsp:useBean id="ob" class="com.pheonix.web.models.LoginBean" scope="request">
</jsp:useBean>

<jsp:setProperty property="uname" name="ob" />
<jsp:setProperty property="passwd" name="ob" />

<%
		if(ob.isValid())
		{ %>
			<jsp:forward page="/welcome.jsp"></jsp:forward>
		  <%	
		}else
		{  %>
			<h2 style="color : red;">Invalid Login</h2>
			<jsp:include page="/login.jsp"></jsp:include>
		<%
		}
%>		