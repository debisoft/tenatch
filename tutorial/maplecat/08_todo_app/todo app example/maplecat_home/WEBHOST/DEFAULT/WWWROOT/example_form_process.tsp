<%@page content_type="text/plain; charset=ISO-8859-1"%>
<%
  var name = request.getReqParam("input1");
  var msg = request.getReqParam("input2");

  resOut.println("Name: " + name + " Message: " + msg);
%>