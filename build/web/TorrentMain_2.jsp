<!DOCTYPE html>
<html lang="en">
<head>

	<title>Table V04</title> 
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
<style>
body {
    font-family: Arial;
}

* {
    box-sizing: border-box;
}

form.example input[type=text] {
    padding: 10px;
    font-size: 17px;
    border: 1px solid grey;
    float: left;
    width: 80%;
    background: #f1f1f1;
}

form.example button {
    float: left;
    width: 20%;
    padding: 10px;
    background: #2196F3;
    color: white;
    font-size: 17px;
    border: 1px solid grey;
    border-left: none;
    cursor: pointer;
}

form.example button:hover {
    background: #0b7dda;
}

form.example::after {
    content: "";
    clear: both;
    display: table;
}
th {
    cursor: pointer;
}

th, td {
    text-align: left;
    padding: 16px;
}



</style>
</head>
<body>
<form class="example" action="TorrentMain_1.jsp" style="margin:auto;max-width:300px" method="GET" >
  <input type="text" placeholder="Search.." name="Name">
  <button type="submit" ><i class="fa fa-search"></i></button>
</form>
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table id="myTable">
							<thead>
								<tr class="row100 head">
                                                                    <th class="cell100 column1"><a href=TorrentMain_2.jsp>Torrent Name</th></a>
									<th onclick="sortTable(1)" class="cell100 column2">Seeds</th>
									<th class="cell100 column3">Leeches</th>
									<th class="cell100 column4">Rating</th>
<!--									<th class="cell100 column5">Health</th>-->
								</tr>
							</thead>
						</table>
					</div>
                                     <%
                String Name = "", Seeds = "", Leeches= null, rating = "";
                 try {

                // String userid = session.getAttribute("userid").toString();
                DB.Connect.openConnection();
                DB.Connect.rs =DB.Connect.stat.executeQuery("SELECT * FROM torrent2"+" ORDER BY Seeds ASC");
                while (DB.Connect.rs.next()) 
                    Name = DB.Connect.rs.getString("Name");
                    Seeds = DB.Connect.rs.getString("Seeds");
                    Leeches =DB.Connect.rs.getString("Leeches");
                    rating=DB.Connect.rs.getString("rating");
                   
                  String link="index.jsp?value="+Name;
                %>
               

					<div class="table100-body js-pscroll">
						<table>
							<tbody>
								<tr class="row100 body">
                                                                    <td class="cell100 column1">
                                                                        
                                                                         <a href=<%=link%>><% out.println(DB.Connect.rs.getString("Name"));%></a>
                                                                    </td>
                                                                    <td class="cell100 column2">
                                                                        <% out.println(DB.Connect.rs.getString("Seeds"));%>
                                                                    </td>
                                                                    <td class="cell100 column3">
                                                                        
                                                                        <% out.println(DB.Connect.rs.getString("Leeches"));%>
                                                                    </td>
                                                                    <td class="cell100 column4">
                                                                        
                                                                        <% out.println(DB.Connect.rs.getString("rating"));%>
                                                                    </td>
								</tr>

							</tbody>
                                                        
            <%
                }
             
               
                catch (Exception e) {
                e.printStackTrace();
            }
          %>
						</table>
					</div>
				</div>
				
				


<!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function(){
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function(){
				ps.update();
			})
		});
			
		
	</script>

<script>
function sortTable(n) 
{
  var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
  table = document.getElementById("myTable");
  switching = true;
  //Set the sorting direction to ascending:
  dir = "asc"; 
  /*Make a loop that will continue until
  no switching has been done:*/
  while (switching) {
    //start by saying: no switching is done:
    switching = false;
    rows = table.getElementsByTagName("TR");
    /*Loop through all table rows (except the
    first, which contains table headers):*/
    for (i = 1; i < (rows.length - 1); i++) {
      //start by saying there should be no switching:
      shouldSwitch = false;
      /*Get the two elements you want to compare,
      one from current row and one from the next:*/
      x = rows[i].getElementsByTagName("TD")[n];
      y = rows[i + 1].getElementsByTagName("TD")[n];
      /*check if the two rows should switch place,
      based on the direction, asc or desc:*/
      if (dir == "asc") {
        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
          //if so, mark as a switch and break the loop:
          shouldSwitch= true;
          break;
        }
      } else if (dir == "desc") {
        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
          //if so, mark as a switch and break the loop:
          shouldSwitch= true;
          break;
        }
      }
    }
    if (shouldSwitch) {
      /*If a switch has been marked, make the switch
      and mark that a switch has been done:*/
      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
      switching = true;
      //Each time a switch is done, increase this count by 1:
      switchcount ++;      
    } else {
      /*If no switching has been done AND the direction is "asc",
      set the direction to "desc" and run the while loop again.*/
      if (switchcount == 0 && dir == "asc") {
        dir = "desc";
        switching = true;
      }
    }
  }
}
</script>

<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>