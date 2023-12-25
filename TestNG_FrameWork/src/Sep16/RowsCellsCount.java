package Sep16;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RowsCellsCount {

	public static void main(String[] args) throws Throwable {
		//read path of file
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
        //get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Emp");
		//get first row from sheet
		XSSFRow row = ws.getRow(0);
		//count no. of rows in a sheet
		int rc = ws.getLastRowNum();
		//count no. of cells in 1st row
		int cc = row.getLastCellNum();
		System.out.println("No.of rows are::"+rc+"  "+"No.of cells in 1st row"+cc);
		fi.close();
		wb.close();
				
	}

}
