<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Implicit JSP Objects</title>
</head>
<body>

	<%
		String userName = request.getParameter("name");
		if(userName!=null){
			session.setAttribute("SavedUserName", userName);
			application.setAttribute("applicationUserName", userName);
			pageContext.setAttribute("PageContextUserName", userName);
		}
	%>


<br>
User Name in the request Objects is: <%=userName %>

<br>
User Name in the session Objects is: <%=session.getAttribute("SavedUserName") %>

<br>
User Name in the application Objects is: <%=application.getAttribute("applicationUserName") %>

<br>
User Name in the pageContext Objects is: <%=pageContext.getAttribute("PageContextUserName") %>

</body>
</html>