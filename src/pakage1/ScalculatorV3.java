package pakage1;

import java.util.Scanner;

public class ScalculatorV3 {

	 public static void main(String[] args) {

	  // Variables [ camlecaseing ]
	  String empName;
	  double totalhour;
	  double hrate;
	  double grossPay;
	  
	  double netPay=0; // A new Place holder // Zero Default  
	  

	  // Application Starter Text
	  System.out.println("##### Employee Salary Calculator V1.0#######");
	  System.out.println("Please Follow the Instruction ........");

	  // Input

	//  System.out.println("Enter Employee Name : ");
	//  empName = scanMachine.nextLine();

	  
	  
	  //==>> Totoal Hour Of An Employee 
	  boolean isNumberUnexpected = true;
	  do {
	   // Exception Handling for Scenrio N2
	   try {
	    Scanner scanMachine = new Scanner(System.in);
	    System.out.println("Enter Total Hour : ");
	    totalhour = scanMachine.nextDouble(); // it can be anything by user 
	   }catch(Exception e) { // e is Safe 
	    System.out.println("Not A number Please Enter Between 0 - 40");
	    continue;
	   }
	  
	   // Preventing Putting Wrong NUmber into the System...
	   if(totalhour < 0 ) { // Number is not a number -XYZ < 0
	    System.out.println("Please Enter A Number Between 0 - 40");
	   } else {
	    isNumberUnexpected = false;
	   }
	  } while(isNumberUnexpected==true);  // Until the number is unexpected
	    


	  
	  
	  System.out.println("&&&&&& Very Imporatnt line this Line SHould Print NO mettter wat &&&&&");
	  
	  
	  
	  
	  
	  
	//  System.out.println("Enter Hourly Rate : ");
	//  hrate = scanMachine.nextDouble();
	//
	//
	//  // Process : Gross Pay 
	//  grossPay = totalhour * hrate;
	//  
	//   
	//  // Process : Net Pay  
	//  if(grossPay < 1500) {
	//   netPay = grossPay * (1 - .10);
	//  } else if(grossPay >= 1500 && grossPay < 3000) {
	//   netPay = grossPay * (1 - .20);
	//  } else if(grossPay >= 3000 && grossPay < 4499) {
	//   netPay = grossPay * (1 - .30);
	//  } else if(grossPay >= 4500 && grossPay < 5999) {
	//   netPay = grossPay * (1 - .35);
	//  } else if(grossPay >= 6000 ) {
	//   netPay = grossPay * (1 - .40);
	//  }
	//
	//  
	//  // OutPut
	//  System.out.println("--------- Pay Check --------------------");
	//  System.out.println("Employee Name is  : " + empName);
	//  System.out.println("Total Hour  is  : " + totalhour);
	//  System.out.println("Hourly Rate  is  : " + hrate);
	//  System.out.println("Gross Pay is  : " + grossPay);
	//  System.out.println("Net Pay is  : " + netPay);
	//
	//  System.out.println("--------- ---------- --------------------");
	//
	//  // Application Exit Text
	//  System.out.println("##### Thanks for Using Bye Bye 0#######");

	 }

	}

