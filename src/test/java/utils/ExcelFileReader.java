package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelFileReader {

    private static FileInputStream fis;
    private FileOutputStream fileOut;
    private XSSFWorkbook wb=new XSSFWorkbook();
    private static Sheet sh;
    private static Cell cell;
    private Row row;
    private CellStyle cellstyle;
    private Color mycolor;
    private static String excelPath="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/resources/datatest_deposit.xlsx";
    private static String sheetName="Sheet1";
    private static Map<String, Integer> columns = new HashMap<>();
    public static String excelReader(String columnName,int rowNum ) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File(excelPath));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        try {
            Cell cell = firstSheet.getRow(rowNum).getCell(columns.get(columnName));
            String CellData = null;
            switch (cell.getCellType()) {
                case STRING:
                    CellData = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        CellData = String.valueOf(cell.getDateCellValue());
                    } else {
                        CellData = String.valueOf((long) cell.getNumericCellValue());
                    }
                    break;
                case BOOLEAN:
                    CellData = Boolean.toString(cell.getBooleanCellValue());
                    break;
                case BLANK:
                    CellData = "";
                    break;
            }
            return CellData;
        }catch (Exception e)
        {
        }

        workbook.close();
        inputStream.close();
        return null;
    }
}
