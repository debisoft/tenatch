# Database Remove

## Remove example:

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Remove the data
	mondb.remove(personCollection, '{"name": "shinigamidee"}');
%>
```
