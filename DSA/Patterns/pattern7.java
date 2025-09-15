
public class pattern7 {
    public static void main(String[] srr){
      // triangle pattern
     int n=4;
        for(int i=0;i<=n-1;i++) {
            for(int j=0;j<=i;j++){
                System.out.print((char)(64+i+1)+" ");

            }
            System.out.println();
        }
    }
    
}
/*
 A
 BB
 CCC
 DDDD
 */