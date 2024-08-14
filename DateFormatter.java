//Toolbox
import java.util.Scanner;

//Class declaration
public class DateFormatter {
  
  //Main method
  public static void main(String[] args) {
    
    //Creates scanner for taking in user input 
    Scanner scanner = new Scanner(System.in);
    
    //Int to store user's choice
    int choice = 0;
    
    //Continuous loop for main menu
    while(true) {
      
      //Display menu
      System.out.print("-- Date Formatter --\n" + "Press '1' to convert a date to 'month day, year' format\n" + "Press '2' to convert date to 'MM/DD/YYYY' format\n" + "Press '3' to exit\n" + "Enter a choice: ");
      
      //Take in user's input
      choice = scanner.nextInt();  
      
      //Consuming newline left over
      scanner.nextLine(); 
      
      //User enters 1
      if (choice == 1) {
        
        //Prompts user to enter a date
        System.out.print("Enter a date in the format MM/DD/YYYY: ");
        
        //Receiving user input
        String userInput = scanner.nextLine();
        
        //Calls the month formatting method
        String formattedDate = getMonthName(userInput);
        
        //Displays the newly formatted date
        System.out.println("Formatted date: " + formattedDate + "\n");
      }
      
      //User enters 2
      else if (choice == 2) {
        
        //Prompts user to enter a date
        System.out.print("Enter a date in the format 'month day, year': ");
        
        //Receiving user input
        String userInput = scanner.nextLine();
        
        //Calls month formatting date method
        String formattedDate = getNumericDate(userInput);
        
        //Displays the newly formatted date
        System.out.println("Formatted date: " + formattedDate + "\n");
      }
      
      //User enters 3
      else if (choice == 3){
        
        //Tells the player goodbye
        System.out.println("Mmmmkay.... bye!");
       
        //Terminates the program
        break;
              }
      
      //User enters invalid choice
      else {
        
        //Tells the player that their input was invalid
        System.out.println("That is not a valid option! Please try again.\n");
      }
    }
    
    //Closes scanner
    scanner.close();
  }
  
  //Method converting 'MM/DD/YYYY' to 'month day, year' 
  private static String getMonthName(String inputDate) {
    
    //Splitting input with "/"
    String[] dateParts = inputDate.split("/");
    
    //Each section of date is assigned to respective month, day, and year
    int month = Integer.parseInt(dateParts[0]);
    int day = Integer.parseInt(dateParts[1]);
    int year = Integer.parseInt(dateParts[2]);
    
    //String storing monthname
    String monthName;
    
    //Converting month numbers to words
    switch (month) {
      case 1:
        monthName = "January";
        break;
      case 2:
        monthName = "February";
        break;
      case 3:
        monthName = "March";
        break;
      case 4:
        monthName = "April";
        break;
      case 5:
        monthName = "May";
        break;
      case 6:
        monthName = "June";
        break;
      case 7:
        monthName = "July";
        break;
      case 8:
        monthName = "August";
        break;
      case 9:
        monthName = "September";
        break;
      case 10:
        monthName = "October";
        break;
      case 11:
        monthName = "November";
        break;
      case 12:
        monthName = "December";
        break;
      default:
        monthName = "Invalid";
        System.out.println("An invalid month number was entered.");
        break;
    }
    //Newly formatted date is returned in 'month day, year' format to main method
    return monthName + " " + day + ", " + year;
  }
  
  //Method converting 'month day, year' to 'MM/DD/YYYY'
  private static String getNumericDate(String inputDate) {
    
    //Splits month and day with space in between
    String[] dateParts = inputDate.split(" ");
    
    //Assigns month
    String month = dateParts[0].toLowerCase();
    
    //Assigns day, removes following comma, removes the following whitespace, then converts the string to an integer
    int day = Integer.parseInt(dateParts[1].replace(',', ' ').trim());
    
    //Assins year, converts the string into an integer
    int year = Integer.parseInt(dateParts[2]);
    
    //Int storing respective number for each month
    int monthNumber;
    
    //If statements for respective numbers representing month names
    if (month.equals("january")) {
      monthNumber = 1;
    }
    else if (month.equals("february")) {
      monthNumber = 2;
    }
    else if (month.equals("march")) {
      monthNumber = 3;
    }
    else if (month.equals("april")) {
      monthNumber = 4;
    }
    else if (month.equals("may")) {
      monthNumber = 5;
    }
    else if (month.equals("june")) {
      monthNumber = 6;
    }
    else if (month.equals("july")) {
      monthNumber = 7;
    }
    else if (month.equals("august")) {
      monthNumber = 8;
    }
    else if (month.equals("september")) {
      monthNumber = 9;
    }
    else if (month.equals("october")) {
      monthNumber = 10;
    }
    else if (month.equals("november")) {
      monthNumber = 11;
    }
    else if (month.equals("december")) {
      monthNumber = 12;
    }
    else {
      monthNumber = 0;
        }
    
    //Returning date in MM/DD/YY format to main method
    return String.format("%02d/%02d/%04d", monthNumber, day, year);
  }
}