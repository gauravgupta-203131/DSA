public class App {
    public static void main(String[] ar){
       LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(7);
        list.add(2,50);
         list.add(3 ,51);
         list.add(0,3);
     list.showAll();
     System.out.println(list.cointains(9));
    }

}
