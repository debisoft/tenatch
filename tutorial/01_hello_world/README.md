# Hello World

1. Hello.nspファイルを`プロジェクトファイル/WEBHOST/DEFAULT/WWWROOT`のディレクトリ内に作成し、以下のコードを貼り付けます：<br>
```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<%
    var msg = "Hello World!!";
%>

<%=msg%>
```

2.　ブラウザでコードのテスト: <br>
次のURLにアクセスします。http://localhost:8080/Hello.nsp
<br>

### Syntax
Javascriptを埋め込むときは、`<% %>`で囲みます。<br>
`<%= %>`でJavascriptのオブジェクトの中身を直接HTMLに表示させることができます。<br>
（`<%@page content_type="text/html; charset=ISO-8859-1"%>`はWebページの設定をしています。）
