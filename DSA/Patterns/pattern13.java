public class pattern13 {
    public static void main(String[] arr){
        int n=5;
        for(int i=0;i<n/2+2;i++){
            for(int j=0;j<n/2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");

            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("@");
            }
        
            System.out.println();

        }
        int k = n/2+1;
        for(int i=0;i<k;i++){
            for(int j=0;j<k-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<k-(k-i-1);j++){
                System.out.print("*");

            }
            if(i!=k-1){
                for(int j=0;j<2*n-3;j++)
                System.out.print(" ");
            }
            else{
                 for(int j=0;j<2*n-3;j++)
                System.out.print("@");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    for(int i=0;i<k-1;i++){
        for(int j=i+1;j>0;j--){
            System.out.print(" ");

        }
        for(int j =k-1-i;j>0;j--){
            System.out.print("*");

        }
        for(int j=0;j<2*n-3;j++){
                System.out.print(" ");
        }
       for(int j=k-1-i;j>0;j--){
        System.out.print("*");
       }

 System.out.println();
 }
 
        
    }

        
    }
 /*
      @
     @@@
    @@@@@
   @@@@@@@
  *       *
 **       **
***@@@@@@@***
 **       **
  *       *
 */   

