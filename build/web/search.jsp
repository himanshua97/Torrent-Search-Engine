<%@page import="java.io.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TORRENT PAGE</title>
<!--        <form>
  Search torrent: <input type="text" name="torrentname"><br>
  <input type="submit" value="search">
        </form>-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
<form class="example" action="search.jsp" style="margin:auto;max-width:300px" method="GET">
  <input type="text" placeholder="Search.." name="Name">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>

    <center>
         <h2>TORRENTS TO DOWNLOAD</h2>
         <table width = "100%" border = "2" align = "center">
            <tr bgcolor = "#AEB6BF ">
               <th>TORRENT NAME</th>
               <th>SEEDS</th>
               <th>LEECHES</th>
               <th>RATING</th>
            </tr>
            <%
            String Name = "", Seeds = "",Leeches=null, rating = "", Link="" ;
            try {
                String key = request.getParameter("Name").toString();
               String sql="SELECT * FROM torrent2 where Name='"+key+"' or Name like'%"+key +"%' ";
               System.out.print(sql);
                DB.Connect.openConnection();
                DB.Connect.rs = DB.Connect.stat.executeQuery(sql);
                while (DB.Connect.rs.next()) {
                    Name = DB.Connect.rs.getString("Name");
                    Seeds = DB.Connect.rs.getString("Seeds");
                    Leeches = DB.Connect.rs.getString("Leeches");
                    rating=DB.Connect.rs.getString("rating");
                    Link=DB.Connect.rs.getString("Links");
                    String link="https://proxyfl.info"+Link;
           
                %>
                 <tr>
        <td height="28" bordercolor="#20450A" bgcolor="#E9DDD6" >
        <span class="style6">
        
           <a href=<%=link%>><% out.println(DB.Connect.rs.getString("Name"));%></a>
        </span></td>
      <td bordercolor="#20450A" bgcolor="#E9DDD6" ><span class="style6">
          <% out.println(DB.Connect.rs.getString("Seeds"));%>
        </span></td>
        <td bordercolor="#20450A" bgcolor="#E9DDD6" ><span class="style6">
          <% out.println(DB.Connect.rs.getString("Leeches"));%>
        </span></td>
        <td bordercolor="#20450A" bgcolor="#E9DDD6"><span class="style6">
          <% out.println(DB.Connect.rs.getString("rating"));%>
        </span></td>
      
      </tr>
                 

               
            <%
                }
                 }
                 
                catch (Exception e) {
                e.printStackTrace();
            }
          %>
         </table>
        
    </body>
</html>