package apachepoi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class firstrowlastrow {

	

	public static void main(String[] args) throws Exception {
		
	
	Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("D:\\testdata1.xls")));
		
    Sheet sheet = workbook.getSheet("Sheet1");
    
    System.out.println("rows:"+sheet.getPhysicalNumberOfRows());
    
    System.out.println("FirstRow:"+ sheet.getFirstRowNum());
    
    System.out.println("LastRow:"+ sheet.getLastRowNum());
    
		
    Row row = sheet.getRow(0);
    
    System.out.println(row.getCell(1));
    
    Cell cell=row.getCell(2);
    
    row.removeCell(cell);
    
    Row row1 = sheet.getRow(4);
    
    row1.createCell(4);
    
    System.out.println(row.getFirstCellNum());
    
    System.out.println(row.getPhysicalNumberOfCells());
    
    System.out.println(row.getLastCellNum());
    
    //Row row1 = sheet.getRow(5);
   
   workbook.close();
    
		
	}
}
	
	