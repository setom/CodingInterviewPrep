
public class LinkedList {

	Node head = null;
	Node tail;
	
	//constructor
	public LinkedList(Node n){
		head = n;
		tail = head;
	}
	
	//adds a new node to the tail of a LL
	public void addToTail(Node n){
            n.next = null;
            if (head == null) {
                  head = n;
                  tail = n;
            } else {
                  tail.next = n;
                  tail = n;
            }
	}
}
