/**
* Least Common Ancestor in Binary Search Tree
* 
* Simple implementation of a common interview question
**/
class LCAofBST{

   static class Node{
      int data;
      Node left;
      Node right;
   }

   private void buildTree(Node root){
         insertNode(root,15);
         insertNode(root,17);
         insertNode(root,14);
         insertNode(root,18);
         insertNode(root,13);
         insertNode(root,19);
         insertNode(root,12);
         insertNode(root,20);
         insertNode(root,11);
         insertNode(root,21);
         insertNode(root,10);
         insertNode(root,22);
         insertNode(root,9);
        
   }
  
   private void printTree(Node root){
      if(root == null){return;}
      
         System.out.println(root.data);
         printTree(root.left);
         printTree(root.right);
   }
 
   private void insertNode(Node root, int data){
      Node temp = new Node();
      temp.data = data;

      Node parent;
      while(root != null){
         parent = root;
         if(root.data > data){
            root = root.left;
            if(root == null){parent.left = temp; break;}
         }
         else{

            root = root.right;
            if(root == null){parent.right = temp; break;}
         }
      }
   }

   /**
   * Core algorithm for Least Common Ancestor
   * By definition all left children or a 
   * node in the tree are smaller than the parent
   * and all right nodes are larger. So recurse
   * on the tree until this is not the case.
   **/
   private Node lca(Node root, int a, int b){
      if(a < root.data && b < root.data){
         return lca(root.left, a,b);
      }
      if(a > root.data && b > root.data){
         return lca(root.right,a,b); 
      }

      return root; 
   }

   public static void main(String[] args){
      Node root = new Node();
      root.data = 16;

      LCAofBST lca = new LCAofBST();  
      lca.buildTree(root);
      lca.printTree(root);
      System.out.println("The least common ancestor of 11 and 17 is " + lca.lca(root,11,17).data);
      System.out.println("The least common ancestor of 9 and 20 is " + lca.lca(root,9,20).data);
       
    
   }
}
