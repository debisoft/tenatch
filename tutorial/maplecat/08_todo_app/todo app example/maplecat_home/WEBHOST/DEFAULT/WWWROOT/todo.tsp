<%@page content_type="text/html; charset=ISO-8859-1"%>
<nsp:PageTemplate template_url="template_for_todo.tsp">

<%


// Database connection
	// Connect to the database
		let mdb = mondb.connectDB('tester', "sample_training");

	//Get the collection
		let todoCollection = mdb.getCollection("todoList");

    let doList = mondb.find(todoCollection, "{status: 'do'}");
    let doneList = mondb.find(todoCollection, "{status: 'done'}");

%>



<style type="text/css">
  .title{
    color: #79e0f2;
    font-family: "lucida sans unicode", "lucida grande", sans-serif;
    font-size: 18px;
    font-weight: bold;
    text-transform: uppercase;
    letter-spacing: 0.8pt;
   }

   .list{
     font-family: "lucida sans unicode", "lucida grande", sans-serif;
     font-size: 12px;
     letter-spacing: 0.8pt;
     line-height: 1.8;
   }

   .container {
    display: grid;
    padding-top:20px;
    grid-template-columns: repeat(2, 1fr) 0fr repeat(2, 1fr);
    grid-column-gap: 9px;
    grid-row-gap: 5px;
    }

    .input-area { grid-area: 1 / 1 / 3 / 6; }
    .todo-area { grid-area: 3 / 1 / 5 / 3; }
    .done-area { grid-area: 3 / 4 / 5 / 6; }

    input{padding: 5px; margin:5px}
</style>


<div class="container">

  <div class="input-area">
    <h4 class="title">Add New Items</h4>
    <form method="POST" action="todo_process1.tsp">
      <div>
        <input type='text' name='input1'  placeholder='Enter your new task'>
        <br/>
        <input type="date" name='input1Date' >
        <br/>
        <input type="submit" value="Add">
        <br/>
      </div>
    </form>
  </div>

  <div class="todo-area">
    <h4 class="title">Todo Items</h4>
    <div class="list">
      <%

        let itemCounter = 1;

        doList.forEach(
          item => {resOut.println("&emsp;" + itemCounter + ": &emsp;" + item.name + ", " + item.due + "<br />");
          itemCounter++;}
        );  

            
      %>
    </div>

    <div class="input-area">
      <form method="POST" action="todo_process2.tsp">
        <div>
          <input type='text' name='input2'  placeholder='Enter finished task No.'>
          <input type="submit" value="Done"><br/>
        </div>
      </form>
    </div>
  </div>

  <div class="done-area">
    <h4 class="title">Done Items</h4>
    <div class="list">
      <%
        let itemCounter = 1;
        doneList.forEach(
		    	item => {resOut.println("&emsp;" + itemCounter + ": &emsp;" + item.name + ", " + item.due + "<br />");
          itemCounter++;}
		    );
      %>
    </div><br/><br/>


  </div>

</div>
</nsp:PageTemplate>