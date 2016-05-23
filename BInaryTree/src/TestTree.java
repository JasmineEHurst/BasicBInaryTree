
public class TestTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree Tree = new BinaryTree();
		Tree.addNode(40);
		Tree.addNode(20);
		Tree.addNode(50);
		Tree.addNode(10);
		Tree.addNode(30);
		
		Tree.inOrderTraverseTree(Tree.root);
		System.out.println("");
		Tree.preorderTraverseTree(Tree.root);
		System.out.println("");
		Tree.postOrderTraverseTree(Tree.root);
	}

}
