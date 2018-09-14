package mydemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcel {
	public void Read(String filepath, String filename, String sheetname) throws IOException {
		File file = new File(filepath + "\\" + filename);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb=null;
		Sheet sheet= wb.getSheet(sheetname);
		int rowCount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<rowCount+1;i++) {
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				System.out.print(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		ReadExcel re= new ReadExcel();
		re.Read(" "," ", " ");

	}

}
