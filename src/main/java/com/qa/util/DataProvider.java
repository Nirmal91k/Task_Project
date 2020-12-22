package com.qa.util;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.common.usermodel.Hyperlink;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFPictureData;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider {

	protected String INPUT_firstName = null;
	protected String INPUT_lastName = null;
	protected String INPUT_phoneNo = null;
	protected String INPUT_eMail = null;
	protected String INPUT_calDate = null;
	protected String INPUT_calTime = null;
	protected String INPUT_Doc = null;
	protected String INPUT_imgae = null;

	public void readFromExcel() {

		try {
			FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(file);
			Sheet sh = wb.getSheetAt(0);
			int rowLength = sh.getPhysicalNumberOfRows();

			for (int i = 0; i <= rowLength; i++) {

				INPUT_firstName = sh.getRow(i).getCell(0).getStringCellValue();
				INPUT_lastName = sh.getRow(i).getCell(1).getStringCellValue();
				INPUT_phoneNo = sh.getRow(i).getCell(2).getStringCellValue();
				INPUT_eMail = sh.getRow(i).getCell(3).getStringCellValue();
				INPUT_calDate = sh.getRow(i).getCell(4).getStringCellValue();
				INPUT_calTime = sh.getRow(i).getCell(5).getStringCellValue();

				Cell cell = sh.getRow(1).getCell(6);
				Hyperlink link = cell.getHyperlink();
				if (link != null) {

					INPUT_Doc = link.getAddress();

				}

				List<XSSFPictureData> lst = wb.getAllPictures();
				for (Iterator it = lst.iterator(); it.hasNext();) {
					PictureData pict = (PictureData) it.next();
					INPUT_imgae = pict.getContentType();

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}