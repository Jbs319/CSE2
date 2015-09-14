//Josh Stuttman
//9-12-15
//CSE2

// This program will calculate the time between the current time and dinner time.

//Import scanner class
import java.util.Scanner;

// Define class
public class Timer{

// Main method
public static void main(String[] args){
    
// Declare instance of scanner object
Scanner myScanner = new Scanner( System.in );
    
// Prompt user for current time and accept input
System.out.print("Enter the current military time in the form HHMM: ");
int currentTime = myScanner.nextInt();

// Prompt user for dinner time and accept input
System.out.print("Enter the time of dinner in the form HHMM: ");
int dinnerTime = myScanner.nextInt();


waitTime = dinnerTime - currentTime;

//declare variables
int waitTime;
int hours;
int minutes;

//This will split the hours and minutes by a decimal point
hours = (waitTime / 100);
//Mod operator gives remainder
minutes = (waitTime % 100);

//Print answer
System.out.println("You have "+hours+" hours and "+minutes+" minutes until dinner");



}
    }

