# Implicit Objects
## Types of Implicit Objects

Implicit Objects はもとから作られたObjectとして機能します。
例えば`request`というコードは`IHttpWebletRequest`を実装したオブジェクトとして機能します。

主に５つのサーバー用のImplicit Objectsがあります。
(FirecatはJavascriptをJavaへコンパイルします。InterfaceはJavaのインターフェースとなっていますが、中のデータはほぼ同じです。）

| Implicit Object Name | Interface Name |
|:--------------------:|:--------------:|
| request | [IHttpWebletRequest](https://web.archive.org/web/20080430070322/http://firecat.nihonsoft.org/doc/api/jp/nihonsoft/weppli/IHttpWebletRequest.html) |
| response | [IHttpWebletResponse](https://web.archive.org/web/20080430062457/http://firecat.nihonsoft.org/doc/api/jp/nihonsoft/weppli/IHttpWebletResponse.html) |
| resOut | [ANspBodyBuffer*](https://web.archive.org/web/20080430070538/http://firecat.nihonsoft.org/doc/api/jp/nihonsoft/weppli/nsp/ANspBodyBuffer.html) |
| pageContext | [IPageContext](https://web.archive.org/web/20080430174615/http://firecat.nihonsoft.org/doc/api/jp/nihonsoft/weppli/nsp/IPageContext.html) |
| weppliContext | [IWeppliContext](https://web.archive.org/web/20080430062506/http://firecat.nihonsoft.org/doc/api/jp/nihonsoft/weppli/IWeppliContext.html) |

*ANspBodyBuffer is temporary and will be replaced by the IResponseWriter
interface in the next release.
<br>

## Examples
`Request_tutorial_1.nsp`というファイルを作成して、以下のコードを貼り付けます。

```
<%@page content_type="text/html; charset=ISO-8859-1"%>

  <%
    var msg = "Client IP Address is ";
    var remote_ip = request.getRemoteAddr();
    msg = msg + remote_ip;
  %>

<%=msg%>
```

`/WEBHOST/DEFAULT/WWWROOT`を作成しているならば, [http://localhost:8080/Request_tutorial_1.nsp](http://localhost:8080/Request_tutorial_1.nsp) からブラウザでチェックできます。
<br>
