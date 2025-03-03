import java.sql.*;
public class retrivebasic {
    public static void main(String[] args)throws ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="Pass@1234";
        String query="select*from employees";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded sucessfully ");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connnection establish sucessfully");
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query);
            while (rs.next()){
                int id=rs.getInt("eid");
                String name=rs.getString("name");
                String job_title=rs.getString("job_title");
                Double salary=rs.getDouble("salary");
                System.out.println();
                System.out.println("=====================");
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Job_Title: "+job_title);
                System.out.println("Salary: "+salary);



            }
            rs.close();
            st.close();
            con.close();
            System.out.println();
            System.out.println("Connection cloased sucessfully");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
