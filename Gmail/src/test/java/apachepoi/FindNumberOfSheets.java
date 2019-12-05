package apachepoi;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FindNumberOfSheets {

	
	public static void main(String[] args) throws Exception {

		File file = new File("D:\\testdata1.xls");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		
	    Workbook workbook = WorkbookFactory.create(inputstream);
	    
	    System.out.println(workbook.getNumberOfSheets());
        //
	    workbook.getSheet(null);
	    //create new sheet in the name of gspran
	   workbook.createSheet("gspran");
	    //remover sheet index 1
	   workbook.removeSheetAt(1);
	   
	   FileOutputStream outputstream = new FileOutputStream(file);
	   
	   workbook.write(outputstream);
		
		Thread.sleep(3000);
		
		workbook.close();
		
	

}
}