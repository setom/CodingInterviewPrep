
public class interviewPrep {

	public static void main(String[] args) {
		
		System.out.println("Cracking the Coding Interview\n\t Prep work: Matt Seto\n");
		System.out.println("*******************************************************\n");
	
		//call the Arrays and Strings helper class to run all of the problems from the first chapter
		ArraysAndStringsHelper aashelper = new ArraysAndStringsHelper();
		aashelper.runChapter1();
		
		//call the Linked Lists helper and run the problens
		LinkedListsHelper llhelper = new LinkedListsHelper();
		llhelper.runChapter2();
		
	}
	
}
