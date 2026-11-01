import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExcel {

    public static void main(String[] args) {

        String filePath = "EmployeeFile.xlsx";

        String url = "jdbc:mysql://localhost:3306/nareshdb";
        String user = "root";
        String password = "Naresh@5021";

        // Do NOT insert id.
        // MySQL will generate the id automatically.
        String insertSQL =
                "INSERT INTO employees2 (name, salary) VALUES (?, ?)";

        try (
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = WorkbookFactory.create(fis);
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = con.prepareStatement(insertSQL)
        ) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Sheet sheet = workbook.getSheetAt(0);

            DataFormatter formatter = new DataFormatter();

            int rowNumber = 0;

            for (Row row : sheet) {

                // Skip header row
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                // Excel columns:
                // 0 = id
                // 1 = name
                // 2 = salary

                Cell nameCell = row.getCell(1);
                Cell salaryCell = row.getCell(2);

                if (nameCell == null || salaryCell == null) {
                    rowNumber++;
                    continue;
                }

                String name = formatter.formatCellValue(nameCell);
                String salaryText = formatter.formatCellValue(salaryCell);

                if (name.trim().isEmpty() || salaryText.trim().isEmpty()) {
                    rowNumber++;
                    continue;
                }

                double salary = Double.parseDouble(salaryText);

                pstmt.setString(1, name);
                pstmt.setDouble(2, salary);

                pstmt.executeUpdate();

                System.out.println(
                    "Inserted: Name=" + name +
                    ", Salary=" + salary
                );

                rowNumber++;
            }

            System.out.println("----------------------------------------");
            System.out.println("Excel data inserted successfully!");
            System.out.println("----------------------------------------");

        } catch (Exception e) {

            System.out.println("Error while inserting Excel data:");
            e.printStackTrace();
        }
    }
}