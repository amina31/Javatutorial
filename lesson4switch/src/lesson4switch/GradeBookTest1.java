/**
 * 
 */
package lesson4switch;



//Create GradeBook object, input grades and display grade report.

public class GradeBookTest1
{
public static void main( String args[] )
{
   // create GradeBook object myGradeBook and 
   // pass course name to constructor
   GradeBook1 myGradeBook = new GradeBook1( 
      "CS101 Introduction to Java Programming" );

   myGradeBook.displayMessage(); // display welcome message
   myGradeBook.inputGrades(); // read grades from user
   myGradeBook.displayGradeReport(); // display report based on grades
} // end main
} // end class GradeBookTest
