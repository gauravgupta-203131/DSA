import java.util.Scanner;
public class printNumber {
    // from 1 to 6
    static int a;
    public static  void print(int n){
        if(n<=a){
      System.out.println(n);
      print(n+1);
        }
    }
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        print(1);

    }
}
