# Employee Data Management System

## Overview
The Employee Data Management System is a Java application designed to manage and summarize employee data from a text file. The program allows users to view employees and their IDs, search for specific employees, view current roles, view employees by role, calculate the average salary, and summarize and write employee data to a new file.

## Program Description
This program uses various Java classes and methods to read employee data from a file, process the data, and interact with the user through a graphical user interface (GUI) using `javax.swing.JOptionPane`.

### Main Class and Method
The main class `HW3` contains the `main` method, which is the entry point of the program. It initializes the necessary file locations, creates instances of required classes, and controls the flow of the program using a `while` loop and a `switch` statement to handle user options.

### File Locations
- **Employee Data File**: The employee data is read from `src/EmployeeData.txt`.
- **Employee Summary File**: The summarized employee data is written to `src/EmployeeSummary.txt`.

### User Options
The user can choose from the following options:
1. **View Employees and IDs**: Displays a list of employees and their IDs.
2. **Search for Employee**: Allows the user to search for a specific employee by name.
3. **View Current Roles**: Displays a list of current roles within the company.
4. **View Employees for a Certain Role**: Displays a list of employees for a specified role.
5. **View Average Salary**: Calculates and displays the average salary of all employees.
6. **Summarize and Write Data**: Summarizes the employee data and writes it to the summary file.

### Code Explanation

#### Initialization
- **File and Scanner**: The program initializes file locations and uses a `Scanner` to read from the employee data file.
- **PrintWriter**: Used to write summarized data to the output file.
- **DataSummary**: An instance of the `DataSummary` class is created to manage and process the employee data.

#### User Interaction
- **Option Selection**: The user is prompted to select an option using a dialog box. The `ViewOptions` method provides the list of options.
- **While Loop**: Controls the flow of the program, allowing the user to select options until they choose to exit.

#### Switch Statement
Handles the user's selected option:
- **Case 0**: Exits the program.
- **Case 1**: Calls `ViewEmployeeAndIDs` to display employees and IDs.
- **Case 2**: Prompts the user to enter an employee name and calls `SearchEmployee`.
- **Case 3**: Calls `ViewRoles` to display current roles.
- **Case 4**: Calls `ViewEmployeeForRole` to display employees by role.
- **Case 5**: Calculates and displays the average salary using `getAverage`.
- **Case 6**: Summarizes employee data and writes it to the summary file.

### Data Summary and Employee Classes
- **DataSummary**: Manages employee data, provides methods for viewing employees, searching for employees, viewing roles, and calculating the average salary.
- **Employee**: Represents an employee, provides methods for summarizing employee information and displaying a salary bar chart.

### Imports
- `java.io.File`: Represents file locations.
- `java.io.FileNotFoundException`: Handles file not found exceptions.
- `java.io.PrintWriter`: Writes data to files.
- `java.util.HashSet`: Manages unique employee data.
- `java.util.Scanner`: Reads data from files.
- `javax.swing.JOptionPane`: Creates dialog boxes for user interaction.

## Summary
The Employee Data Management System provides a comprehensive solution for managing employee data, allowing users to view, search, and summarize employee information. The program effectively demonstrates file handling, user interaction through GUI, and data processing in Java.