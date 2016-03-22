
public class Queue {

	Node first = null;
	Node last = null;
	
	//constructor
	public Queue(Node n){
		first = n;
		last = n;
	}
	
	//enqueue a new node to the queue
	public void enqueue(Node n){
		if (first == null){
			first = n;
			last = n;
		} else {
			last.next = n;
			last = last.next;
		}
	}
	
	//dequeue the first node
	public Node dequeue(){
		if(first == null){
			return null;
		} else {
			Node toReturn = first;
			first = first.next;
			return toReturn;
		}
	}
	
	//peek at the first node
	public Node peek(){
		if(first == null){
			return null;
		} else {
			return first;
		}
	}
}
