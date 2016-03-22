
public class LinkedListsHelper {

	
	//constructor
	public LinkedListsHelper(){
		
	}
	
	//run chapter 2 problems
	public void runChapter2(){
		LinkedLists linkedLists = new LinkedLists();
		LinkedList ll = linkedLists.createRandomList();
		
		System.out.println("*************** Chapter 2, Linked Lists ***********************\n");
		
		linkedLists.removeDuplicates(ll);
		
		ll = linkedLists.createRandomList();
		System.out.println();
		//find 3rd last element (GUARANTEE THAT K is within bounds, no error handling for that)
		linkedLists.findKthLast(ll, 4);
		System.out.println();
		
		//pass in a node from the list that you want removed
		linkedLists.printList(ll);
		System.out.println("Remove Node: " + ll.head.next.next.data + " without access to the entire list");
		linkedLists.removeFromMiddle(ll.head.next.next);
		System.out.println("New List: ");
		linkedLists.printList(ll);
		
		System.out.println();
		ll = linkedLists.createPalindromeList();
		if(linkedLists.isPalindrome(ll)){
			System.out.println("The list IS a palindrome");
		} else {
			System.out.println("The list IS NOT a palindrome");
		}
		
		ll = linkedLists.createRandomList();
		if(linkedLists.isPalindrome(ll)){
			System.out.println("The list IS a palindrome");
		} else {
			System.out.println("The list IS NOT a palindrome");
		}
	}
}
