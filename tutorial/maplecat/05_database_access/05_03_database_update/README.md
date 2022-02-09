# Database Update

```
<%
// Database connection
    let mongoClient = mdb.getMongoClient('tester');
    let db = mongoClient.getDB("sample_training");
    let jdb = mdb.makeJongo(db);

    let personCollection = jdb.getCollection("persons");

// Update the data
    personCollection.update("{name: 'Bob'}").with("{$set: {city: 'Fukuoka'}}");
    %>
```
