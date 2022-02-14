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
<%!-- Database connection --%>
  <%
  // Database connection
    // Connect to the database
      let mdb = mondb.connectDB('tester', "sample_training");

    //Get the collection
      let todoCollection = mdb.getCollection("todoList");
  %>


<%!-- ********************************************************* --%>
<%!-- Connect to database and update finished task to done --%>
  <div class="done-area">
    <h4 class="title">The Task has been completed</h4>
      <div class="list">

      <%
        var doneNo = Number(request.getReqParam("input2"));
        doneNo--;
  
        let doList = todoCollection.find("{status: 'do'}").map(mondb.makeJSON);

        let itemCounter = 0;
        doList.forEach(
            item => {
              if(itemCounter == doneNo){
                resOut.println(item.due + "&emsp;" + item.name + "<br />");
                item.status="done";
                mondb.update(todoCollection, item);
              }    
              itemCounter++;
            }
        );   
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