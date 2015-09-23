//Josh Stuttman
//9-6-15
//CSE2
//
//  Compile the program
//      javac Arithmetic.java
//  Run the program
//      java Arithmetic//

// This program will calculate the total cost of each item with the sales 
//   tax, the toal cost of all purchases before tax, and the total cost 
//   with the tax.

//  Class
public class Arithmetic{
    
//  Main Method
public static void main(String[] args) {
    
//Given:
//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
double sockCost$=2.58;
//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;
//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
//sales tax
double taxPercent=0.06;


//total cost of socks
double totalSockCost$ = nSocks * sockCost$;
//tax of socks
double socksTax$ = totalSockCost$ * taxPercent;
//total cost of glasses
double totalGlassesCost$ = nGlasses * glassCost$;
//tax of glasses
double glassesTax$ = totalGlassesCost$ * taxPercent;
//total cost of envelopes
double totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
//tax of envelopes
double envelopesTax$ = totalEnvelopeCost$ *taxPercent;
//total cost of all items pre-tax
double totalCostPreTax$ = totalSockCost$ + totalEnvelopeCost$ + totalGlassesCost$;
//final cost
double finalCost$ = (totalCostPreTax$ * taxPercent) + totalCostPreTax$;

System.out.println("The total cost of socks was " + totalSockCost$);
System.out.println("The tax of the socks was " + socksTax$);
System.out.println("The total cost of glasses was " + totalGlassesCost$);
System.out.println("The tax of the glasses was " + glassesTax$);
System.out.println("The total cost of envelopes was " + totalEnvelopeCost$);
System.out.println("The tax of the envelopes was " + envelopesTax$);
System.out.println("The total cost of all items before tax was " + totalCostPreTax$);
System.out.println("The total cost of the purchase with tax was " + finalCost$);

//total cost of socks $7.74
//total cost of glasses $13.74
//total cost of envelopes $3.25
//total cost of all items before tax $24.73
//tax on all items $1.48
//total cost with tax $26.21


    
    
    
    
}
}