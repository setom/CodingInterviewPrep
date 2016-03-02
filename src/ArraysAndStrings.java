

/**
 * Arrays and Strings
 * Chapter 1 of the book
 * @author Matthew
 *
 */

public class ArraysAndStrings {
	
	//constructor
	public ArraysAndStrings(){
		
	}

	/**
	 * Question 1.1
	 * Implement an algorithm to determine if a string has all unique characters
	 * What if you can not use additional data structures. 
	 * 
	 * Solution: 
	 * go through the string one character at a time and check if there is a duplicate
	 * if you find a duplicate immediately return false
	 * 
	 *  Runtime: O(n^2)
	 */
	public boolean containsUniqueCharacters(String input){
		//for each character in the string
		for(int i = 0; i < input.length(); i++){
			char c = input.charAt(i);
			for(int j = 0; j < input.length(); j++){
				char d = input.charAt(j);
				if ((c == d) && (i != j)) {
					System.out.println("The String: \'" + input + "\' DOES NOT contain uniqie characters");
					return false;
				}
			}
		}
		System.out.println("The String: \'" + input + "\' DOES contain uniqie characters");
		return true;
	}

	
	/**
	 * Question 1.2
	 * Implement a function in C or C++ (I have done it in JAVA) that accepts a string and prints it out in reverse
	 * And returns void
	 * 
	 * Solution: 
	 * For C, You take a pointer for the beginning and the end of the char array
	 * Swap those characters and move inwards until you meet in the middle
	 * For Java, you need to change it to a character array
	 * Then run through from the front and back and swap characters
	 * 
	 * Runtime: O(n)
	 */
	
	public void reverseString(String input){
		char[] inputArr = input.toCharArray();
		System.out.println("Change \'"+input+"\' to its reverse");
		int index = 0;
		for(int i=inputArr.length-1; i >= inputArr.length/2; i--){
			char temp = inputArr[i];
			inputArr[i] = inputArr[index];
			inputArr[index] = temp;
			index++;
		}

		//print the string
		for(int i = 0; i<inputArr.length; i++){
			System.out.print(inputArr[i]);
		}
		
	}
}
