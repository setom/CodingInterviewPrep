
public class StacksAndQueues {

	// constructor
	public StacksAndQueues() {

	}

	public void testStack() {
		Stack st = new Stack(new Node(1));

		System.out.println("Push values into stack: 1, 2, 3, 4, 5");
		st.push(new Node(2));
		st.push(new Node(3));
		st.push(new Node(4));
		st.push(new Node(5));
		System.out.println("Pop values from stack and print data:");

		while (st.peek() != null) {
			System.out.print(st.pop().data + " ");
		}
		System.out.println("\n");
	}

	public void testQueue() {
		Queue q = new Queue(new Node(1));

		System.out.println("Enqueue values to queue: 1, 2, 3, 4, 5");
		q.enqueue(new Node(2));
		q.enqueue(new Node(3));
		q.enqueue(new Node(4));
		q.enqueue(new Node(5));
		System.out.println("Dequeue values from queue and print data: ");

		while (q.peek() != null) {
			System.out.print(q.dequeue().data + " ");
		}
		System.out.println("\n");

	}

	/**
	 * Question 3.1 Implement three stacks using a single array
	 */
	private class ArrayStacks {
		// three stacks implemented in an array, fixed stack size of 5 for total
		// of 15 array spaces
		int[] arr = new int[15];
		int st1 = 0;
		int st2 = 5;
		int st3 = 10;

		public void push(int which, int val) {
			switch (which) {
			case 1:
				arr[st1] = val;
				st1++;
				break;
			case 2:
				arr[st2] = val;
				st2++;
				break;
			case 3:
				arr[st3] = val;
				st3++;
				break;
			default:
				break;
			}
		}
		
		public int pop(int which){
			int toReturn = -1;
			switch (which) {
			case 1:
				st1--;
				toReturn = arr[st1];
				return toReturn;
			case 2: 
				st2--;
				toReturn = arr[st2];
				return toReturn;
			case 3:
				st3--;
				toReturn = arr[st3];
				return toReturn;
			default:
				return toReturn;
			}
		}
		
		public void printArray(){
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + ", ");
			}
			System.out.println();
		}
	}

	public void arrayStacks(){
		System.out.println("Using a single array, implement 3 stacks: ");
		ArrayStacks arrstacks = new ArrayStacks();
		
		arrstacks.push(1,1);
		arrstacks.push(2,1);
		arrstacks.push(3,1);
		arrstacks.push(1,2);
		arrstacks.push(2,2);
		arrstacks.push(3,2);
		arrstacks.push(1,3);
		arrstacks.push(2,3);
		arrstacks.push(3,3);
		System.out.println("Pushed 1, 2, 3, to all three stacks, current state of array: ");
		arrstacks.printArray();
		
		System.out.println("Pop from stack 1: " + arrstacks.pop(1));
		System.out.println("Pop from stack 2: " + arrstacks.pop(2));
		System.out.println("Pop from stack 3: " + arrstacks.pop(3));
		
		System.out.println("New state of array: ");
		arrstacks.printArray();
		
		System.out.println("Pop from stack 1: " + arrstacks.pop(1));
		System.out.println("Pop from stack 2: " + arrstacks.pop(2));
		System.out.println("Pop from stack 3: " + arrstacks.pop(3));
		
		System.out.println("New state of array: ");
		arrstacks.printArray();
	}

	/**
	 * Question 3.2
	 * Design a stack which can push, pop and has min, which returns the min element in the stack
	 * Push, pop and min must run in O(1) time
	 */
	

}
