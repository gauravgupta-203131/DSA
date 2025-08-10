

public class sumFirstNaturalNumber {
      // static int a;
     // static int sum;
    public static  void  sum1(int n,int i,int sum  ){
        
        if(i==n){
            sum = sum+i;
      System.out.println(sum);
      return;
     
     
        }
        else{
             sum = sum+i;
      sum1(n,i+1,sum);
     
        }
        
    }
    public static void main(String[] ar){
     sum1(5,1,0);

    }
}
