public class pattern5 {
    public static void main(String[] arr){
        // SQUARE PATTERN
        int num =1;
        int n=3;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print((char)(64+num++)+" ");
            }
            System.out.println();
        }
    }
    
}
/* 
 A B C
 D E F 
 G H I
 */