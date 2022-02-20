# Database Update

## Update example:

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Update the data
    personCollection.update("{name: 'shinigamidee'}").with("{$set: {city: 'Fukuoka'}}");

%>
```

## Update retrieved document example:

```
<%
// Database connection
	// connect to the database
	let mdb = mondb.connectDB('tester', "sample_training");

	// get the collection
	let personCollection = mdb.getCollection("persons");

// Update the data
    let person = mondb.findOne(personCollection, "{name: 'shinigamidee'}");

	person.city = 'Yokohama';

	mondb.update(personCollection, person);

 %>
```
