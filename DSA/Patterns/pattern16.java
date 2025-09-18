public class pattern16 {
    public static void main(String[] ar){
        int n=5;
        int k = n/2+1;
        for(int i=0;i<k;i++){
            for(int j=0;j<n/2;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int j = k-i;j>0;j--){
                System.out.print("*");
            }
            for(int j = k-1-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    System.out.print("*");

                }
                else{
                    if(j==0||j==n-1)
                    System.out.print("*");
                    else{
                      System.out.print(" ");  
                    }
                }
            }
            System.out.println();
        }
    }
    
}
/*
  *****
   ***
    *
*****
*   *
*   *
*   *
*   *
 */