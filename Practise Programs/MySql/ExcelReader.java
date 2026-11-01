import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class ExcelReader {

    public static void main(String[] args) {

        String filePath = "EmployeeFile.xlsx";

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {

                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}