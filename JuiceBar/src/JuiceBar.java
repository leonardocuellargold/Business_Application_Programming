/** Info
 * Leonardo Cuellar
 * HW2 - Feb. 25th, 2024
 * 
 */

/**
 * Google was utilized to find information on YES_NO_Options, String formats, parse integer from input dialog, 
 * and just display two decimals in string format for doubles. 
 */
import javax.swing.JOptionPane;
public class HW2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome Message
		JOptionPane.showMessageDialog(null, " Welcome to Java Juice Bar!");
		// Ask user for selection
		int intUserSelection = Integer.parseInt(JOptionPane.showInputDialog("Select your base juice:\n1. Apple - $5.00\n2. Orange - $4.50\n3. Mango - $6.00\n4. Carrot - $5.50"));
		// Initialize all necessary variables
		double dblJuicePrice=0; 
		String strJuice = "No Selection"; 
		double dblDiscount = 0; 
		double dblFullPrice=0; 
		double dblPriceTax=0; 
		double dblBefTaxTotal=0;
		double dblTotal =0;
		String strAdd= ""; 
		double dblAdd= 0; 
		// Switch statement based on user selection. If wrong selection, display message and exit. 
		switch (intUserSelection) {
		case 1:
			strJuice = "Apple";
			dblJuicePrice = 5.00;
			break;
		case 2: 
			strJuice = "Orange";
			dblJuicePrice = 4.50;
			break;
		case 3: 
			strJuice = "Mango";
			dblJuicePrice = 6.00;
			break;
		case 4: 
			strJuice = "Carrot";
			dblJuicePrice = 5.50;
			break;
		default: 
			JOptionPane.showMessageDialog(null, "Invalid Selection. Please restart the program.");
			System.exit(0);
			break;
		}
		// Set Full Price to Juice Price, in case user does not select add-on. 
		dblFullPrice = dblJuicePrice;
		// Yes No option show Confirm Dialog for add-on. 
		int intExtreSelect = JOptionPane.showConfirmDialog(null, "Would you like to add ginger for an extra $1.00?","Would you like to add ginger for an extra $1.00?", JOptionPane.YES_OPTION);
		// If statement for ginger. 
		if(intExtreSelect == 0 ) {
			dblAdd =1; 
			dblFullPrice = dblJuicePrice+dblAdd; 
			// Add custom string to strAdd, in case user does not select add-on, then disappear. 
			strAdd= String.format("\nGinger - $%.2f",dblAdd);
			}
		// If with and for discount
		if(intExtreSelect == 0 && intUserSelection == 3) {
			dblDiscount = 0.5; 
		}
		// Adjust all variables respectively to show on final bill. 
		dblBefTaxTotal = dblFullPrice-dblDiscount;
		dblPriceTax = dblBefTaxTotal*0.16; 
		dblTotal = dblBefTaxTotal+ dblPriceTax; 
		//  Final Bill
		JOptionPane.showMessageDialog(null, String.format("|| Final Bill ||\n"
				+ "----------\n"
				+ "Base Juice: %s - $%.2f"
				+ "%s"
				+ "\n----------\n"
				+ "----------\n"
				+ "Full Price: $%.2f\n"
				+ "Discount: -$%.2f\n"
				+ "----------\n"
				+ "Total Before Tax: $%.2f\n"
				+ "Tax: $%.2f\n"
				+ "----------\n"
				+ "Total After Tax: $%.2f\n"
				+ "----------\n",strJuice ,dblJuicePrice,strAdd, dblFullPrice, dblDiscount, dblBefTaxTotal, dblPriceTax, dblTotal));
	
		 

	}

}
