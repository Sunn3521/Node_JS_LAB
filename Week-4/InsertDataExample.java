import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertDataExample{
    public static void main(String[] args){
        //Database URL
        String url = "jdbc:mysql://localhost:3306/mysql";
        //Database Credentials
        String user="root";
        String password="root";
        //SQL input Query
        String query="insert into student(id,name,course) values(?,?,?)";
         try{
            //Establish Connection
            Connection conn=DriverManager.getConnection(url,user,password);
            //Create prepared statement
            PreparedStatement pstmt=conn.prepareStatement(query);
            //set values
            pstmt.setInt(1,1);
            pstmt.setString(2,"John");
            pstmt.setString(3,"cse");
            //Execute query
            int rowsInserted=pstmt.executeUpdate();
            if(rowsInserted>0){
                System.out.println("Data Inserted Successfully");
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