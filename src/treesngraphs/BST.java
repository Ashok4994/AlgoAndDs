package treesngraphs;
import java.util.Scanner;

class BSTNode {
	BSTNode left,right;
	int data;
	 public BSTNode()
     {
         left = null;
         right = null;
         data = 0;
     }
     /* Constructor */
     public BSTNode(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     /* Function to set left node */
     public void setLeft(BSTNode n)
     {
         left = n;
     }
     /* Function to set right node */ 
     public void setRight(BSTNode n)
     {
         right = n;
     }
     /* Function to get left node */
     public BSTNode getLeft()
     {
         return left;
     }
     /* Function to get right node */
     public BSTNode getRight()
     {
         return right;
     }
     /* Function to set data to node */
     public void setData(int d)
     {
         data = d;
     }
     /* Function to get data from node */
     public int getData()
     {
         return data;
     }  
}
class BSTOp {
	private BSTNode root;
	public BSTOp()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void insert(int data)
    {
        root = insert(root, data);
    }
    
    public BSTNode insert(BSTNode node,int data) {
    	if(node==null) {
    		node= new BSTNode(data);
    	} else {
    		if(node.getData()<data) {
    			node.left=insert(node.left,data);
    		}else 
    			node.right=insert(node.right,data);
    		}
    	
    	return node;
    }
    
    public void delete(int k)
    {
        if (isEmpty())
            System.out.println("Tree Empty");
        else
        {
            root = delete(root, k);
            System.out.println(k+ " deleted from the tree");
        }
    }
    public BSTNode delete(BSTNode root,int k) {
    	BSTNode n,lt,rt,p,p2;
    	if(root.getData()==k) {
    		lt=root.getLeft();
    		rt=root.getRight();
    		if(lt==null && rt==null) {
    			return null;
    		}
    		else if(lt==null) {
    			p=rt;
    			return p;
    		}else if(rt==null) {
    			p=lt;
    			return p;
    		}else {
    			p2=rt;
    			p=rt;
    			while(p.left!=null) {
    				p=p.left;
    			} 
    			p.setLeft(lt);
    			
    		}
    	}
    	if(k<root.getData()) {
    		n=delete(root.left,k);
    		root.setLeft(n);
    	}else {
    		n=delete(root.right,k);
    		root.setRight(n);
    	}
    return root;
    }
    
    
}

public class BST {
	
	 public static void main(String[] args)
	    {                 
	      
	 Scanner scan = new Scanner(System.in);
     /* Creating object of BST */
     BST bst = new BST(); 
     System.out.println("Binary Search Tree Test\n");          
     char ch;
     /*  Perform tree operations  */
     do    
     {
         System.out.println("\nBinary Search Tree Operations\n");
         System.out.println("1. insert ");
         System.out.println("2. delete");
         int choice = scan.nextInt();            
         switch (choice)
         {
         case 1 : 
             System.out.println("Enter integer element to insert");
             bst.insert( scan.nextInt() );                     
             break;                          
         case 2 : 
             System.out.println("Enter integer element to delete");
             bst.delete( scan.nextInt() );                     
             break; 
         }
         System.out.println("\nDo you want to continue (Type y or n) \n");
         ch = scan.next().charAt(0);                        
     } while (ch == 'Y'|| ch == 'y');               
 }
}

