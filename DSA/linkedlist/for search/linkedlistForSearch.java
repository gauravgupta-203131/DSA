 class linkedlist{
    class Node{
        int element;
        Node next;
        public Node(int element){
            this.element = element;
            this.next = null;
        
        }
        
    }
    Node first;

    public void add(int element){
        Node node = new Node(element);
        Node nod = node;
        if(first == null ){
            first =nod;
            return;

        }
        Node cur = first;
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = node;

    }
    public void showElementAll(){
        Node cur = first;
        while(cur!=null){
            System.out.print("->"+cur.element);
            cur = cur.next;
        }
        System.out.println();
    }
    public boolean contain(int element){
        if(first == null){
          //  System.out.println("No element exist");
            return false;
        }
       Node cur = first;
       while(cur!=null){
        if(cur.element==element){
            return true;
        }
        cur = cur.next;
       } 
    
        
        return false;
       
    }
}