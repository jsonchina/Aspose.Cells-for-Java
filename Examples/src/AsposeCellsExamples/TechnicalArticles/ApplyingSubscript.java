package AsposeCellsExamples.TechnicalArticles;

import com.aspose.cells.Cell;
import com.aspose.cells.Cells;
import com.aspose.cells.Font;
import com.aspose.cells.Style;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import AsposeCellsExamples.Utils;

public class ApplyingSubscript {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ApplyingSubscript.class) + "TechnicalArticles/";
		// Instantiating a Workbook object
		Workbook workbook = new Workbook();

		// Accessing the added worksheet in the Excel file
		Worksheet worksheet = workbook.getWorksheets().get(0);

		Cells cells = worksheet.getCells();

		// Adding some value to the "A1" cell
		Cell cell = cells.get("A1");

		cell.setValue("Hello");

		// Setting the font name to "Times New Roman"
		Style style = cell.getStyle();

		Font font = style.getFont();
		font.setSubscript(true);

		cell.setStyle(style);

		// Saving the modified Excel file in default format
		workbook.save(dataDir + "ASubscript_out.xls");

	}
}
