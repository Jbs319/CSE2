//Josh Stuttman
//9-21-15
//CSE2

//This program will...

//Import random class
import java.util.Random;

// Define class
public class PokerHandCheck{

// Main method
    public static void main(String[] args){

//Generate 5 different random numbers between 1 and 52
        int randomCard1 = (int)(Math.random()*52)+1;
        int randomCard2 = (int)(Math.random()*52)+1;
        int randomCard3 = (int)(Math.random()*52)+1;
        int randomCard4 = (int)(Math.random()*52)+1;
        int randomCard5 = (int)(Math.random()*52)+1;
        
        
        //Declare suit variable
        String Suit1 = "";
        String Suit2 = "";
        String Suit3 = "";
        String Suit4 = "";
        String Suit5 = "";
        
        
        
        
        
        //Set if statements for suits
        if (randomCard1>=1 && randomCard1<=13){
        Suit1="diamonds";}
        else if (randomCard1>=14 && randomCard1<=26){
        Suit1="clubs";}
        else if (randomCard1>=27 && randomCard1<=39){
        Suit1="hearts";}
        else if (randomCard1>=40 && randomCard1<=52){
        Suit1="spades";}
        
        if (randomCard2>=1 && randomCard2<=13){
        Suit2="diamonds";}
        else if (randomCard2>=14 && randomCard2<=26){
        Suit2="clubs";}
        else if (randomCard2>=27 && randomCard2<=39){
        Suit2="hearts";}
        else if (randomCard2>=40 && randomCard2<=52){
        Suit2="spades";}
        
        if (randomCard3>=1 && randomCard3<=13){
        Suit3="diamonds";}
        else if (randomCard3>=14 && randomCard3<=26){
        Suit3="clubs";}
        else if (randomCard3>=27 && randomCard3<=39){
        Suit3="hearts";}
        else if (randomCard3>=40 && randomCard3<=52){
        Suit3="spades";}
        
        if (randomCard4>=1 && randomCard4<=13){
        Suit4="diamonds";}
        else if (randomCard4>=14 && randomCard4<=26){
        Suit4="clubs";}
        else if (randomCard4>=27 && randomCard4<=39){
        Suit4="hearts";}
        else if (randomCard4>=40 && randomCard4<=52){
        Suit4="spades";}
        
        if (randomCard1>=1 && randomCard1<=13){
        Suit5="diamonds";}
        else if (randomCard5>=14 && randomCard5<=26){
        Suit5="clubs";}
        else if (randomCard5>=27 && randomCard5<=39){
        Suit5="hearts";}
        else if (randomCard5>=40 && randomCard5<=52){
        Suit5="spades";}
        
        
        switch (randomCard1%13){
            case 1: 
                System.out.println("You picked the Ace of " + Suit1);
                break;
            case 2:
                System.out.println("You picked the 2 of " + Suit1);
                break;
            case 3:
                System.out.println("You picked the 3 of " + Suit1);
                break;
            case 4:
                System.out.println("You picked the 4 of " + Suit1);
                break;
            case 5:
                System.out.println("You picked the 5 of " + Suit1);
                break;
            case 6:
                System.out.println("You picked the 6 of " + Suit1);  
                break;
            case 7:
                System.out.println("You picked the 7 of " + Suit1);
                break;
            case 8:
                System.out.println("You picked the 8 of " + Suit1);
                break;
            case 9:
                System.out.println("You picked the 9 of " + Suit1);
                break;
            case 10:
                System.out.println("You picked the 10 of " + Suit1);
                break;
            case 11:
                System.out.println("You picked the Jack of " + Suit1);
                break;
            case 12:
                System.out.println("You picked the Queen of " + Suit1);
                break;
            case 13:
                System.out.println("You picked the King of " + Suit1);
                break;
        }
        
        
        switch (randomCard2%13){
            case 1: 
                System.out.println("You picked the Ace of " + Suit2);
                break;
            case 2:
                System.out.println("You picked the 2 of " + Suit2);
                break;
            case 3:
                System.out.println("You picked the 3 of " + Suit2);
                break;
            case 4:
                System.out.println("You picked the 4 of " + Suit2);
                break;
            case 5:
                System.out.println("You picked the 5 of " + Suit2);
                break;
            case 6:
                System.out.println("You picked the 6 of " + Suit2);  
                break;
            case 7:
                System.out.println("You picked the 7 of " + Suit2);
                break;
            case 8:
                System.out.println("You picked the 8 of " + Suit2);
                break;
            case 9:
                System.out.println("You picked the 9 of " + Suit2);
                break;
            case 10:
                System.out.println("You picked the 10 of " + Suit2);
                break;
            case 11:
                System.out.println("You picked the Jack of " + Suit2);
                break;
            case 12:
                System.out.println("You picked the Queen of " + Suit2);
                break;
            case 13:
                System.out.println("You picked the King of " + Suit2);
                break;
        }
        
        
        switch (randomCard3%13){
            case 1: 
                System.out.println("You picked the Ace of " + Suit3);
                break;
            case 2:
                System.out.println("You picked the 2 of " + Suit3);
                break;
            case 3:
                System.out.println("You picked the 3 of " + Suit3);
                break;
            case 4:
                System.out.println("You picked the 4 of " + Suit3);
                break;
            case 5:
                System.out.println("You picked the 5 of " + Suit3);
                break;
            case 6:
                System.out.println("You picked the 6 of " + Suit3);  
                break;
            case 7:
                System.out.println("You picked the 7 of " + Suit3);
                break;
            case 8:
                System.out.println("You picked the 8 of " + Suit3);
                break;
            case 9:
                System.out.println("You picked the 9 of " + Suit3);
                break;
            case 10:
                System.out.println("You picked the 10 of " + Suit3);
                break;
            case 11:
                System.out.println("You picked the Jack of " + Suit3);
                break;
            case 12:
                System.out.println("You picked the Queen of " + Suit3);
                break;
            case 13:
                System.out.println("You picked the King of " + Suit3);
                break;
        }
        
        
        switch (randomCard4%13){
            case 1: 
                System.out.println("You picked the Ace of " + Suit4);
                break;
            case 2:
                System.out.println("You picked the 2 of " + Suit4);
                break;
            case 3:
                System.out.println("You picked the 3 of " + Suit4);
                break;
            case 4:
                System.out.println("You picked the 4 of " + Suit4);
                break;
            case 5:
                System.out.println("You picked the 5 of " + Suit4);
                break;
            case 6:
                System.out.println("You picked the 6 of " + Suit4);  
                break;
            case 7:
                System.out.println("You picked the 7 of " + Suit4);
                break;
            case 8:
                System.out.println("You picked the 8 of " + Suit4);
                break;
            case 9:
                System.out.println("You picked the 9 of " + Suit4);
                break;
            case 10:
                System.out.println("You picked the 10 of " + Suit4);
                break;
            case 11:
                System.out.println("You picked the Jack of " + Suit4);
                break;
            case 12:
                System.out.println("You picked the Queen of " + Suit4);
                break;
            case 13:
                System.out.println("You picked the King of " + Suit4);
                break;
        }
        
        switch (randomCard5%13){
            case 1: 
                System.out.println("You picked the Ace of " + Suit5);
                break;
            case 2:
                System.out.println("You picked the 2 of " + Suit5);
                break;
            case 3:
                System.out.println("You picked the 3 of " + Suit5);
                break;
            case 4:
                System.out.println("You picked the 4 of " + Suit5);
                break;
            case 5:
                System.out.println("You picked the 5 of " + Suit5);
                break;
            case 6:
                System.out.println("You picked the 6 of " + Suit5);  
                break;
            case 7:
                System.out.println("You picked the 7 of " + Suit5);
                break;
            case 8:
                System.out.println("You picked the 8 of " + Suit5);
                break;
            case 9:
                System.out.println("You picked the 9 of " + Suit5);
                break;
            case 10:
                System.out.println("You picked the 10 of " + Suit5);
                break;
            case 11:
                System.out.println("You picked the Jack of " + Suit5);
                break;
            case 12:
                System.out.println("You picked the Queen of " + Suit5);
                break;
            case 13:
                System.out.println("You picked the King of " + Suit5);
                break;
        }
            
        int counter = 0;
        
        if (randomCard1%13==randomCard2%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }
        if (randomCard1%13==randomCard3%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }
        if (randomCard1%13==randomCard4%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }
        if (randomCard1%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }
        if (randomCard2%13==randomCard3%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }    
        if (randomCard2%13==randomCard4%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }    
        if (randomCard2%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }    
        if (randomCard3%13==randomCard4%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }
        if (randomCard3%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }  
        if (randomCard4%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have a pair!");
        }    
        if (randomCard1%13==randomCard2%13 && randomCard1%13==randomCard3%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard1%13==randomCard2%13 && randomCard1%13==randomCard4%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard1%13==randomCard2%13 && randomCard1%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard1%13==randomCard3%13 && randomCard1%13==randomCard4%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard1%13==randomCard3%13 && randomCard1%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard2%13==randomCard3%13 && randomCard2%13==randomCard4%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard2%13==randomCard3%13 && randomCard2%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard2%13==randomCard4%13 && randomCard4%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        if (randomCard3%13==randomCard4%13 && randomCard3%13==randomCard5%13){
            counter = counter + 1;
            System.out.println("You have three of a kind!");
        }
        else if (counter == 0){
            System.out.println("You have a high hand!");
        }
    }
}
    
    