/**
 * 
 */
package hash1;

import java.util.Scanner;

public class Countingtree {
	static Scanner input = new Scanner(System.in);
	String stream;
	String[] splitstr;
	int arraySize;
	LetterList theList;
	public Countingtree(){
		System.out.println("enter a string");
		stream = input.nextLine();
		arraySize = stream.length();
		splitstr = stream.split("");
		theList = new LetterList();
	}
	public void addToList(){
		for( int i =0; i < arraySize; i++){
			theList.add(splitstr[i]);
		}
	}
	public void print(){
		System.out.printf("%s %20s","Letter","# of repeats");
		theList.print();
	}
}

	class Letter{ 
		Letter down,next;
		String letter;
		public Letter(String letter){
			this.letter = letter;
			next = null;
			down = null;
		}
	}  
	
	
    class LetterList{
    	Letter head;
    	public LetterList(){
    		head = new Letter(null);
    	}
    	public void add(String letter){
    		Letter current = head;
    		Letter newLetter = new Letter(letter);
    		
    		if(current.letter == null){
    			current.letter = newLetter.letter;
    			return;
    		}
    		while(current.down != null){
    			Letter repeat = current;
    			if(current.letter.equals(newLetter.letter)){
    				repeat = current;
        			while(repeat.next!= null){
        				repeat = repeat.next;
        			}
        			repeat.next = newLetter; 
        			return; 
    			}
    			current = current.down; 
    		}
    		
    		if(current.letter.equals(newLetter.letter)){
    			Letter repeat = current;
    			while(repeat.next!= null){
    				repeat = repeat.next;
    				
    			}
    			repeat.next = newLetter;
    			return;
    		}
    		current.down = newLetter; 
    		
    	}
    	
    	public int getSize(Letter current){
    		int size = 0;
    		if(current.letter != null){
    			size = setSize(current,size);
    		}
    		return size;
    	}
    	public int setSize(Letter current,int size){
    		while(current.next != null){
    			size++;
    			current = current.next;
    		}
    		size++;
    		return size;
    	}
    	public void print(){
    		Letter current = head;
    		
    		
    		while(current.down != null){
    			System.out.printf("%s %15s\n",current.letter,getSize(current));
    			current = current.down;
    		}
    		System.out.printf("%s %15s",current.letter,getSize(current));
    		//	Letter repeat = current;
    			 
    		//	while(repeat.next != null){
    		//		System.out.print(repeat.letter + "--->" );
    		//
    		//repeat = repeat.next; 
    		//	}
    			
    		//	System.out.println();
    		//	System.out.println("|");
    		//	current = current.down;	
    		//}
    	//	while(current.next != null){
    	//		System.out.print(current.letter + "--->");
    	//		current = current.next;		
    	//	}
    	//	System.out.println(current.letter);
    	}	
  }
