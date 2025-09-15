public class pattern4 {
    public static void main(String[] arr){
        // SQUARE PATTERN
        int num =1;
        int n=3;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

    }
    
}
/*
1 2 3 
4 5 6
7 8 9
 */
