package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	


	public static String[][] readData(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("F:\\Eclipse 64 bitl\\MavenProject\\Data\\"+fileName);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		int cellCount = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) {

			for (int j = 0; j < cellCount; j++) {
				String text = ws.getRow(i).getCell(j).getStringCellValue();

				System.out.println(text);
				data[i-1][j]=text;
			}
		}
		wb.close();

		return data;

	}
}
