## Page Template

<br>

1. `example_form.nsp`というファイルを`/WEBHOST/DEFAULT/WWWROOT`内に作成して、以下のコードを貼り付けます。

```
<%@page content_type="text/html; charset=utf-8"%>
<html>
  <body>
    <h1>Example</h1>
    <form method="POST" action="example_form_process.nsp">
      Name: <input name="input1" type="text"><br />
      Message:<br />
      <textarea name="input2"></textarea><br />
      <input type="submit" />
    </form>
  </body>
</html>
```

<br>

2. 次に`example_form_process.nsp`というファイルを`/WEBHOST/DEFAULT/WWWROOT`内に作成し、以下のコードを貼り付けます。

```
<%@page content_type="text/plain; charset=ISO-8859-1"%>
<%
  var name = request.getReqParam("input1");
  var msg = request.getReqParam("input2");

  resOut.println("Name: " + name + " Message: " + msg);
%>
```

<br>

3. ブラウザでテストしましょう。
   `/WEBHOST/DEFAULT/WWWROOT`にファイルを作成しているのを確認し、[http://localhost:8080/example_form.nsp](http://localhost:9090/example_form.nsp) にアクセスします。
