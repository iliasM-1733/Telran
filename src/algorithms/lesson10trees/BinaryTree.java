package algorithms.lesson10trees;

// A Java program to introduce Binary Tree
public class BinaryTree {

    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key) { root = new Node(key); }

    BinaryTree() { root = null; }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // create root
        tree.root = new Node(1);

		/* following is the tree after above statement

			1
			/ \
		null null	 */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

		/* 2 and 3 become left and right children of 1
			1
			/	 \
		2	 3
		/ \	 / \
	null null null null */

        tree.root.left.left = new Node(4);
		/* 4 becomes left child of 2
					1
				/	 \
			2		 3
			/ \	 / \
			4 null null null
		/ \
		null null
		*/
    }
}
