
public class ArraysAndStringsHelper {

	//constructor
	public ArraysAndStringsHelper(){
	}
	
	//run the Chapter 1 problems
	public void runChapter1(){
		
		ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
		
		String nonUnique = "Matthew";
		String unique = "Ketchup";
		String hello = "Hello World Test";
		
		//question 1.1
		System.out.println("1.1: Find if a string has all unique characters");
		arraysAndStrings.containsUniqueCharacters(nonUnique);
		arraysAndStrings.containsUniqueCharacters(unique);
		System.out.println();
		
		//question 1.2
		System.out.println("1.2: Implement a function void reverse (string) that reverses a string");
		arraysAndStrings.reverseString(nonUnique);
		System.out.println();
		
		
		//question 1.4
		System.out.println("1.4: Implement a function to replaces spaces in a string with %20");
		arraysAndStrings.replaceSpaces(hello);
		System.out.println();
	}

	
}
