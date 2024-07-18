import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author MJ
 *
 */
public class DataSummary {
	private String fileLocation;
	private double averageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage(this.fileLocation);
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return dblSum: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	public double getAverage(String strFile) throws FileNotFoundException
	{
		
		File data = new File(this.fileLocation);
		Scanner scnReader = new Scanner(data);
		double i = 0;
		double lumpSum = 0;
		while(scnReader.hasNext()) {
			String strLine = scnReader.nextLine();
			
			double sum = Double.parseDouble(strLine.split(",")[5]);
			lumpSum = lumpSum + sum;
			i++;
		}
		scnReader.close();
		double dblSum = lumpSum/i;
		return dblSum;
		
	}
	

	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeAndIDs() throws FileNotFoundException
	{
		File data = new File(this.fileLocation);
		Scanner scnReader = new Scanner(data);
		while(scnReader.hasNext()) {
			String strLine = scnReader.nextLine();
			String name = strLine.split(",")[0];
			int ID = Integer.parseInt(strLine.split(",")[3]);
			System.out.printf("Name\t%s.   ID:\t%d \n", name, ID);
		}
		scnReader.close();
		
	}
	
	
	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void SearchEmployee(String strEmployee) throws FileNotFoundException
	{
		// Still work in progress
		File data = new File(this.fileLocation);
		Scanner scnReader = new Scanner(data);
		String printout = "";
		while(scnReader.hasNext()) {
			String strLine = scnReader.nextLine();
			String name = strLine.split(",")[0];
			if(name.contentEquals(strEmployee) == true)
			{
				String append = String.format("%s, %s, %s, %s, %s, %s\n", strLine.split(",")[0], strLine.split(",")[1], strLine.split(",")[2], strLine.split(",")[3], strLine.split(",")[4], strLine.split(",")[5]);
				printout = printout.concat(append);
			}
		}
		scnReader.close();
		if(printout.equals("") == true) {
			JOptionPane.showMessageDialog(null, "Not Found");
		} else {
		JOptionPane.showMessageDialog(null, printout);}

		
	}
	
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException
	{
		

		
	}
	

	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	
}
