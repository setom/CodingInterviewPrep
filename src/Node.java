
public class Node {

	Node next = null;
	int data;
	
	//constructor 
	public Node(int d){
		data = d;
		next = null;
	}
	
	//get data
	public int getValue(){
		return data;
	}
}
