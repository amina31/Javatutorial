import java.util.Scanner;

/**
 * 
 */

/**
 * @author Amina
 *
 */
import java.util.Scanner;
public class Comparision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner input = new Scanner( System.in );
  int number1;
  int number2;
  System.out.print("Enter first integer");
  number1 = input.nextInt();
  System.out.print("Enter second integer");
  number2 = input.nextInt();
  if ( number1 == number2 )
	System.out.printf("%d == %d\n",number1,number2);
  if ( number1 != number2 )
	System.out.printf("%d != %d\n",number1,number2);
  if ( number1 < number2 )
	System.out.printf("%d < %d\n",number1,number2);
  if ( number1 > number2 )
	System.out.printf("%d > %d\n",number1,number2);
  if ( number1 <= number2 )
	System.out.printf("%d <= %d\n",number1,number2);
  if ( number1 >= number2 )
	 System.out.printf("%d >= %d\n",number1, number2);
			

	}

}
