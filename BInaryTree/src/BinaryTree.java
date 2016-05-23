
public class BinaryTree {

	Node root;
	public BinaryTree(){
		
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
}

//Tree, Stack, Robot, Square