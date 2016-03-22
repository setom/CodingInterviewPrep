import java.util.Random;
import java.util.Stack;

public class LinkedLists {

	// populate a linked list with values 10 random values between 1-9
	public LinkedList createRandomList() {
		Random r = new Random();
		Node newNode = new Node(1);
		LinkedList ll = new LinkedList(newNode);
		for (int i = 0; i < 9; i++) {
			Node n = new Node(r.nextInt(9) + 1);
			ll.addToTail(n);
		}
		return ll;
	}

	//populate a list that is a palindrome
	public LinkedList createPalindromeList(){
		Node newNode = new Node(1);
		LinkedList ll = new LinkedList(newNode);
		ll.addToTail(new Node(2));
		ll.addToTail(new Node(3));
		ll.addToTail(new Node(4));
		ll.addToTail(new Node(5));
		//ll.addToTail(new Node(5));
		ll.addToTail(new Node(4));
		ll.addToTail(new Node(3));
		ll.addToTail(new Node(2));
		ll.addToTail(new Node(1));
		
		return ll;
	}
	
	
	// print the values of a linked list
	public void printList(LinkedList list) {
		Node cur = list.head;
		while (cur != null) {
			System.out.print(cur.data + ", ");
			cur = cur.next;
		}
		System.out.println();
	}

	/**
	 * 2.1 Write code to remove duplicates from an unsorted linked list
	 * Do not use a temp buffer (aka, use a cur and a runner)
	 * 
	 */
	public void removeDuplicates(LinkedList list) {
		System.out.println("Remove the duplicates from a list");
		System.out.println("Input List: ");
		printList(list);
		Node cur = list.head;
		while(cur != null) {
			Node runner = cur;
			while(runner.next != null) {
				if (runner.next.data == cur.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			cur = cur.next;
		}
		System.out.println("Output List: ");
		printList(list);
	}
	
	/**
	 * 2.2
	 * Implement an algorithm to find the kth last element in a linked list
	 * 
	 */
	public void findKthLast(LinkedList list, int k){
		System.out.println("Find the " + k + "th last element in a list");
		printList(list);
		Node cur = list.head;
		Node kth = cur;
		while(k>1 && kth.next != null){
			kth = kth.next;
			k--;
		}
		while(kth.next != null){
			kth = kth.next;
			cur = cur.next;
		}
		System.out.println("kth last element: " + cur.data);
	}
	
	/**
	 * 2.3
	 * Remove a node from the middle of a linked list, you ONLY HAVE ACCESS TO THAT NODE
	 */
	public void removeFromMiddle(Node n){
		n.data = n.next.data;
		n.next = n.next.next;
		
	}
	
	/**
	 * 2.7
	 * Implement a function to determine if a linked list is a palindrome
	 */
	public boolean isPalindrome(LinkedList list){
		System.out.println("Is this list a palindrome?");
		printList(list);

		//find the length of the linked list
		int len = 0;
		Node cur = list.head;
		while(cur != null){
			len++;
			cur = cur.next;
		}
		System.out.println(len + " Elements");
		//if even number, then simply divide the list in half, if not, isolate the middle value and take both sides of it
		//push the frist half onto a stack so they are in reverse order
		int i = len/2;
		cur = list.head;
		Stack<Integer> stack = new Stack<Integer>();
		while(i > 0){
			stack.push(cur.data);
			cur = cur.next;
			i--;
		}
		
		if(len % 2 == 0){
			//if it's even
			
			//pop the stack and compare to the cur...keep going until end or different
			int d = stack.pop();
			while(d == cur.data){
				//if you hit the end of the list then you must be successful
				if (cur.next == null){
					return true;
				}
				d = stack.pop();
				cur = cur.next;
			}
			//if you broke the while loop at some point, you must have failed the check
			return false;
		} else {
			//else there are an odd number of nodes
			//jump over the center node
			cur = cur.next;
			//pop the stack and compare to the cur...keep going until end or different
			int d = stack.pop();
			while(d == cur.data){
				//if you hit the end of the list then you must be successful
				if (cur.next == null){
					return true;
				}
				d = stack.pop();
				cur = cur.next;
			}
			return false;
		}
	}
}
