
public class Node {
	Node leftChild;
	Node rightChild;
	int data;
	
	public Node(){
		
	}
	
	public Node(int data){
		this.data = data;
	}
	
	public String toString(){
		return "" + data;
	}
}
