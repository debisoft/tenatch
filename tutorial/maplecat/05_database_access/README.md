# Database Access

## Install MongoDB

1.  MongoDB を下記の URL からダウンロードします。
    　すべてデフォルトでダウンロードしましょう。MongoDBcompass を同時にダウンロードするか聞かれますので、それもデフォルトのまま、ダウンロードしましょう。
    　 MongoDBcompass は GUI ツールなので初心者の方も使いやすいです。

            https://www.mongodb.com/try/download/community

    <br>

2.  コマンドプロンプトで以下のコマンドを実行し、mongo.exe を起動ましょう。（通常、MongoDB は C:\Program Files\　にインストールされます。違う場合は確認してください。）

```
	C:\"Program Files"\MongoDB\Server\5.0\bin\mongo.exe
```

<br>

3. MongoDB が正しく起動されたか確認しましょう。もし正常に起動できた場合は以下のアウトプットが確認できます。

```
	MongoDB shell version v5.0.6
	connecting to: mongodb://127.0.0.1:27017/?compressors=disabled&gssapiServiceName=mongodb
	...
```

<br>

4. Maplecat にもどり、`/WEBHOST/DEFAULT/WWWROOT` 内に `db_select_test.tsp` 　を作成します。
   <br>

5. 以下のコードを貼り付けます。

```
<%@page content_type="text/html; charset=ISO-8859-1"%>

<%

// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");


// Insert example: make a collection and insert pbject(s)

	mondb.insertStr(personCollection, '{"name": "shinigamidee", "id": 1, "city": "Kobe"}');


// Find example: print out the object(s) in the collection

	let personList = personCollection.find("{name: 'shinigamidee'}").map(mondb.makeJSON);

	personList.forEach(
		person => resOut.println(person.name + ", " + person.city + "<br />");
	);

	personList.close();

%>

```

<br>

6. ブラウザで [http://localhost:9090/db_select_test.tsp](http://localhost:9090/db_select_test.tsp) を開くと、Insert したオブジェクトが確認できます。
   <br>

7. データベース内の情報を確認してみましょう。
   デスクトップに戻ると、ダウンロードした MongoDBcompass が通常インストールされているので、それを開きます。
   <br>

8. New Connection のパス/URL に　 `mongodb://127.0.0.1:27017` 　を入力して Connect します。
   <br>

9. `sample_training`をひらくと、ステップ 5 で作成した`persons`コレクションがあるのでクリックすると Insert したオブジェクトが確認できます。
   <br>

10. [05_01_database_insert](05_01_database_insert/README.md)、 [05_02_database_find](05_02_database_find/README.md)、[05_03_database_update](05_03_database_update/README.md) 　を参考に、データベース内のデータをどう変更するか、練習してみましょう。
