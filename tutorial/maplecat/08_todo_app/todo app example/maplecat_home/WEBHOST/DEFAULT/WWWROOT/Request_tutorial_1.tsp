<%@page content_type="text/html; charset=ISO-8859-1"%>

  <%
    let msg = "Client IP Address is ";
    let remote_ip = request.getRemoteAddr();
    msg = msg + remote_ip;
  %>

<%=msg%>