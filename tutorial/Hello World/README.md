# Hello World

Creating A Simple Page:

1. Create a file called Hello.nsp and put in the following lines:
<%@page content_type="text/html; charset=ISO-8859-1"%>

<%
    var msg = "Hello World!!";
%>

<%=msg%>


2. Test the page in your browser:
If you created the file in $FIRECAT_HOME/WEBHOST/DEFAULT/WWWROOT,
you should be able to view the page at http://localhost:8080/Hello.nsp
NOTE: Webpage names are case sensitive.
So Hello.nsp is not the same file as hello.nsp

3. Congratulations! You have just created your very first NSP webpage!

4. You can view this example here and the source here. If you just want to try
firecat without installing it, give our sandBox at try!
