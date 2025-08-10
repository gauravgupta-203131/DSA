public class printReverseNumber{
    public static void reverse(int n){
      if(n>0){
        System.out.println(n);
        reverse(n-1);
      }
    }
    public static void main(String[] ar){
        reverse(5);
    }
}