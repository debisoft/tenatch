# Session Management

1. `session_access.tsp`というファイルをいつものように`/WEBHOST/DEFAULT/WWWROOT`に作成して、以下のコードを貼り付けます。

```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<%
    var sessionContext = request.getSessionContext();

    var curr_count = Number(sessionContext.getAttr("counter_1"));

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

2. [http://localhost:9090/session_access.tsp](http://localhost:9090/session_access.tsp)にアクセスして見てみましょう。ブラウザをリロードするたびにアクセスカウントが増えます。
