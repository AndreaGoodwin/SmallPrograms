/**
 * Purpose: To code a program that allows a user to check to see how many 
 *          violations they have by entering the number of violations and months.
 *          The program will then compare results and let the user know if their 
 *          license is suspended or not.
 * 
 * Programmer: Andrea Goodwin
 * Date: 03/01/2020 14:00
 *
 * 
 */

import java.util.Scanner;


public class Violation {
  
  
  public static void main(String[] args) { 
    
    int violations, months;
    char checkLicense;
    boolean suspendedLicense;
  
    suspendedLicense = false;
    
    Scanner input = new Scanner(System.in);
    
    System.out.printf("%nDo you want to see if you license is suspended?  Enter: 'Y' or 'N' : ");
    checkLicense = input.nextLine().charAt(0);
    while (Character.toUpperCase(checkLicense) == 'Y'){
      if  (Character.toUpperCase(checkLicense) != 'Y'){
       System.exit(0);
      }//end if 
    violations = 0;
    months = 0;
    
    System.out.printf("%nHow many traffic violations have you had?");
    violations = input.nextInt();
    
    System.out.printf("%nWithin a period of how many months were these violations committed?");
    months = input.nextInt();
    
    // if violations are > 3 and <= 12 months or violations are > 6 and < 25 months
    if (suspendedLicense = (violations > 3) && (months <= 12) || (violations > 6) && (months < 25))
    {
      suspendedLicense= true;
      System.out.printf("Your license is suspended!");
    }//end if 
    //print if user enters values that do not qualify them for a suspended license
    else
    {
          System.out.printf("Luck day! Your license is NOT suspended");
    }//end else
    
    //continue statement
    System.out.printf("%nDo you want to see if your license is supended? Enter 'Y' or 'N' : ");
    checkLicense = input.next().charAt(0);
     
      
    } //End While 
    
   System.exit(0);   //exit program when N is selected 
   
  } //End method main
  

} //End class 