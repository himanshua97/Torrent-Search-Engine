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
</style>
</head>
<body>
<form class="example" action="TorrentMain_4.jsp" style="margin:auto;max-width:300px" method="GET" >
  <input type="text" placeholder="Search.." name="Name">
  <button type="submit" ><i class="fa fa-search"></i></button>
</form>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table>
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
            String Name = "", Seeds = "",Leeches=null, rating = "" , Links="";
            try {
                String key = request.getParameter("Name").toString();
               String sql="SELECT * FROM torrent4 where Name='"+key+"' or Name like'%"+key +"%' ";
               System.out.print(sql);
                DB.Connect.openConnection();
                DB.Connect.rs = DB.Connect.stat.executeQuery(sql);
                while (DB.Connect.rs.next()) {
                    Name = DB.Connect.rs.getString("Name");
                    Seeds = DB.Connect.rs.getString("Seeds");
                    Leeches = DB.Connect.rs.getString("Leeches");
                    rating=DB.Connect.rs.getString("rating");
                    Links= DB.Connect.rs.getString("Links");
                    String link="https://proxyfl.info"+Links;                
           
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
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>