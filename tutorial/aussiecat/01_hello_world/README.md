# Hello World

1. Hello.nsp ファイルを`プロジェクトファイル/WEBHOST/DEFAULT/WWWROOT`のディレクトリ内に作成し、以下のコードを貼り付けます。<br>

```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<%
    var msg = "Hello World!!";
%>

<%=msg%>
```

<br>

2.　ブラウザで確認しましょう。<br>
次の URL にアクセスします。http://localhost:9090/Hello.nsp
<br><br>

### Syntax

Javascript を埋め込むときは、`<% %>`で囲みます。<br>
`<%= %>`で Javascript のオブジェクトの中身を直接 HTML に表示させることができます。<br>
（`<%@page content_type="text/html; charset=ISO-8859-1"%>`は Web ページの設定をしています。）
