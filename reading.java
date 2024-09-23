package Task_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading {
    public static void main(String[] args) {
        String filePath = "E:\\poi-bin-5.2.3-20220909\\Task-8.xlsx";  
        
        ArrayList<String[]> dl = new ArrayList<>();  

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             XSSFWorkbook wb = new XSSFWorkbook(fileInputStream)) {

            XSSFSheet Task_8 = wb.getSheet("Sheet1");

            for (Row row : Task_8) {
                String[] rowData = new String[row.getLastCellNum()]; 
                for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                    rowData[colNum] = row.getCell(colNum).toString(); 
                }
                dl.add(rowData); 
            }

            for (int i = 1; i < dl.size(); i++) {  
                String[] row = dl.get(i);
                System.out.println(String.join(", ", row));  
            }

        } catch (IOException e) {
            e.printStackTrace();  
        }
    }
}

