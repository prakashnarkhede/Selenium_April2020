package utilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	String excelFilePath = null;

	public ExcelReader(String excelFilePath) {
		this.excelFilePath = excelFilePath;
	}

	public Map<String, String> getTestDataInMap(int rowNum) throws Exception {
		
		if(excelFilePath == null || excelFilePath.isEmpty() || excelFilePath == " ") {
			throw new Exception("File path is not valid");
		}
		File excelFile = new File(excelFilePath);
		Workbook wb = null;
		try { wb = WorkbookFactory.create(excelFile); } catch (Exception e) { e.printStackTrace();		}
		Sheet sh = wb.getSheet("InsurancePremium");

		int colCount = sh.getRow(0).getLastCellNum();
		
		Map<String, String> testMap = new HashMap<String, String>();

		for (int i = 0; i < colCount; i++) {
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);  //if testData is numeric but want to read it as string
			testMap.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());			
		}
		return testMap;

	}
}
