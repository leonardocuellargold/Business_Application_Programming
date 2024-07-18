import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * This class allows you to convert a csv file to arff file.
 * @author MJ
 *
 */
public class Csv2Arff {
	private String csvFileLocation;
	
	/**
	 * Keep as is. 
	 * Constructor.
	 * @param Location: The name 
	 */
	public Csv2Arff(String strFileLocation)
	{
		csvFileLocation=strFileLocation;
	}
	
	/**
	 * You need to code this
	 * This method accepts a name of a csv file and it writes an arff file from the csv file
	 * Writing arff file is similar to writing any .txt file. Just make sure the arff file name ends with .arff
	 * @param theLocation: The name and location of any csv file
	 */
	public void Convert2Arff(String theLocation) throws FileNotFoundException {
		String[][] data;
		File file = new File(theLocation);
		Scanner rowScanner = new Scanner(file);

		// First determine the number of rows and columns
		int rows = 0;
		int columns = -1;
		while (rowScanner.hasNextLine()) {
			rows++;
			String line = rowScanner.nextLine();
			try (Scanner columnScanner = new Scanner(line)) {
				columnScanner.useDelimiter(",");
				int currentColumnCount = 0;
				while (columnScanner.hasNext()) {
					currentColumnCount++;
					columnScanner.next();
				}
				if (columns == -1) {
					columns = currentColumnCount; // Set the number of columns based on the first row
				}
			}
		}
		rowScanner.close();

		// Initialize the data array
		data = new String[rows][columns];

		// Populate the 2-D array with CSV data
		Scanner fileScanner = new Scanner(new File(theLocation));
		int row = 0;
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			Scanner columnScanner = new Scanner(line);
			columnScanner.useDelimiter(",");
			int col = 0;
			while (columnScanner.hasNext()) {
				data[row][col] = columnScanner.next();
				col++;
			}
			row++;
			columnScanner.close();
		}
		// I had to keep it this way and I could't change it to Cuellar_Leonardo because it would affect my directory.
		PrintWriter outputFile = new PrintWriter(String.format("%s.arff", theLocation));
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				outputFile.println(data[i][j] + ",");
				}
			}
		outputFile.close();




		System.out.println("Done =)");
			
	}
	
	/**
	 * You need to code this
	 * This method should read the text file given in theFile, and store it into a two dimensional array of Strings.
	 * This method should return the data given in a specific row and column in the two dimensional array
	 * @param theFile: name of the csv file to open 
	 * @param row: row number in the two dimensional array
	 * @param column: column number in the two dimensional array
	 * @return strData2Return: the data in the [row][column]
	 * @throws FileNotFoundException 
	 */
	public String RetrieveCell(String theFile, int row, int column) throws FileNotFoundException
	{
		String[][] data;
		File file = new File(theFile);
		Scanner rowScanner = new Scanner(file);

		// First determine the number of rows and columns
		int rows = 0;
		int columns = -1;
		while (rowScanner.hasNextLine()) {
			rows++;
			String line = rowScanner.nextLine();
			try (Scanner columnScanner = new Scanner(line)) {
				columnScanner.useDelimiter(",");
				int currentColumnCount = 0;
				while (columnScanner.hasNext()) {
					currentColumnCount++;
					columnScanner.next();
				}
				if (columns == -1) {
					columns = currentColumnCount; // Set the number of columns based on the first row
				}
			}
		}
		rowScanner.close();

		// Initialize the data array
		data = new String[rows][columns];

		// Populate the 2-D array with CSV data
		Scanner fileScanner = new Scanner(new File(theFile));
		int row1 = 0;
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			Scanner columnScanner = new Scanner(line);
			columnScanner.useDelimiter(",");
			int col = 0;
			while (columnScanner.hasNext()) {
				data[row1][col] = columnScanner.next();
				col++;
			}
			row1++;
			columnScanner.close();
		}
		String strData2Return="";
		strData2Return = data[row][column];

		
		return strData2Return;
	}

}
