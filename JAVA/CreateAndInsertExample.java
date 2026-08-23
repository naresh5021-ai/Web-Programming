import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateAndInsertExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nareshdb"; // your DB name
        String user = "root"; // your MySQL username
        String password = "Naresh@5021"; // your MySQL password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // Step 1: Create a new table
            String createTable = "CREATE TABLE IF NOT EXISTS employees2 (" +
                                 "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "name VARCHAR(50), " +
                                 "salary DOUBLE)";
            stmt.executeUpdate(createTable);
            System.out.println("Table created successfully!");

            // Step 2: Insert values into the table
            String insert1 = "INSERT INTO employees2 (name, salary) VALUES ('Alice', 50000)";
            String insert2 = "INSERT INTO employees2 (name, salary) VALUES ('Bob', 60000)";
            String insert3 = "INSERT INTO employees2 (name, salary) VALUES ('Charlie', 55000)";

            stmt.executeUpdate(insert1);
            stmt.executeUpdate(insert2);
            stmt.executeUpdate(insert3);

            System.out.println("Values inserted successfully!");

            // Close connection
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
