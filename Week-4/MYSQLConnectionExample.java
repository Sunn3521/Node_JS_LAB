import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MYSQLConnectionExample{
    public static void main(String[] args){
        //Database URL
        String url = "jdbc:mysql://localhost:3306/mysql";
        //Database Credentials
        String user="root";
        String password="root";
        Connection conn=null;
        try{
            //Establish Connection
            conn=DriverManager.getConnection(url,user,password);
            System.out.println("Connected to the MYSQL database successfully!!");
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
        finally{
            //close connection
            try{
                if(conn!=null){
                    conn.close();
                    System.out.println("Connection closed!");
                }
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}