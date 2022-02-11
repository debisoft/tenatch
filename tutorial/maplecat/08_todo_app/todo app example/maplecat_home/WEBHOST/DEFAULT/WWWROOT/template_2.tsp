<%@page content_type="text/html; charset=ISO-8859-1"%>

<html>
    <head>
        <title>Weather Station</title>
    </head>
    <body>
        <% 
            let date_today = new Date(); 
        %>
        Weather For <%=date_today%><br />
        <table bgcolor="ffcc99">
            <tr><td>
                <nsp:PageTemplateBodyContent />
            </td></tr>
        </table>
    </body>
</html>