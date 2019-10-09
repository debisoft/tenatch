## Page Template

### 1. `template_1.nsp`というファイルを作成して、以下のコードを貼り付けます。
```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<html>
    <head>
        <title>Weather Station</title>
    </head>
    <body>
        <% 
            var date_today = new Date(); 
        %>
        Weather For <%=date_today%><br />
        <table bgcolor="ffcc99">
            <tr><td>
                <nsp:PageTemplateBodyContent />
            </td></tr>
        </table>
    </body>
</html>
```
<br>

### 2. 次に`hotday.nsp`というファイルを作成し、以下のコードを貼り付けます。
```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<nsp:PageTemplate template_url="template_1.nsp">

<%
    var msg = "It is a hot day today!!";
%>

<%=msg%>

</nsp:PageTemplate>
```
<br>

### 3. ブラウザでテストしましょう。
`/WEBHOST/DEFAULT/WWWROOT`にファイルを作成しているのを確認し、
[http://localhost/hotday.nsp](http://localhost/hotday.nsp)にアクセスします。



