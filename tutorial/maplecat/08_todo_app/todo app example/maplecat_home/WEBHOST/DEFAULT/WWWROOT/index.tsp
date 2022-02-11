<%@page content_type="text/html; charset=ISO-8859-1"%>
<%!--nsp:PageTemplate template_url="template_1.tsp"--%>
<!--br /-->
<%="Hello from MapleCat!"%>&#127809;<br />

<%
	let msg_today: string = "The date today is " + new Date() + ".";
%>

<%=msg_today%><br />

<%
	resOut.println("Have a nice day!!");
%>

<br />
<%!--/nsp:PageTemplate--%>
