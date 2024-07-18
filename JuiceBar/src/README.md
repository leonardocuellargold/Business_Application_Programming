# Java Juice Bar

## Overview
The Java Juice Bar program is an interactive Java application that simulates a juice bar order system. It allows users to select their desired juice from a menu, optionally add an extra ingredient, and then calculates the total price including tax. The program also offers a discount for specific combinations of juice and extras.

## Program Description
This program uses the `javax.swing.JOptionPane` class to interact with the user through dialog boxes. The flow of the program is as follows:

1. **Welcome Message**: A welcome message is displayed to the user.
2. **Juice Selection**: The user is prompted to select a base juice from a list. Each juice has a specific price:
   - Apple: $5.00
   - Orange: $4.50
   - Mango: $6.00
   - Carrot: $5.50
3. **Add-on Selection**: The user is asked if they would like to add ginger to their juice for an extra $1.00.
4. **Discount Application**: If the user selects Mango and adds ginger, a discount of $0.50 is applied.
5. **Price Calculation**: The program calculates the total price, including a 16% tax.
6. **Final Bill**: The final bill is displayed to the user, showing a breakdown of the costs including the base juice price, add-on price, discount, total before tax, tax, and total after tax.

## Code Explanation

### Main Class and Method
The main class `HW2` contains the `main` method, which is the entry point of the program. It initializes variables to store prices, user selections, and calculates the final bill.

### Juice Selection
A `switch` statement is used to set the juice name and price based on the user's selection. If an invalid selection is made, an error message is displayed, and the program exits.

### Add-on and Discount Logic
A confirmation dialog is used to ask the user if they want to add ginger for an extra $1.00. If the user selects Mango and adds ginger, a discount of $0.50 is applied.

### Price Calculation
The program calculates the total price before tax, applies a 16% tax, and then calculates the final total price.

### Final Bill
The final bill is displayed using `JOptionPane.showMessageDialog`, formatted to show all details including the base juice price, add-on price, discount, total before tax, tax, and total after tax.

### Imports
- `javax.swing.JOptionPane`: Used for creating dialog boxes for user interaction.

## Summary
The Java Juice Bar program provides a simple and interactive way for users to order juice, with the option to add extras and receive discounts. The program effectively demonstrates the use of dialog boxes, conditional statements, and basic arithmetic operations in Java.