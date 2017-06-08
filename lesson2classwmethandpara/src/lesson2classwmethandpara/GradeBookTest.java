/**
 * 
 */
package lesson2classwmethandpara;

// It Creates GradeBook object and pass a String to 
// its displayMessage method.


import java.util.Scanner;     // here  program uses Scanner

public class GradeBookTest
{
// main method begins program execution
public static void main( String args[] )
{ 
   // create Scanner to obtain input from command window
   Scanner input = new Scanner( System.in );

   // create a GradeBook object and assign it to myGradeBook
   GradeBook myGradeBook = new GradeBook(); 

   // prompt for and input course name
   System.out.println( "Please enter the course name:" );
   String courseName = input.nextLine(); // read a line of text
   System.out.println(); // outputs a blank line

   // call myGradeBook's displayMessage method 
   // and pass courseName as an argument
   myGradeBook.displayMessage( courseName );
} // end main

} // end class GradeBookTest