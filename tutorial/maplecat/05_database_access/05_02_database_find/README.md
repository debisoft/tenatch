# Database Find

## Find example:

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Find the data
    let personList = mondb.find(personCollection, "{name: 'shinigamidee'}");

// Display the data
    personList.forEach(
		person => resOut.println(person.name + ", " + person.city + "<br />");
	);
%>
```

## Find One example:

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Find the data
    let person = mondb.findOne(personCollection, "{name: 'shinigamidee'}");


// Display the data
    resOut.println(person.name + ", " + person.city + "<br />");
%>
```
