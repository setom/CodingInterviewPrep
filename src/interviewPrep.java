
public class interviewPrep {

	public static void main(String[] args) {
		
		System.out.println("Cracking the Coding Interview\n\t Prep work: Matt Seto\n");
		System.out.println("*******************************************************\n");
	
		ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
		
		String nonUnique = "Matthew";
		String unique = "Ketchup";
		
		//question 1.1
		System.out.println("1.1: Find if a string has all unique characters");
		arraysAndStrings.containsUniqueCharacters(nonUnique);
		arraysAndStrings.containsUniqueCharacters(unique);
		System.out.println();
		
		//question 1.2
		System.out.println("1.2: Implement a function void reverse (string) that reverses a string");
		arraysAndStrings.reverseString(nonUnique);
		System.out.println();
		
	}
	
}
