package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
import utilities.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	public static int totalRow;

	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		workbook.close();
		return readSheet(sheet);
	}

	public List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;
		Cell cell;
		loggerLoad.info("Read Sheet data");

		totalRow = sheet.getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

			row = sheet.getRow(currentRow);
			loggerLoad.info("Row : " + row);

			int totalColumn = row.getLastCellNum();

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

				cell = row.getCell(currentColumn);
				loggerLoad.info("Cell : " + cell);
				
				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();
				loggerLoad.info("Column Header Name : " + columnHeaderName);
				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
			}

			excelRows.add(columnMapdata);
		}

		return excelRows;
	}

public static void main(String[] args) throws  Throwable {
		
		ExcelReader excelData = new ExcelReader();
		
		configFileReader.readConfig();
		
		List<Map<String, String>> signinData = new ArrayList<Map<String, String>>();
		Map<String, String> eachSigninData = new HashMap<String, String>();
		signinData = excelData.getData(configFileReader.getExcelPath(), "Login");
		
		
		Iterator<Map<String,String>> listIterator = signinData.listIterator();
		while (listIterator.hasNext()) {
			eachSigninData = listIterator.next();
			for(Map.Entry<String, String> entry : eachSigninData.entrySet()){
				System.out.println("Key is :" + entry.getKey());
				System.out.println("Value is :" + entry.getValue());
			}
		}

}
}



