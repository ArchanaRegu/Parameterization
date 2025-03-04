package Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderSupplier {
	@DataProvider(name="datapro")
	public Object[][] dpA() {
		  
		Object[][] data=new Object[][] {
					{1,2,3},{4,5,6},{7,8,9}};
		return data;
	}
	@DataProvider(name="ThreeInputs",indices = {1,2})
	public String[][] getdataLogin() throws Exception {
		File excelFile=new File("./src/test/resources/excel/dataavailable.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int no_rows=sheet.getPhysicalNumberOfRows();
		int no_colms=sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[no_rows-1][no_colms];
		for(int i=0;i<no_rows-1;i++) {
			for(int j=0;j<no_colms;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		workbook.close();
		fis.close();
//	for(String[] dataArr:data) {
//	System.out.println(Arrays.toString(dataArr));
//	}
	return data;
	}
}
