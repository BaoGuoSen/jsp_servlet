package sqlTest;
  
  import java.sql.*;
  
  public class sqltest {
  public static void main(String [] args)
   {
    String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Teacher";
   String userName="sa";
   String userPwd="forgiveme1998";
  try
 {
     Class.forName(driverName);
     System.out.println("加载驱动成功！");
 }catch(Exception e){
     e.printStackTrace();
     System.out.println("加载驱动失败！");
 }
 try{     Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
         System.out.println("连接数据库成功！");
 }catch(Exception e)
 {
     e.printStackTrace();
     System.out.print("SQL Server连接失败！");
 }        
 
   }
 }