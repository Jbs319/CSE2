//Josh Stuttman
//9-11-15
//CSE2
//
//  Compile the program
//      javac Check.java
//  Run the program
//      java Check//

//  This program will calculated the original cost of the check that is being
//      split, as well as the percentage tip desired, and the number of ways
//      that the check will be split.

//Import scanner class
import java.util.Scanner;

//Add class and main method
//Class 
public class Check{
    			// main method required for every Java program
   			public static void main(String[] args) {

//Declare instance of scanner object
Scanner myScanner = new Scanner( System.in );

//Prompt user for original cost and accept input
System.out.print("Enter the original cost of the check in the form xx.xx: ");
double checkCost = myScanner.nextDouble();

//Prompt user for tip percentage and accept input
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
double tipPercent = myScanner.nextDouble();
tipPercent /= 100; //We want to convert the percentage into a decimal value

//Prompt user for # of ways split and accept input
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople = myScanner.nextInt();

//Print results
double totalCost;
double costPerPerson;
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);




}  //end of main method   
  	} //end of class
