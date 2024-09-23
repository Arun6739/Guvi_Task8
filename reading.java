package Task_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading {
    public static void main(String[] args) {
        String filePath = "E:\\poi-bin-5.2.3-20220909\\Task-8.xlsx";  // File path

        ArrayList<String[]> dl = new ArrayList<>();  // List to store data

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             XSSFWorkbook wb = new XSSFWorkbook(fileInputStream)) {

            // Reading the "Sheet1" from the workbook
            XSSFSheet Task_8 = wb.getSheet("Sheet1");

            // Loop through rows and store the data
            for (Row row : Task_8) {
                String[] rowData = new String[row.getLastCellNum()]; 
                for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                    rowData[colNum] = row.getCell(colNum).toString(); 
                }
                dl.add(rowData); 
            }

            // Print the data without logging individual cells
            for (int i = 1; i < dl.size(); i++) {  // Skip the header row
                String[] row = dl.get(i);
                System.out.println(String.join(", ", row));  // Print in the desired format
            }

        } catch (IOException e) {
            e.printStackTrace();  // Handle file read errors
        }
    }
}

