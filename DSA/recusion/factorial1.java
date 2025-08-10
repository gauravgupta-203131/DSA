import java.util.Scanner;
class factorial1{
    public static  int factorial(int n){
        if(n==1||n==0)
        return 1;
        int fact1 = factorial(n-1);
        return n*fact1;
    }
    public static void main(String[] ar){
        int a = new Scanner(System.in).nextInt();
        System.out.println(factorial(a));
    }
    
}
