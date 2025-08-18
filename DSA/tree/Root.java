
public class Root {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
         static int idx =-1;
        public static Node buildTree(int[] node){
          idx++;
          if(idx>=node.length||node[idx]==-1)
          return null;
          Node newNode = new Node(node[idx]);
          newNode.left = buildTree(node);
           newNode.right = buildTree(node);

          return newNode;
        }
        public static void  preorder( Node root){
            if(root == null){
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }//
         public static void  inorder( Node root){
            if(root == null){
                return;
            }
           
            inorder(root.left);
             System.out.println(root.data);
            inorder(root.right);
        }
public static void main(String[] ar){
    // int [] node = {1,3,2,-1,5,-1,7,6};
    int [] node = {1, 3, -1, -1, 2, 5, -1, -1, 7, 6, -1, -1, -1};
    
Node a2 =   buildTree(node);
inorder(a2);
}
    
    
}
