# CSV to ARFF File Converter

## Overview
The CSV to ARFF File Converter is a Java application that processes CSV files from a specified directory, converts them into ARFF files, and provides functionality to retrieve specific cell values from these files. This program is designed to automate the conversion of multiple CSV files and facilitate data retrieval.

## Program Description
This program uses various Java classes and methods to locate CSV files, convert them to ARFF format, and interact with the user through the command line to retrieve specific cell values.

### Main Class and Method
The main class `HW4` contains the `main` method, which is the entry point of the program. It initializes the directory path, locates CSV files, converts them to ARFF format, and interacts with the user to retrieve specific cell values.

### File Locations
- **Data Directory**: The CSV files are located in the `src/Data` directory.

### User Tasks
1. **Locate CSV Files**: The program locates all CSV files in the specified directory and prints their names.
2. **Add Directory to File Names**: The program updates the file names to include the full directory path.
3. **Convert CSV to ARFF**: The program creates instances of the `Csv2Arff` class and converts each CSV file to ARFF format.
4. **Retrieve Specific Cell Value**: The program prompts the user for a file name, column number, and row number, and retrieves the corresponding cell value from the file.

### Code Explanation

#### Initialization
- **Directory Path**: The directory containing the CSV files is specified.
- **CSV File Names**: The program locates the CSV files using the `findCSVFileNames` method.

#### Print Array Method
- **PrintArray**: This method prints the content of any given String array to the console.

#### CSV File Location
- **findCSVFileNames**: This method finds all CSV files in the specified directory.
- **addCSVFileNames**: This method recursively searches directories and adds CSV file names to a list.

#### File Conversion and Data Retrieval
- **Csv2Arff Class**: This class handles the conversion of CSV files to ARFF format and retrieval of cell values.
- **Conversion Loop**: The program loops through the array of CSV file names, creates `Csv2Arff` objects, and calls the `Convert2Arff` method to convert each file.
- **User Input**: The program prompts the user for a file name, column number, and row number to retrieve a specific cell value.
- **Retrieve Cell Value**: The program calls the `RetrieveCell` method of the `Csv2Arff` class to retrieve and print the cell value.

### Imports
- `java.io.File`: Represents file locations.
- `java.io.FileNotFoundException`: Handles file not found exceptions.
- `java.io.FilenameFilter`: Filters files by name.
- `java.util.ArrayList`: Manages dynamic arrays.
- `java.util.List`: Represents a list of objects.
- `java.util.Scanner`: Reads input from the user.

## Summary
The CSV to ARFF File Converter provides a comprehensive solution for managing and converting CSV files to ARFF format. It automates the process of locating files, converting them, and retrieving specific data, demonstrating effective file handling, user interaction, and data processing in Java.