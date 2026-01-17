package utilities;

import org.testng.annotations.DataProvider;
import java.io.IOException;

public class DataProviders {

    @DataProvider(name="LoginData")
    public String[][] getData() throws IOException {
        String path = ".\\Software Testing\\Manual Testing\\Test data.xlsx";

        ExcelUtility xlutil = new ExcelUtility(path);

        int totalrows = xlutil.getRowCount("Sheet1");   // total row count (includes header row)
        int totalcols = xlutil.getCellCount("Sheet1", 0); // count columns from header row

        // exclude header row, so totalrows-1
        String loginData[][] = new String[totalrows-1][totalcols];

        for (int i = 1; i < totalrows; i++) {   // start from row 1, skip header
            for (int j = 0; j < totalcols; j++) {
                loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
            }
        }
        return loginData;
    }
}
