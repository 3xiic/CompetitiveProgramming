
public class TreeSort {
	static class Node{
		int key;
		Node left, right;
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	static Node root;
	static void init() {
		root=null;
	}
	static void insert(int key) {
		root=insertRec(root,key);
	}
	static Node insertRec(Node root,int key){
		if(root==null) {
			root= new Node(key);
			return root;
		}
		if(key<root.key) {
			root.left = insertRec(root.left,key);
		} else if (key>root.key) {
			root.right= insertRec(root.right,key);
		}
		return root;
	}
	static void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
	static void treeins(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,4,7,2,11};
		treeins(arr);
		inorderRec(root);
	}

}
