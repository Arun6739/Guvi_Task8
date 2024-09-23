package Task_8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writing {
    public static void main(String[] args) {
        ArrayList<String[]> dataList = new ArrayList<>();
        
        String[] headers = {"Name", "Age", "Email"};
        
        dataList.add(new String[]{"John Doe", "30", "john@test.com"});
        dataList.add(new String[]{"Jane Doe", "28", "jane@test.com"});
        dataList.add(new String[]{"Bob Smith", "35", "bob@example.com"});
        dataList.add(new String[]{"Swapnil", "37", "swapnil@example.com"});
        
        try (XSSFWorkbook wb = new XSSFWorkbook(); 
             FileOutputStream fileOut = new FileOutputStream("E:\\poi-bin-5.2.3-20220909\\Task-8.xlsx")) {

            XSSFSheet Task_8 = wb.createSheet("Sheet1");

            XSSFRow headerRow = Task_8.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                headerRow.createCell(i).setCellValue(headers[i]);
            }

            for (int rowNum = 0; rowNum < dataList.size(); rowNum++) {
                XSSFRow row = Task_8.createRow(rowNum + 1);  
                String[] rowData = dataList.get(rowNum);
                for (int colNum = 0; colNum < rowData.length; colNum++) {
                    row.createCell(colNum).setCellValue(rowData[colNum]);  
                }
            }

            wb.write(fileOut);

            System.out.println("Data written to Excel file successfully using ArrayList!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
