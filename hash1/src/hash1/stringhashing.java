/**
 * 
 */
package hash1;

import java.util.*;
public class stringhashing {
	static Scanner input = new Scanner(System.in);
	Hashtable<Integer,Character> table = new Hashtable<Integer,Character>();  // key is integer,value is character
	String inputStream;
	int size;
	int[] counter;
	public stringhashing(){
		System.out.println("Enter a string");
		inputStream = input.nextLine();
		inputStream = inputStream.toLowerCase();
	}
	public void tableInput(){  // begin method
		int key = 0;
		for(int i = 0;i < inputStream.length();i++){  // for loop begins
			if(!table.contains(inputStream.charAt(i))){  // begin if
				table.put(key,inputStream.charAt(i));
				key++;
			}   // end of if 
		} //  for loop ends
		counter = new int[key];
		
	} // end method
	public void counter(){  // start method
		int cnt;
		for(int i = 0;i< table.size();i++){  // begin first if
			cnt = 0;
			for( int j = 0;j < inputStream.length();j++){ // begin first for 
				if(table.get(i) == inputStream.charAt(j)){  // starts if
					cnt++;
				}         // ends if
				counter[i]=cnt;
			}  // end of second for
			
		} // end of first for
	}   // end method
	
	public void print(){
		System.out.printf("\n%s%10s\n","letter","# of occurences");
		for( int i = 0;i <table.size();i++){  // start if 
			System.out.printf("%s%10s\n",table.get(i),counter[i]);
		}   // end if
			
		
	}
}
