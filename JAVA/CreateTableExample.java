import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nareshdb";
        String user = "root";
        String password = "Naresh@5021";

        try {
            // Load Driver (optional in modern JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL to create table
            String sql = "CREATE TABLE employees (" +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(50), " +
                         "salary DOUBLE)";

            stmt.executeUpdate(sql);
            System.out.println("Table created successfully!");

            // Close connection
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
