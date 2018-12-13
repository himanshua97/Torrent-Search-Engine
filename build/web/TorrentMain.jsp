<!DOCTYPE html>
<html lang="en">
<head>
	<title>Table V04</title>
        
       <br>     
<h3><center><b>MSH TORRENT SEARCH ENGINE</b></center></h3>
<br>
<br>
<br>
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
    background-size: cover;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
}

* {
    box-sizing: border-box;
}

form.example input[type=text] {
    padding: 10px;
    font-size: 17px;
    border: 2px solid grey;
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
<body background="images/img.png">

<form class="example" action="TorrentMain_1.jsp" style="margin:auto;max-width:300px" method="GET" >
  <input type="text" placeholder="Search in Movies" name="Name">
  <button type="submit" ><i class="fa fa-search"></i></button>
</form>
    <br>
    <br>
    <div align="center">
        <h2>CATEGORY: MOVIES</h2>
        </div>
	<!--<div class="limiter">-->
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table id="myTable">
							<thead>
								<tr class="row100 head">
                                                        <th class="cell100 column1">Torrent Name</th>
									<th class="cell100 column2">Seeds</th>
									<th class="cell100 column3">Leeches</th>
                                                                        <th class="cell100 column4">Rating</th>
<!--									<th class="cell100 column5">Health</th>-->
								</tr>
							</thead>
						</table>
					</div>
                                     <%
                String Link = "", Name = "", Seeds = "", Leeches= null, rating = "";
                 try {

                // String userid = session.getAttribute("userid").toString();
                DB.Connect.openConnection();
                DB.Connect.rs =DB.Connect.stat.executeQuery("SELECT * FROM torrent2");
                while (DB.Connect.rs.next()) {
                    Link = DB.Connect.rs.getString("Links");
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
                                                                        
                                                                         <a href="<%=link%>"><% out.println(DB.Connect.rs.getString("Name"));%></a>
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
                 }
               
                catch (Exception e) {
                e.printStackTrace();
            }
          %>
						</table>
					</div>
				</div>
				
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

<!--===============================================================================================-->
	<script src="js/main.js"></script>

<form class="example" action="torrent_main3.jsp" style="margin:auto;max-width:300px" method="GET" >
  <input type="text" placeholder="Search in Games" name="Name">
  <button type="submit" ><i class="fa fa-search"></i></button>
</form>

<br>
<br>

<div align="center">
     <h2> CATEGORY : GAMES </h2>
</div>
    

<!--<div class="limiter">-->
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table id="myTable">
							<thead>
								<tr class="row100 head">
                                                        <th class="cell100 column1">Torrent Name</th>
									<th class="cell100 column2">Seeds</th>
									<th class="cell100 column3">Leeches</th>
                                                                        <th class="cell100 column4">Rating</th>
<!--									<th class="cell100 column5">Health</th>-->
								</tr>
							</thead>
						</table>
					</div>
                                     <%
               
                 try {

                // String userid = session.getAttribute("userid").toString();
                DB.Connect.openConnection();
                DB.Connect.rs =DB.Connect.stat.executeQuery("SELECT * FROM torrent3");
                while (DB.Connect.rs.next()) {
                    Link = DB.Connect.rs.getString("Links");
                    Name = DB.Connect.rs.getString("Name");
                    Seeds = DB.Connect.rs.getString("Seeds");
                    Leeches =DB.Connect.rs.getString("Leeches");
                    rating=DB.Connect.rs.getString("rating");
                   
                  String link="https://proxyfl.info"+Link;
                %>
               

					<div class="table100-body js-pscroll">
						<table>
							<tbody>
								<tr class="row100 body">
                                                                    <td class="cell100 column1">
                                                                        
                                                                         <a href="<%=link%>"><% out.println(DB.Connect.rs.getString("Name"));%></a>
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
                 }
               
                catch (Exception e) {
                e.printStackTrace();
            }
          %>
						</table>
					</div>
				</div>
				
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

<!--===============================================================================================-->
	<script src="js/main.js"></script>


<form class="example" action="TorrentMain_4.jsp" style="margin:auto;max-width:300px" method="GET" >
  <input type="text" placeholder="Search in Applications" name="Name">
  <button type="submit" ><i class="fa fa-search"></i></button>
</form>
    <br>
    <br>
    <div align="center">
        <h2>CATEGORY: APPLICATIONS</h2>
        </div>
	<!--<div class="limiter">-->
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table id="myTable">
							<thead>
								<tr class="row100 head">
                                                        <th class="cell100 column1">Torrent Name</th>
									<th class="cell100 column2">Seeds</th>
									<th class="cell100 column3">Leeches</th>
                                                                        <th class="cell100 column4">Rating</th>
<!--									<th class="cell100 column5">Health</th>-->
								</tr>
							</thead>
						</table>
					</div>
                                     <%
                 try {

                // String userid = session.getAttribute("userid").toString();
                DB.Connect.openConnection();
                DB.Connect.rs =DB.Connect.stat.executeQuery("SELECT * FROM torrent4");
                while (DB.Connect.rs.next()) {
                    Link = DB.Connect.rs.getString("Links");
                    Name = DB.Connect.rs.getString("Name");
                    Seeds = DB.Connect.rs.getString("Seeds");
                    Leeches =DB.Connect.rs.getString("Leeches");
                    rating=DB.Connect.rs.getString("rating");
                   
                  String link="https://proxyfl.info"+Link;
                %>
               

					<div class="table100-body js-pscroll">
						<table>
							<tbody>
								<tr class="row100 body">
                                                                    <td class="cell100 column1">
                                                                        
                                                                         <a href="<%=link%>"><% out.println(DB.Connect.rs.getString("Name"));%></a>
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
                 }
               
                catch (Exception e) {
                e.printStackTrace();
            }
          %>
						</table>
					</div>
				</div>
				
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

<!--===============================================================================================-->
	<script src="js/main.js"></script>






</body>
</html>