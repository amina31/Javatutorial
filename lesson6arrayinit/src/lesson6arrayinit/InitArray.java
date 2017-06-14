/**
 * 
 */
package lesson6arrayinit;

//Creating an array.

public class InitArray 
{
public static void main( String args[] )
{
   int array[]; // declare array named array

   array = new int[ 10 ]; // create the space for array
   
   System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings

   // output each array element's value 
   for ( int counter = 0; counter < array.length; counter++ )
      System.out.printf( "%5d%8d\n", counter, array[ counter ] );
} // end main
} // end class InitArray
