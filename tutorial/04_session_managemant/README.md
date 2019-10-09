# Session Management

1. `session_access.nsp`というファイルをいつものように`/WEBHOST/DEFAULT/WWWROOT`に作成して、以下のコードを貼り付けます。

```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<%
    var sessionContext = request.getSessionContext();

    var curr_count = sessionContext.getAttr("counter_1");

    if(curr_count != null)
    {
        curr_count = curr_count + 1;
        sessionContext.setAttr("counter_1", curr_count);
    }
    else
    {
        curr_count = 1;
        sessionContext.setAttr("counter_1", curr_count);
    }

    resOut.print("Times you have accessed this page: " + curr_count);
%>
```

<br>
2. [http://localhost/session_access.nsp](http://localhost/session_access.nsp)にアクセスして見てみましょう。<br>
ブラウザをリロードするたびにアクセスカウントが増えます。
