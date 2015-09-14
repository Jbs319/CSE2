//Josh Stuttman
//9-12-15
//CSE2

// This program will calculate volume and surface area of a block.

//Import scanner class
import java.util.Scanner;

// Define class
public class Block{

// Main method
public static void main(String[] args){
    
// Declare instance of scanner object
Scanner myScanner = new Scanner( System.in );

// Prompt user for length of block and accept input
System.out.print("Enter the length of the block in the form x.x: ");
double length = myScanner.nextDouble();

// Prompt user for width of block and accept input
System.out.print("Enter the width of the block in the form x.x: ");
double width = myScanner.nextDouble();

// Prompt user for height and accept input
System.out.print("Enter the height of the block in the form x.x: ");
double height = myScanner.nextDouble();

double volume = length * width * height;

double surfaceArea = ((2*(length * width)) + (2*(length * height)) + (2*(width * height)));

System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume+" . The surface area of the block is "+surfaceArea+" . ");

}
    }   