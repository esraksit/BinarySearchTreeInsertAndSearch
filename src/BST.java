
public class BST {
	
	public static  BTNode search(BTNode root,int element) {
		if(root==null||root.data==element) {
		System.out.println(root);
			return root;
		}
		if (root.data < element)
		       return search(root.rchild, element);
		 
		   
		    return search(root.lchild, element);
		
		
		
	}
	public static BTNode insert(BTNode root,int element) {
	if (root == null) {
		BTNode nd = new BTNode(element);
        return nd;		}
   
	else if (element > root.data) {
    	root.rchild = insert(root.rchild, element);
	}
    
	else if (element < root.data) {
    	root.lchild = insert(root.lchild, element);
    }

    return root;
	
}
	
	
	public static void main (String[] args) {      
		int element=1;
		
		
		BTNode root=new BTNode(4);		
		root.lchild=new BTNode(12);
		root.rchild=new BTNode(5);
		root.rchild.lchild=new BTNode(1);
		root.rchild.rchild=new BTNode(28);
	
		search(root,element);
		
	}
}
