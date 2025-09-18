public class pattern15 {
    
    public static void main(String[] ar){
        int n = 7;
        int k = n / 2 + 1;

        // Top pyramid
        for(int i = 0; i < k; i++){
            for(int j=0;j<2*k-1;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < k - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Middle rectangle
        for(int i = 0; i < n - 2; i++){
            for(int j=0;j<2*k-1;j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n; j++){
                if(j == 0 || j == n - 1){
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Bottom mirror
        for(int i = 0; i < k; i++){
            for(int j = i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = k - i; j > 0; j--){
                System.out.print("*");
            }
            for(int j = k - 1 - i; j > 0; j--){
                System.out.print("*");
            }
                for(int j = i; j > 0; j--){
                System.out.print(" ");
            }
              if(i==0)
            System.out.print("@");
            else{
                System.out.print(" "); 
            }
            for(int j = 0; j < n - 2; j++){
                System.out.print(" ");
            }
            if(i==0)
            System.out.print("@");
             else{
                System.out.print(" "); 
            }

            for(int j = i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = k - i; j > 0; j--){
                System.out.print("*");
            }
            for(int j = k - 1 - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
          *
         ***
        *****
       *******
       @     @
       @     @
       @     @
       @     @
       @     @
*******@     @*******
 *****         *****
  ***           ***
   *             *
 */
