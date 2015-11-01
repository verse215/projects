class LCAofBST{

   static class Node{
      int data;
      Node left;
      Node right;
   }

   private void buildTree(Node root){
      for(int i = 0; i < 16; i++){
         insertNode(root,i);
      }
   }
  
   private void printTree(Node root){
      if(root == null){return;}
      
      if(root.left !=null){
         System.out.println(root.data);
         printTree(root.left);
      }
      if(root.right != null){
         System.out.println(root.data);
         printTree(root.right);
      }
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
 
   public static void main(String[] args){
      Node root = new Node();
      root.data = -1;

      LCAofBST lca = new LCAofBST();  
      lca.buildTree(root);
      lca.printTree(root);
    
   }
}
