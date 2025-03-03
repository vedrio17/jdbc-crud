import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updation {
        public static void main(String[] args)throws ClassNotFoundException {
            String url="jdbc:mysql://localhost:3306/mydatabase";
            String username="root";
            String password="Pass@1234";
            String query="UPDATE employees " +
                    "SET job_title='Full_STACK_Developer', salary=70000.0 " +
                    "WHERE eid=2";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Inserted sucessfully");
            }catch (ClassNotFoundException e){
                System.out.println(e.getMessage());
            }

            try{
                Connection con= DriverManager.getConnection(url,username,password);
                System.out.println("Connected sucessfully");
                Statement st= con.createStatement();
                int rowsaddected =st.executeUpdate(query);
                if (rowsaddected>0){
                    System.out.println("Updated sucessdully");
                }else {
                    System.out.println("Updated failed");
                }
                st.close();
                con.close();
                System.out.println();
                System.out.println("Connection Closed sucessfully");
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

}
