public class pattern12 {
    public static void main(String[] ar){
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");

            }
            int num =1;
            for(int j=n-i;j<n;j++){
                System.out.print(num++ +" ");
            }
            for(int k=i;k>1;k--){
 System.out.print(k-1+" ");
            }
           
             System.out.println();

        }
       
    }
}
/*
                  1 
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1
 */