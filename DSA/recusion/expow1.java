public class expow1 {

      public static int expow(int x,int n){
        if(n==0)
        return 1;
        else if (n%2==0)
        return expow(x,n/2)*expow(x,n/2);
        else
        return expow(x,n/2)*expow(x,n/2)*x;
    }
    public static void main(String[] ar){
       System.out.println(expow(2,5)) ;
    }
}
