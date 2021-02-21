package GeneralUntil;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class readdatafromExcelusingcolumnName {

    public static String readdatafromExcelusingcolumnName(String ColumnName)
            throws EncryptedDocumentException, InvalidFormatException, IOException {
        String SheetName = "loginPage";
        File file = new File(".\\testData\\LoginPageTest.xlsx");
        FileInputStream fi = new FileInputStream(file);
        Workbook wb = WorkbookFactory.create(fi);
        Sheet sheet = wb.getSheet(SheetName);
        // it will take value from first row
        Row row = sheet.getRow(0);
// it will give you count of row which is used or filled
        short lastcolumnused = row.getLastCellNum();

        int colnum = 0;
        for (int i = 0; i < lastcolumnused; i++) {
            if (row.getCell(i).getStringCellValue().equalsIgnoreCase(ColumnName)) {
                colnum = i;
                break;
            }
        }

        // it will take value from Second row
        row = sheet.getRow(1);
        Cell column = row.getCell(colnum);
        String CellValue = column.getStringCellValue();

        return CellValue;

    }
}



