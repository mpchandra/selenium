package utils;

import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;

public class ExcelUtil {
public static String get(String path,int r,int c)throws Exception{
XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(path));
return wb.getSheetAt(0).getRow(r).getCell(c).getStringCellValue();
}
}