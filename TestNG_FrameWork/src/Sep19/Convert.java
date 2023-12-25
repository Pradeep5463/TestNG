package Sep19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Convert {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		for(int i=1;i<=rc;i++)
		{
			if(wb.getSheet("Emp").getRow(i).getCell(3).getCellType()==CellType.NUMERIC)
			{
				int celldata = (int) wb.getSheet("Emp").getRow(i).getCell(3).getNumericCellValue();
				String Eid = String.valueOf(celldata);
				System.out.println(Eid);
			}
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D://Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		

	}

}
