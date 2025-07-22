public class paralldrome {
    public static void main(String[] ar){
        int []a1={1,3,7,3,1,1};
        int c=0;
        for(int i=1;i<=a1.length;i++){
            if(a1[i-1]!=a1[a1.length-i]){
                System.out.println("Are not parralladrome");
                c++;
                break;
            }
            
          

        }
        if(c==0){
              System.out.println("Are  parralladrome");
        }
    }
    
}
