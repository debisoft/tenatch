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
</style>

<%!-- ********************************************************* --%>
<%!-- Connect to database and add new task to todo_tbl --%>
<div class="todo-area">
  <h4 class="title">The Task has been added</h4>
  <div class="list">
  <%
    // Database connection
    // Connect to the database
      let mdb = mondb.connectDB('tester', "sample_training");

    // Get the collection
      let todoCollection = mdb.getCollection("todoList");
      
    // Add new task  
      let newTask = request.getReqParam('input1');
      let newTaskDue = request.getReqParam('input1Date');

      if(newTask != null){
        mondb.insertStr(todoCollection, '{"name": "' + newTask +'", "due": "' + newTaskDue +'" ,"status": "do"}');
        resOut.println(newTaskDue + "&emsp;" + newTask + "<br />");
      }else{
        resOut.println("Please enter your task");
      }
   %>
  </div><br/><br/>
  
  <div class="input-area">
    <form method="GET" action="todo.tsp">
      <div>
        <input type="submit" value="Return to the list"><br/>
      </div>
    </form>
  </div>
</div>

</nsp:PageTemplate>