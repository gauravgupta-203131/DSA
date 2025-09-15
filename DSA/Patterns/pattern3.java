public class pattern3 {
    public static void main(String[] args){
        // SQUARE PATTERN
        int n=4;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
    
}
/*
A B C D 
A B C D
A B C D
A B C D
 */