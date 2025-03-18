package utilils;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandler {

    public static String readExcelData(String sheetName, int row , int column){
        File f = new File("src/main/resources/testdata/TestData.xlsx");
        FileInputStream fis;
        XSSFWorkbook workbook;
        try {
             fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
             workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
       return sheet.getRow(row).getCell(column).getStringCellValue();
    }
}
