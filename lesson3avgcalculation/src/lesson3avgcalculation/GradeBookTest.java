/**
 * 
 */
package lesson3avgcalculation;

//Create GradeBook object and invoke its classAverage method.

public class GradeBookTest
{
public static void main( String args[] )
{
   // create GradeBook object myGradeBook and 
   // pass course name to constructor
   Gradebook myGradeBook = new Gradebook( 
      "CS101 Introduction to Java Programming" );

   myGradeBook.displayMessage(); // display welcome message
   myGradeBook.determineClassAverage(); // find average of 10 grades
} // end main

} // end class GradeBookTest
