public class LinkedList {
   private Node first;
  private  Node last;
   private int size;
    public  void addLast(int element){
        Node n1 = new Node(element);
        if(last == null){
         first = last=n1;
         size++;
         return;
        }
        last.right = n1;
        n1.left =last;
        last =n1;
        size++;
    }
    public void showAll(){
        if(first  == null){
            System.out.println("null");
            return;

        }
        Node cur =first;
         System.out.print(cur.element);
        cur = cur.right;
        while(cur!=null){
            System.out.print("-->"+cur.element);
           cur = cur.right;
        }
        System.out.println();
        return;
    }
    public void addFirst(int element){
        Node node = new Node(element);
        if(first == null){
            first = last = node;
            size++;
            return;
        }
        first.left =node;
        node.right = first;
        first = node;
        size++;
    }
    public void add(int idx,int elem) 
     {
        if(idx >size||idx<0){
            System.out.println("sorry not allowed");
            size++;
            return;


        }
        if(idx == 0)
        {
            addFirst(elem);
            return;
        }
        if(size==idx){
            addLast(elem);
            return;
        }
        
        Node node = new Node(elem);
        Node cur = first;


        for(int i=0;i<idx;i++){
            cur = cur.right;
        }
        cur.left.right = node;
        node.left = cur.left;
        node.right = cur;
        cur.left = node;
         //System.out.println(" allowed");
        size++;
        return;

    }
    public boolean cointains(int ele){
        if(first  == null){
            return false;
        }
        Node cur = first;
        while(cur!=null){
       if(ele==cur.element)
       return true;
       cur = cur.right;
        }
        return false;
    }
    
    
}
