import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String userName = "root";
        String password = "Pass@1234";
        String path = "jdbc:mysql://localhost:3306/students";
        Connection con = null;

        try {
            con = DriverManager.getConnection(path, userName, password);
            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            System.out.println("Error establishing connection: " + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}
