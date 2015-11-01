class LCAofBST{

   private class Node{
      int data;
      Node left;
      Node right;
   }

   private Node buildTree(){
   }
   
   private void insertNode(Node root, int data){
      Node node = new Node();
      node.data = data;

      while(root != null){
         if(root.data > data){
            root = root.left;
         }
         else{
            root = root.right;
         }
      }

      root = node;
   }
}
