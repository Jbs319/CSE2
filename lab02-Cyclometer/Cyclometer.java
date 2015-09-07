//Josh Stuttman
//9-4-15
//CSE2
//
//  Compile the program
//      javac Cyclometer.java
//  Run the program
//      Cylcometer.java//

// This cyclometer will calculate time and distance (based on wheel rotations) of a trip

//  Class
public class Cyclometer{
    
//  Main method
public static void main(String[] args) {
    
int secsTrip1=480;  //time elapsed of trip #1
int secsTrip2=3220;  //time elapsed of trip #2
int countsTrip1=1561; //wheel rotations of trip #1
int countsTrip2=9037; //wheel rotations of trip #2

double wheelDiameter=27.0,  //diameter of wheel of both bikes
PI=3.14159, //Pi lets us calculate diameter of the wheel
feetPerMile=5280,  // There are 5280 feet in a mile
inchesPerFoot=12,   // There are 12 inches in a foot
secondsPerMinute=60;  // There are 60 seconds in a minute

double distanceTrip1, distanceTrip2,totalDistance;  //Total distance is distance of trip #1 + distance of trip #2
System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");

//      Below are the calculations
distanceTrip1=countsTrip1*wheelDiameter*PI; //distance in inches
                                            //(for each count, a rotation of the wheel travels
    	                                    //the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile;   //Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//      Print out the output data
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");


s
    
       }//end of class
   }//end of main method
    


