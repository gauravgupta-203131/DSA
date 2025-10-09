public class App {
    public static void main(String[] arr){
        BST a1 = new BST();
       a1.inserted(5);
      a1.inserted(7);
        a1.inserted(17);
         a1.inserted(10);
          a1.inserted(1);
       a1.preorder();
      // a1.postOrder();
       a1.delete(1);
        a1.preorder();
   //  System.out.println(a1.search(7));
    //System.out.println(a1.search(0));
    
       //a1.inorderTraverse();

    }
    
}
