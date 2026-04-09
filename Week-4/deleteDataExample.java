import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class deleteDataExample{
    public static void main(String[] args){
        //Database URL
        String url = "jdbc:mysql://localhost:3306/mysql";
        //Database Credentials
        String user="root";
        String password="root";
        //SQL Update Query
        String query="delete from student where id=?";
         try{
            //Establish Connection
            Connection conn=DriverManager.getConnection(url,user,password);
            //Create prepared statement
            PreparedStatement pstmt=conn.prepareStatement(query);
            //condition value
            pstmt.setInt(1,1);
            //Execute delete
            int rowsDeleted=pstmt.executeUpdate();
            if(rowsDeleted>0){
                System.out.println("Data deleted Successfully");
            }
            else{
                System.out.println("No record found with given ID");                
            }
            //close resources
            pstmt.close();
            conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
