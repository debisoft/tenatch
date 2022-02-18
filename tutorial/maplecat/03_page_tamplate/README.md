## Page Template

<br>

1. `template_1.tsp`というファイルを`/WEBHOST/DEFAULT/WWWROOT`内に作成して、以下のコードを貼り付けます。

```
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
```

<br>

2. 次に`hotday.tsp`というファイルを`/WEBHOST/DEFAULT/WWWROOT`内に作成し、以下のコードを貼り付けます。

```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<nsp:PageTemplate template_url="template_1.nsp">

<%
    let msg = "It is a hot day today!!";
%>

<%=msg%>

</nsp:PageTemplate>
```

<br>

3. ブラウザでテストしましょう。
   `/WEBHOST/DEFAULT/WWWROOT`にファイルを作成しているのを確認し、[http://localhost:9090/hotday.tsp](http://localhost:9090/hotday.tsp) にアクセスします。
