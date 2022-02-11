<%@page content_type="text/html; charset=ISO-8859-1"%>

<%
// Database connection
	// Connect to the database
		let mdb = mondb.connectDB('tester', "sample_training");

	//Get the collection
		let personCollection = mdb.getCollection("persons");

// Insert example
	resOut.println("<h4>Insert example: </h4>");

	// Insert example 1: insert 6 people
		mondb.insertStr(personCollection, '{"name": "shinigamidee", "id": 1, "city": "Kobe"}');
		mondb.insertStr(personCollection, '{"name": "ChihiroMH", "id": 2, "city": "Toronto"}');
		mondb.insertStr(personCollection, '{"name": "Bob", "id": 3, "city": "Tokyo"}');
		mondb.insertStr(personCollection, '{"name": "John", "id": 4, "city": "Paris"}');
		mondb.insertStr(personCollection, '{"name": "Jessica", "id": 5, "city": "New York"}');
		mondb.insertStr(personCollection, '{"name": "Erica", "id": 6, "city": "Tokyo"}');

	// Insert example 2: insert a group of 6 people
		let employeeList = ['{"name": "employee1", "id": 101, "city": "Kobe"}',
							'{"name": "employee2", "id": 102, "city": "Kobe"}',
							'{"name": "employee3", "id": 103, "city": "Kobe"}',
							'{"name": "employee4", "id": 104, "city": "Kobe"}',
							'{"name": "employee5", "id": 105, "city": "Kobe"}',
							'{"name": "employee6", "id": 106, "city": "Kobe"}']; 

		employeeList.forEach(
				employee => mondb.insertStr(personCollection, employee);
		);

	// Print out all deta in the database
		let personList = mondb.find(personCollection);		
		personList.forEach(
			person => resOut.println("&emsp;" + person.name + ", " + person.city + "<br />");
		);


// Find example:
	// Find example 1: find all data in the condition
		resOut.println("<h4>Find example: find someones' city are Tokyo and print out their information</h4>");

		let personList = mondb.find(personCollection, "{city: 'Tokyo'}");		
		personList.forEach(
			person => resOut.println("&emsp;" + person.name + ", " + person.city + "<br />");
		);

	// Find example 2: find only one data in the condition
		resOut.println("<h4>Find One example: find only one whose name is shinigamidee and print out their information</h4>" );
			
		let person = mondb.findOne(personCollection, "{name: 'shinigamidee'}");
		resOut.println("&emsp;" + person.name + ", " + person.city + "<br />");


// Update example:
	resOut.println("<h4>Update example: update city to Yokohama whose name is Bob and print out their information</h4>" );
	
	let person = mondb.findOne(personCollection, "{name: 'shinigamidee'}");

	person.city = 'Yokohama';

	mondb.update(personCollection, person);
	resOut.println("&emsp;" + person.name + ", " + person.city + "<br />");

%>