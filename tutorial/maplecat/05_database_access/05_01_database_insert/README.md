# Database Insert

```
<%
// Database connection
  let mongoClient = mdb.getMongoClient('tester');
  let db = mongoClient.getDB("sample_training");
  let jdb = mdb.makeJongo(db);

  let personCollection = jdb.getCollection("persons");

// Create data
  let json_str = '{"name": "Bob", "id": 1, "city": "Kobe"}';
  let json_obj = JSON.parse(json_str);
  let mdoc = mdb.parseJSON(json_obj);

// Insert the data
  personCollection.insert(mdoc);
%>
```
