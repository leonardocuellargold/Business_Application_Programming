/**
 * 
 */

/**
 * @author MJ
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class HW3 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
	//****** Keep as is *******************
		// The location of the employee text file 
		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation);
	//*************************************
		//This while loop controls the options for users. Your switch statement should be embedded here.
		while(intChoice !=0)
		{
			switch(intChoice)
			{
			case 0:
				System.exit(0);
			case 1:
				myData.ViewEmployeeAndIDs();
				break;
			case 2:
				// need to add input for search employee
				String input = JOptionPane.showInputDialog("Enter employee name to search for:");
				myData.SearchEmployee(input);
				break;
			case 3:
				myData.ViewRoles();
				break;
			case 4: 
				// need to add input for search role
				myData.ViewEmployeeForRole(strOutputLocation);
				break;
			case 5:
				// Must add GUI here as it is not void. 
				JOptionPane.showMessageDialog(null, String.format("The average is: %f", myData.getAverage(strDataLocation)));
			case 6: 
				// Summerize data
				String strLine = inputFile.nextLine();

				//While loop to iterate through the file
				while(inputFile.hasNext())
				{
					//Read each line in the text and store it in a String
					 strLine = inputFile.nextLine();
					//System.out.println(strLine);

					//Create a Employee object from the line
					Employee theEmployee = new Employee(strLine);
					
					//Print the employee info.
					theEmployee.SalaryBarChart(Double.parseDouble(strLine.split(",")[5]));
					System.out.println(theEmployee.SummerizeEmployee());
					writer.append(theEmployee.SummerizeEmployee()+ "\n");
					       
						
				}
				inputFile.close();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Wrong Option");
				break;
			
			}
			intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));	
		}


		writer.close();
		inputFile.close();	
		
	}
	/**	 
	 * Keep as is
	 * A method to display options
	 * @return : The options to display in the GUI
	 */
	
	public static String ViewOptions()
	{
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	} }
	
	
	
	



