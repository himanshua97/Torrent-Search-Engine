package DB;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class Connect {

    public static Connection conn = null;
    public static Statement stat=null,stat_read1 = null,stat_read2=null,stat_read3=null,stat1234_read=null;
    public static ResultSet rs1,rs2;
    static PreparedStatement ps = null;
    public static ResultSet rs = null;
    static String rdate = "";
    static String rtime = "";

    public static Connection openConnection() {
        try {
            System.out.println("02");
           // Class.forName("com.mysql.jdbc.Driver");
             if(conn==null){
             Class.forName("com.mysql.jdbc.Driver").newInstance();

     conn = DriverManager.getConnection("jdbc:mysql://localhost/torrent?user='root'&password=");
         //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhellow_ping","myhellow_ping","[HxMe#@P%H=P");
   System.out.println("max conn "+conn.getMetaData().getMaxConnections());
           stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat_read1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat_read2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stat1234_read = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        //check=true;
            System.out.println("Connection done");
            }else{
                 try {
                       conn = DriverManager.getConnection("jdbc:mysql://localhost/torrent?user='root'&password=");
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             System.out.println("max conn "+conn.getMetaData().getMaxConnections());
                  stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat_read1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stat_read2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stat1234_read = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println("Connection alreaDY done");
            }
           rs=stat.executeQuery("SHOW STATUS WHERE `variable_name` = 'Threads_connected'");
           if(rs.next()){
             System.out.println("Total connection="+rs.getString(1));
           }
            rdate = getDate();
            rtime = getTime();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return conn;
    }

  
 

    public static void closeConnection() {
        try {
           // stat.close();
            //conn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

 

    public static String getField(String tblname, String field, String matching_field, String value, String operator) {
        openConnection();
        String i = "";
        try {
            rs = stat.executeQuery("select " + field + " from " + tblname + " where " + matching_field + "" + operator + "'" + value + "'");
            if (rs.next()) {
                i = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }

   

   

    public static int updateField(String tblname, String field, String value, String matching_field, String matching_value) {
        int i = 0;
        conn = openConnection();
        try {
            String sql = "update " + tblname + " set " + field + "='" + value + "' where " + matching_field + "='" + matching_value + "' ";
            System.out.print("sql=" + sql);
            ps = conn.prepareStatement(sql);//to update
            i = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }

   

   

    public static int saveUsers(String Name, String Seeds, String Leeches, String rating, String Links) {
        
        int i = 0;
        try {
            String sql = "insert into torrent2 (Name,Seeds,Leeches,rating,Links)values(?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Name);
            statement.setString(2, Seeds);
            statement.setString(3, Leeches);
            statement.setString(4, rating);
            statement.setString(5,Links);
            
          
            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return i;
    }
    
       public static int saveUsers2(String Name, String Seeds, String Leeches, String rating, String Links) {
        
        int i = 0;
        try {
            String sql = "insert into torrent4 (Name,Seeds,Leeches,rating,Links)values(?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Name);
            statement.setString(2, Seeds);
            statement.setString(3, Leeches);
            statement.setString(4, rating);
            statement.setString(5,Links);
            
          
            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return i;
    }
    
    
    
    
      
    public static int saveUsers3(String Name, String Seeds, String Leeches, String rating, String Links) {
        
        int i = 0;
        try {
            String sql = "insert into torrent4 (Name,Seeds,Leeches,rating,Links)values(?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Name);
            statement.setString(2, Seeds);
            statement.setString(3, Leeches);
            statement.setString(4, rating);
            statement.setString(5,Links);
            
          
            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return i;
    }
    
    public static int updateUser(String userid, String name, String dob, String email, String password,
            String aadhar_no, String image, String phone) {
        openConnection();
        int i = 0;
        try {
            String sql = "update tbluser set name=?,dob=?,email=?,password=?,aadhar_no=?,image=?,phone=? where userid=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, dob);
          
            statement.setString(3, email);
            statement.setString(4, password);
            statement.setString(5, aadhar_no);
            statement.setString(6, image);
            statement.setString(7, phone);
            statement.setString(8, userid);
            
           

            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       closeConnection();
        return i;
    }
   
   
  
    public static int saveLocation(String location_name, String latitude, String longitude, String location_desc, String location_saver) {
        openConnection();
        int i = 0;
        try {
            String sql = "insert into location (location_name,latitude,longitude,location_desc,location_saver)values(?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, location_name);
            statement.setString(2, latitude);
            statement.setString(3, longitude);
            statement.setString(4, location_desc);
            statement.setString(5, location_saver);


            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }
    public static int deleteFab( String userid, String ref) {
        openConnection();
        int i = 0;
        try {
            String sql = "delete from tblfab where userid='"+userid+"' and reference='"+ref+"'";
            PreparedStatement statement = conn.prepareStatement(sql);
            


            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }
    public static int saveComment(String userid, String comment,String resid) {
        openConnection();
        int i = 0;
        try {
            System.err.println("resid="+resid.length());
            String sql = "insert into tblcomment (userid,comment,rdate,resid)values(?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, userid);
            statement.setString(2, comment);
            statement.setString(3, getDateTime());
            statement.setString(4, resid);
        


            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }
     public static int saveFab(String userid, String resid,String name,String reference) {
        openConnection();
        int i = 0;
        try {
            System.err.println("resid="+resid.length());
            String sql = "insert into tblfab (userid,resid,name,reference)values(?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, userid);         
            statement.setString(2, resid);
            statement.setString(3, name);
            statement.setString(4, reference);
        


            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }
    public static int saveLocationFile(String filename, String userid) {
        openConnection();
        int i = 0;
        try {
            String sql = "insert into tbllocationfiles (filename,userid,rdate)values(?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, filename);
            statement.setString(2, userid);
            statement.setString(3, getDateTime());
        


            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }
    public static int shareFile(String filename, String userid,String fuserid) {
        openConnection();
        int i = 0;
        try {
            String sql = "insert into tblshare (filename,userid,rdate,fuserid)values(?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, filename);
            statement.setString(2, userid);
            statement.setString(3, getDateTime());
            statement.setString(4, fuserid);
        


            i = statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
        return i;
    }

    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat(
                "yyyy/MM/dd:hh:mm:ss");

        Calendar cal = Calendar.getInstance();

        return dateFormat.format(cal.getTime());// "11/03/14 12:33:43";
    }
  

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();

        return dateFormat.format(cal.getTime());// "11/03/14 12:33:43";
    }

    public static String getTime() {
        DateFormat dateFormat1 = new SimpleDateFormat(
                "HH:mm:ss");

        Calendar cal = Calendar.getInstance();

        return dateFormat1.format(cal.getTime());// "11/03/14 12:33:43";
    }
}
