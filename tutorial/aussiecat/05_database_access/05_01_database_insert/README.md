# Database Insert

## See Intro

初期は[ここ](../README.md)を参考に PostgreSQL をインストールしましょう。

## Database INSERT

1. Create a file called db_insert_test.nsp and put in the following lines: <br>

```
<%@page content_type="text/html; charset=ISO-8859-1"%>
<%
  var db = new Database("org.postgresql.Driver");
  //^ change to the JDBC Driver you are using.

  db.connect("jdbc:postgresql://127.0.0.1:5432/test_db", "postgres", "your_password");
  //^ change the database username and password.

  var update_count = db.executeCommand("INSERT INTO test_tbl(username, email) VALUES('shinigamidee','a@b.com')");
  //^ change accordingly to your table schema

  var err = db.getLastError();

  if(err)
  {
    resOut.println('err: ' + err);
  }
  else
  {
    resOut.println('Rows affected: ' + update_count);
  }

  db.disconnect();
%>
```

2. Test the page in your browser:
   If you created the file in $FIRECAT_HOME/WEBHOST/DEFAULT/WWWROOT,
   you should be able to view the page at http://localhost:9090/db_insert_test.nsp
   <br>NOTE: Webpage names are case sensitive.

3. You should be able to see the number of rows affected, or an error message if there was a problem.
4. More documentation on the use of the Database Object can be found at FESI Database Extension.
   NOTE: Another method of connecting to the database is under development and
   will eventually replace this method.
