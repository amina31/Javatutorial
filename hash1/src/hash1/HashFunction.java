/**
 * 
 */
package hash1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class HashFunction {
    Scanner input = new Scanner(System.in);
	String stream;
	char[] theArray;
	int arraySize;
	
	public HashFunction(){  // constructor begins
		System.out.println("enter string");
		stream = input.nextLine();
		arraySize = stream.length();
		theArray = new char[arraySize];
		Arrays.fill(theArray,'0');
	}  // constructor ends
	public void hashFuction(){  // start method
		int arrayIndex;
		char elementVal;
		for(int i = 0; i < stream.length();i++){ // for begins
			elementVal = stream.charAt(i);
			arrayIndex = (i * 27 + ((int)elementVal)) % arraySize;  // formula no of alphabet and whitespace
		//	while(theArray[arrayIndex] != '0'){  // while begins for any collisions that happen
			Letter newLetter = new Letter(elementVal);
			
				
				
				
			}  // end of while
		}  // for ends
			
	}  // end method
	

}

class Letter{
	Letter next;
	char letter;
	public Letter(char letter){
		this.letter = letter;
		next = null;	
	}
}

class LetterList{
	Letter head;
	public LetterList(){
		head = new Letter('0');
	}
	public void push(char value){  // method begins
		Letter current = head;
		Letter newLetter = new Letter(value);
		if(current.letter == '0'){  // begin if
			current.letter = value;
			return;
		}  // end if
		current.next = newLetter;
		
	}  // end of method
	
	
}