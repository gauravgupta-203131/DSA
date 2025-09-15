public class pattern6 {
    public static void main(String[] arr){
        int n=4;
        // triangle pattern
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    /*
     1
     2 2
     3 3 3
     4 4 4 4
     */
}
