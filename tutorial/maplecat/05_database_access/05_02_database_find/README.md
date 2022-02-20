# Database Find

## Find example:

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");s

// Find the data
	let personCursor = personCollection.find("{name: 'shinigamidee'}").map(mondb.makeJSON);

	personCursor.forEach(
		person => resOut.println(person.name + ", " + person.city + "<br />");
	);

	personCursor.close();
%>
```

## Find with sort example:

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Find and sort the data
	let personCursor = personCollection.find("{}").sort("{id: -1}").map(mondb.makeJSON);

	personCursor.forEach(
		person => resOut.println(person.name + ", " + person.city + "<br />");
	);

	personCursor.close();
%>
```

This will retrieve all documents `find("{}")` and the -1 is for sort descending(1 for ascending) `{id: -1}`

## Find with skip example

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Find the data (with skip)
	let personCursor = personCollection.find("{}").skip(5).map(mondb.makeJSON);

	personCursor.forEach(
		person => resOut.println(person.name + ", " + person.city + "<br />");
	);

	personCursor.close();
%>
```

This will skip 5 documents `skip(5)`

## Find with limit example

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Find the data (with limit)
	let personCursor = personCollection.find("{}").limit(10).map(mondb.makeJSON);

	personCursor.forEach(
		person => resOut.println(person.name + ", " + person.city + "<br />");
	);

	personCursor.close();
%>
```

This will limit the query to 10 documents `limit(10)`

## Find combination example

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Find the data
	let personCursor = personCollection.find("{}").sort("{id: -1}").skip(5).limit(10).map(mondb.makeJSON);

	personCursor.forEach(
		person => resOut.println(person.name + ", " + person.city + "<br />");
	);

	personCursor.close();
%>
```
