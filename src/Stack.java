
public class Stack {

	Node top = null;
	
	//constructor
	public Stack(Node n){
		top = n;
	}
	
	//push a new node onto the stack
	public void push(Node n){
		if (top == null){
			top = n;
		} else {
			n.next = top;
			top = n;
		}
	}
	
	//pop the top node off of the stack
	public Node pop(){
		if(top == null){
			return null;
		} else {
			Node toReturn = top;
			top = top.next;
			return toReturn;
		}
	}
	
	//peek at the top node of the stack (do not remove it)
	public Node peek(){
		if(top == null){
			return null;
		} else {
			return top;
		}
	}
}
