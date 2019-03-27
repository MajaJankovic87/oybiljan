package paket;

	import java.io.File;

	import java.io.FileInputStream;

	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFRow;

	import org.apache.poi.hssf.usermodel.HSSFSheet;

	import org.apache.poi.hssf.usermodel.HSSFWorkbook;

		
		public	class POIExcell{

		public static void main(String[] args) throws IOException {

			// TODO Auto-generated method stub

			File src = new File("C:\\Users\\Maja\\Desktop\\data.xls");

			FileInputStream fis = new FileInputStream(src);

			HSSFWorkbook wbe = new HSSFWorkbook(fis);

			HSSFSheet sheet1 = wbe.getSheetAt(0);

			int rowcount = sheet1.getLastRowNum();

			System.out.println("Total row count is " + (rowcount + 1));//dodaje se 1 jer krece da broji od nule

			for (int i = 0; i <= rowcount; i++) {

				HSSFRow r = sheet1.getRow(i);

				if (r != null) {

					String data0 = r.getCell(0).getStringCellValue();

					System.out.println("Podaci iz reda " + i + " su " + data0);

				} else {

					System.out.println("<Empty row>");

				}

			}

			wbe.close();

		}

	}



