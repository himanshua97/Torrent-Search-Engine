package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TorrentMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Table V04</title>\n");
      out.write("        \n");
      out.write("       <br>     \n");
      out.write("<h3><center><b>MSH TORRENT SEARCH ENGINE</b></center></h3>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("    font-family: Arial;\n");
      out.write("    background-size: cover;\n");
      out.write("        -webkit-background-size: cover;\n");
      out.write("        -moz-background-size: cover;\n");
      out.write("        -o-background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example input[type=text] {\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 17px;\n");
      out.write("    border: 2px solid grey;\n");
      out.write("    float: left;\n");
      out.write("    width: 80%;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example button {\n");
      out.write("    float: left;\n");
      out.write("    width: 20%;\n");
      out.write("    padding: 10px;\n");
      out.write("    background: #2196F3;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 17px;\n");
      out.write("    border: 1px solid grey;\n");
      out.write("    border-left: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example button:hover {\n");
      out.write("    background: #0b7dda;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example::after {\n");
      out.write("    content: \"\";\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write("th {\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"images/img.png\">\n");
      out.write("\n");
      out.write("<form class=\"example\" action=\"TorrentMain_1.jsp\" style=\"margin:auto;max-width:300px\" method=\"GET\" >\n");
      out.write("  <input type=\"text\" placeholder=\"Search in Movies\" name=\"Name\">\n");
      out.write("  <button type=\"submit\" ><i class=\"fa fa-search\"></i></button>\n");
      out.write("</form>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div align=\"center\">\n");
      out.write("        <h2>CATEGORY: MOVIES</h2>\n");
      out.write("        </div>\n");
      out.write("\t<!--<div class=\"limiter\">-->\n");
      out.write("\t\t<div class=\"container-table100\">\n");
      out.write("\t\t\t<div class=\"wrap-table100\">\n");
      out.write("\t\t\t\t<div class=\"table100 ver1 m-b-110\">\n");
      out.write("\t\t\t\t\t<div class=\"table100-head\">\n");
      out.write("\t\t\t\t\t\t<table id=\"myTable\">\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"row100 head\">\n");
      out.write("                                                        <th class=\"cell100 column1\">Torrent Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"cell100 column2\">Seeds</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"cell100 column3\">Leeches</th>\n");
      out.write("                                                                        <th class=\"cell100 column4\">Rating</th>\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t<th class=\"cell100 column5\">Health</th>-->\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                     ");

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
                
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"table100-body js-pscroll\">\n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"row100 body\">\n");
      out.write("                                                                    <td class=\"cell100 column1\">\n");
      out.write("                                                                        \n");
      out.write("                                                                         <a href=\"");
      out.print(link);
      out.write('"');
      out.write('>');
 out.println(DB.Connect.rs.getString("Name"));
      out.write("</a>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column2\">\n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("Seeds"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column3\">\n");
      out.write("                                                                        \n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("Leeches"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column4\">\n");
      out.write("                                                                        \n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("rating"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("                                                        \n");
      out.write("                                                         ");

                }
                 }
               
                catch (Exception e) {
                e.printStackTrace();
            }
          
      out.write("\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                                                \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('.js-pscroll').each(function(){\n");
      out.write("\t\t\tvar ps = new PerfectScrollbar(this);\n");
      out.write("\n");
      out.write("\t\t\t$(window).on('resize', function(){\n");
      out.write("\t\t\t\tps.update();\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("<form class=\"example\" action=\"torrent_main3.jsp\" style=\"margin:auto;max-width:300px\" method=\"GET\" >\n");
      out.write("  <input type=\"text\" placeholder=\"Search in Games\" name=\"Name\">\n");
      out.write("  <button type=\"submit\" ><i class=\"fa fa-search\"></i></button>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("     <h2> CATEGORY : GAMES </h2>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!--<div class=\"limiter\">-->\n");
      out.write("\t\t<div class=\"container-table100\">\n");
      out.write("\t\t\t<div class=\"wrap-table100\">\n");
      out.write("\t\t\t\t<div class=\"table100 ver1 m-b-110\">\n");
      out.write("\t\t\t\t\t<div class=\"table100-head\">\n");
      out.write("\t\t\t\t\t\t<table id=\"myTable\">\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"row100 head\">\n");
      out.write("                                                        <th class=\"cell100 column1\">Torrent Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"cell100 column2\">Seeds</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"cell100 column3\">Leeches</th>\n");
      out.write("                                                                        <th class=\"cell100 column4\">Rating</th>\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t<th class=\"cell100 column5\">Health</th>-->\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                     ");

               
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
                
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"table100-body js-pscroll\">\n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"row100 body\">\n");
      out.write("                                                                    <td class=\"cell100 column1\">\n");
      out.write("                                                                        \n");
      out.write("                                                                         <a href=\"");
      out.print(link);
      out.write('"');
      out.write('>');
 out.println(DB.Connect.rs.getString("Name"));
      out.write("</a>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column2\">\n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("Seeds"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column3\">\n");
      out.write("                                                                        \n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("Leeches"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column4\">\n");
      out.write("                                                                        \n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("rating"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("                                                        \n");
      out.write("                                                         ");

                }
                 }
               
                catch (Exception e) {
                e.printStackTrace();
            }
          
      out.write("\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                                                \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('.js-pscroll').each(function(){\n");
      out.write("\t\t\tvar ps = new PerfectScrollbar(this);\n");
      out.write("\n");
      out.write("\t\t\t$(window).on('resize', function(){\n");
      out.write("\t\t\t\tps.update();\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form class=\"example\" action=\"TorrentMain_4.jsp\" style=\"margin:auto;max-width:300px\" method=\"GET\" >\n");
      out.write("  <input type=\"text\" placeholder=\"Search in Applications\" name=\"Name\">\n");
      out.write("  <button type=\"submit\" ><i class=\"fa fa-search\"></i></button>\n");
      out.write("</form>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div align=\"center\">\n");
      out.write("        <h2>CATEGORY: APPLICATIONS</h2>\n");
      out.write("        </div>\n");
      out.write("\t<!--<div class=\"limiter\">-->\n");
      out.write("\t\t<div class=\"container-table100\">\n");
      out.write("\t\t\t<div class=\"wrap-table100\">\n");
      out.write("\t\t\t\t<div class=\"table100 ver1 m-b-110\">\n");
      out.write("\t\t\t\t\t<div class=\"table100-head\">\n");
      out.write("\t\t\t\t\t\t<table id=\"myTable\">\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"row100 head\">\n");
      out.write("                                                        <th class=\"cell100 column1\">Torrent Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"cell100 column2\">Seeds</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"cell100 column3\">Leeches</th>\n");
      out.write("                                                                        <th class=\"cell100 column4\">Rating</th>\n");
      out.write("<!--\t\t\t\t\t\t\t\t\t<th class=\"cell100 column5\">Health</th>-->\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                     ");

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
                
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"table100-body js-pscroll\">\n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"row100 body\">\n");
      out.write("                                                                    <td class=\"cell100 column1\">\n");
      out.write("                                                                        \n");
      out.write("                                                                         <a href=\"");
      out.print(link);
      out.write('"');
      out.write('>');
 out.println(DB.Connect.rs.getString("Name"));
      out.write("</a>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column2\">\n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("Seeds"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column3\">\n");
      out.write("                                                                        \n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("Leeches"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td class=\"cell100 column4\">\n");
      out.write("                                                                        \n");
      out.write("                                                                        ");
 out.println(DB.Connect.rs.getString("rating"));
      out.write("\n");
      out.write("                                                                    </td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("                                                        \n");
      out.write("                                                         ");

                }
                 }
               
                catch (Exception e) {
                e.printStackTrace();
            }
          
      out.write("\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                                                \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('.js-pscroll').each(function(){\n");
      out.write("\t\t\tvar ps = new PerfectScrollbar(this);\n");
      out.write("\n");
      out.write("\t\t\t$(window).on('resize', function(){\n");
      out.write("\t\t\t\tps.update();\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
