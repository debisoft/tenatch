
<%@page content_type="text/html; charset=ISO-8859-1"%>
<nsp:PageTemplate template_url="template_for_todo.tsp">

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

<%!-- ********************************************************* --%>
<%!-- Database connection --%>
<%!-- Connect to database and find data to render --%>
<%
// Database connection
	// Connect to the database
		let mdb = mondb.connectDB('tester', "sample_training");

	// Get the collection
		let todoCollection = mdb.getCollection("todoList");

  // find the data    
    let doList = todoCollection.find("{status: 'do'}").sort("{due: 1}").map(mondb.makeJSON);
    let doneList = todoCollection.find("{status: 'done'}").sort("{due: 1}").map(mondb.makeJSON);
%>  

<div class="container">
  <div class="input-area">
    <h4 class="title">Add New Items</h4>
    <form method="POST" action="todo_process1_add.tsp">
      <div>
        <input type='text' name='input1'  placeholder='Enter your new task' required>
        <br/>
        <input type="date" name='input1Date' required>
        <br/>
        <input type="submit" value="Add">
        <br/>
      </div>
    </form>
  </div>

  <div class="todo-area">
    <h4 class="title">Todo</h4>
    <div class="list">
      <%
        let itemCounter = 1;
        doList.forEach(
          item => {
            resOut.println("&emsp;" + itemCounter + ": &emsp;" + item.due + "&emsp;" + item.name + "<br />");
            itemCounter++;
          }
        );            
      %>
    </div>

    <div class="input-area">
      <form method="POST" action="todo_process2_complete.tsp">
        <div>
          <input type='number' name='input2'  placeholder='Finished task No.' required>
          <input type="submit" value="Done"><br/>
        </div>
      </form>
    </div>
  </div>

  <div class="done-area">
    <h4 class="title">Done</h4>
    <div class="list">
      <%
        let itemCounter = 1; 
          doneList.forEach(
            item => {
              resOut.println("&emsp;" + itemCounter + ": &emsp;" + item.due + "&emsp;" + item.name + "<br />");
                itemCounter++;
            }
		      );       
      %>

      <div class="input-area">
        <form method="GET" action="todo_process3_sort.tsp">
          <div>
           <input type="submit" value="Sort by date"><br/>     
          </div>
        </form>
        <form method="GET" action="todo_process4_delete.tsp">
          <div>
            <input type="submit" value="Delete all completed tasks"><br/>         
          </div>
        </form>
      </div>
  </div><br/><br/>


  </div>

</div>
</nsp:PageTemplate>