# Database Insert

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Insert the data
  mondb.insertStr(personCollection, '{"name": "shinigamidee", "id": 1, "city": "Kobe"}');
%>
```
