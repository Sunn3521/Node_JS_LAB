import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class updateDataExample{
    public static void main(String[] args){
        //Database URL
        String url = "jdbc:mysql://localhost:3306/mysql";
        //Database Credentials
        String user="root";
        String password="root";
        //SQL Update Query
        String query="update student set name=?,course=? where id=?";
         try{
            //Establish Connection
            Connection conn=DriverManager.getConnection(url,user,password);
            //Create prepared statement
            PreparedStatement pstmt=conn.prepareStatement(query);
            //set new values
            pstmt.setString(1,"sam");
            pstmt.setString(2,"it");
            //condition value
            pstmt.setInt(3,1);
            //Execute update
            int rowsUpdated=pstmt.executeUpdate();
            if(rowsUpdated>0){
                System.out.println("Data Updated Successfully");
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
