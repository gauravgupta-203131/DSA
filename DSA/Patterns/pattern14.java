public class pattern14 {
    public static void main(String[] arr){
        int n=6;
       int temp = 0;
        for(int i=0;i<2*n-1;i++){
       if(i<n/2){
        System.out.println("@");
       // continue;
       }
       else if(i>=n/2&&i<2*n-1){
        if(i>=n/2&&i<=n){
            System.out.print("@");
        }
        else{
            System.out.print(" ");
        }
        for(int j=0;j<temp;j++){
            System.out.print(" ");

        }
        if(i>=n/2&&i<=(3*n)/2-1){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        
        }
        
        for(int j=0;j<n+(n-1)*(n-1)-(temp+n);j++){
            System.out.print(" ");
        }
        
        
       if(i>=n/2&&i<=(3*n)/2-1)
        temp = temp+n-1;
       // temp = temp+n-1;
        if(i>=n-1&&i<2*n-1){
            
            System.out.println("@");
            

        }
        else{
            System.out.println( " ");
        }

       }




        }

    
}}
/*
@
@
@
@******
@     ******
@          ******               @
@               ******          @
                     ******     @
                          ******@
                               @
                               @
 */
