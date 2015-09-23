//Josh Stuttman
//9-18-15
//CSE2

//This program will...

//Import random class
import java.util.Random;

// Define class
public class PokerHandCheck{

// Main method
public static void main(String[] args){


//Generate random number between 1 and 52
int randomCard1 = (int)(Math.random()*52)+1;



//Declare suit variable
String Suit = "";

//Set if statements for suits
if (randomCard1>=1 && randomCard1<=13){
Suit="diamonds";}
else if (randomCard1>=14 && randomCard1<=26){
Suit="clubs";}
else if (randomCard1>=27 && randomCard1<=39){
Suit="hearts";}
else if (randomCard1>=40 && randomCard1<=52){
Suit="spades";}



switch (randomCard%13){
    case 1: 
        System.out.println("You picked the Ace of " + Suit);
        break;
    case 2:
        System.out.println("You picked the 2 of " + Suit);
        break;
    case 3:
        System.out.println("You picked the 3 of " + Suit);
        break;
    case 4:
        System.out.println("You picked the 4 of " + Suit);
        break;
    case 5:
        System.out.println("You picked the 5 of " + Suit);
        break;
    case 6:
        System.out.println("You picked the 6 of " + Suit);  
        break;
    case 7:
        System.out.println("You picked the 7 of " + Suit);
        break;
    case 8:
        System.out.println("You picked the 8 of " + Suit);
        break;
    case 9:
        System.out.println("You picked the 9 of " + Suit);
        break;
    case 10:
        System.out.println("You picked the 10 of " + Suit);
        break;
    case 11:
        System.out.println("You picked the Jack of " + Suit);
        break;
    case 12:
        System.out.println("You picked the Queen of " + Suit);
        break;
    case 13:
        System.out.println("You picked the King of " + Suit);
        break;

    
}
    
    
    
    
    
    
    
    }
}