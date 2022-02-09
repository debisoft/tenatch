# Database Find

<%
// Database connection
let mongoClient = mdb.getMongoClient('tester');
let db = mongoClient.getDB("sample_training");
let jdb = mdb.makeJongo(db);

let personCollection = jdb.getCollection("persons");

// Find the data
let personList = personCollection.find("{name: 'Bob'}").map(
r => return JSON.parse(r)
);

// Display the data
personList.forEach(
person => resOut.println(person.name + ", " + person.city + "<br />");
);
%>
