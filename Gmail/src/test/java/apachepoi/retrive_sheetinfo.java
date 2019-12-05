package apachepoi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class retrive_sheetinfo {

	public static void main(String[] args) throws Exception {

		
		Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("D:\\testdata1.xls")));
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		for(int rowindex=sheet.getFirstRowNum();rowindex<=sheet.getLastRowNum();rowindex++) {
			
			for(int columnindex = sheet.getRow(rowindex).getFirstCellNum();
					columnindex<= sheet.getRow(rowindex).getLastCellNum();columnindex++) 
			{
				System.out.print(sheet.getRow(rowindex).getCell(columnindex)+"  ");
				
				
			}
			System.out.println("\n");
		}
	}

}
