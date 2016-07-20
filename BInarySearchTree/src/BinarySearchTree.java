
public class BinarySearchTree {

	Node root;
	public BinarySearchTree(){
		
	}
	//Recursive function for inserting a node
	public void insert(Node root, int data){
		//Base case
		if(root == null){
			root = new Node(data);
		}else if(root.data < data){
			insert(root.rightChild, data);
		}else{
			insert(root.leftChild, data);
		}
	}
	
	public void addNode(int data){
		Node node = new Node(data);
		if(root == null){
			root = node;
		}else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(data < focusNode.data){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = node;
						return;
					}
				}else{
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = node;
						return;
					}
				}
			}
		}
	}
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			preorderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode.data);
			preorderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void preorderTraverseTree(Node focusNode){
		if(focusNode != null){
			System.out.println(focusNode.data);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void postOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode.data);
		}
	}
	public Node findNode(int data){
		Node focusNode = root;
		while(focusNode.data != data){
			if(data < focusNode.data){
				focusNode = focusNode.leftChild;
			}else{
				focusNode = focusNode.rightChild;
			}
			if(focusNode == null){
				return null;
			}
		}
		return focusNode;
	}
	//Recursive function for searching a node
	public Node search(Node root,int data){
		//Base cases
		if(root.data == data || root == null){
			return root;
		}else if(root.data > data){
			return search(root.leftChild, data);
		}else{
			return search(root.rightChild, data);
		}
	}
	
	public Node minimum(){
		Node focusNode = root;
		while(focusNode.leftChild != null){
			focusNode = focusNode.leftChild;
		}
		
		return focusNode;
	}
}

