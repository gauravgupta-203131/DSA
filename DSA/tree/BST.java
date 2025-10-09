public class BST {
    Node root;
    public BST(){
        this.root = null;
    }
    /* 
    public boolean insert(int key){
        Node node = new Node(key);
        if(root==null){
            root = node;
            return true;
        }
        Node parent = null;
        Node cur = root;
        while(cur!=null){
            parent = cur;
            if(key<cur.element){
             cur = cur.left;
            }
            else{
                cur = cur.right;
            }
        }
        if(parent.element>key)
        parent.left = node;
        else
          parent.right = node;
          return true;

    }*/
    void inserted(int key){
        root = insertedTraverse(key,root);
    }
    Node insertedTraverse(int key,Node root){
        if(root == null){
        root = new Node(key);
      //  return root;
        }
        else if(root.element>key)
            root.left = insertedTraverse(key,root.left);
        else
        root.right = insertedTraverse(key,root.right);
         return root;
    }
    public void inorder(){
        System.out.println("INORDER TRAVERSE");
        inorderTraverse(root);
        System.out.println();
    }
    public void inorderTraverse(Node root){
        if(root!=null){
            inorderTraverse(root.left);
            System.out.print(root.element+" ");
             inorderTraverse(root.right);
        }
    }
    /* 
    public boolean search(int key){
        if(root==null)
        return false;
        Node cur = root;
        while(cur!=null){
            if(cur.element == key)
            return true;
            if(cur.element>key)
            cur = cur.left;
            else
            cur = cur.right;
        }
        return false;

    }
    */
    public boolean search(int key){
        return searchTraverse(key,root);
    }
    private boolean searchTraverse(int key,Node root){
        if(root==null)
        return false;
        if(root.element == key)
        return true;
        if(key<root.element)
        return searchTraverse(key,root.left);
        else
        return searchTraverse(key,root.right);
    }
    public void preorder(){
        System.out.println("BELOW PREORDER");
        preorderTraverse(root);

    }
    private void preorderTraverse(Node root){
        if(root!=null){
            System.out.print(root.element+" ");
            preorderTraverse(root.left);
            preorderTraverse(root.right);

        }
    }
    public void postOrder(){
        System.out.println("Post Order");
        postOrderTraverse(root);
    }
   private void postOrderTraverse(Node root){
    if(root!=null){
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.print(root.element+" ");
    }
   

    }
     public void delete(int ele){
        root = deleteNode(ele,root);
    }
    private Node deleteNode(int ele,Node root){
        if(root==null)
        return null;
        if(root.element>ele)
        {
            root.left=deleteNode(ele, root.left);
        }
        if(root.element<ele){
            root.right=deleteNode(ele, root.right);
        }
        
          else{ if(root.left==null&&root.right==null)
            return null;
         if(root.left==null){
                return root.right;
            }
          if(root.right==null){
                return root.left;
            }
            else{
                root.element = minValue(root.right);
                root.right = deleteNode(root.element, root.right);
            }
        }
        return root;
    }
    int minValue(Node root){
        Node cur = root;
        int min = root.element;
        while(cur.left!=null){
         //   prev =cur;
           cur = cur.left;
        }
        min = cur.element;
        return min;
    }
}
