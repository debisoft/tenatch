# Database Access

## Install PostgreSQL

Macの場合は[ここ](https://postgresapp.com/)を参考にPostgreSQLをインストールしましょう。<br>
Windowsの場合は[こちら](https://www.postgresql.org/download/)を参考にインストールしましょう。<br>

## Install Database Connector

PostgreSQLのコネクターを[こちら](https://jdbc.postgresql.org/download.html)からインストールしましょう。<br>
バージョンは新しければ多分大丈夫です。

1. Place the JDBC driver jar of the database you plan to use into $FIRECAT_HOME/lib/ <br> (Windows users: please place the JDBC driver into $FIRECAT_HOME/sys/lib/)　
2. Create a database called test_db.
3. Create a table called test_tbl and populate with data.
4. Create a file called db_test.nsp and put in the following lines: <br>

```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<%
    var db = new Database("org.postgresql.Driver");
    // ^change to the JDBC Driver you are using.

    db.connect("jdbc:postgresql://127.0.0.1:5432/test_db", "postgres", "your_password");
    // ^change the database username and password.

    var result = db.executeRetrieval("SELECT * FROM test_tbl");

    while(result.next())
    {
        var column_count = result.getColumnCount();

        for(var i = 1; i <= column_count; i++)
        {
            resOut.print(result.getColumnItem(i) + " ");
        } // for(var i = 1; i <= column_count; i++)
        resOut.println("<br />");
    } // while(result.next())

    db.disconnect();
%>
```

5. Test the page in your browser:
If you created the file in $FIRECAT_HOME/WEBHOST/DEFAULT/WWWROOT,
you should be able to view the page at http://localhost:9090/db_test.nsp
NOTE: Webpage names are case sensitive.
So db_test.nsp.nsp is not the same file as DB_test.nsp

6. You should be able to see the contents of the table you created.
7. More documentation on the use of the Database Object can be found at FESI Database Extension.
NOTE: Another method of connecting to the database is under development and
will eventually replace this method.
