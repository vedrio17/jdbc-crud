import java.sql.*;
public class insertion {
    public static void main(String[] args)throws ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="Pass@1234";
        String query="INSERT INTO employees(eid,name,job_title,salary)VALUES(4,'Yash','React Developer',60000.0);";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded sucessfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
           Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("connection establish successfully !!");
            Statement st= con.createStatement();
            int rowsaffected=st.executeUpdate(query);
            if (rowsaffected>0){
                System.out.println("Insert sucessfully "+rowsaffected+" rows affected");
            }else{
                System.out.println("Insertion failed");
            }

            st.close();
            con.close();
            System.out.println("Connection  closed sucessfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
