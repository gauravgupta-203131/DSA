public class MajorityElement {
    public static void main(String[] arr){
        int[]a = {1,7,1,7,1,7};
        // brute force appraoach
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j])
                c++;
            }
            if(c>a.length/2){
            System.out.print(a[i]);
            return;
          //  break;
            }

        }
    System.out.print("!!! not found!!!");

    }
    
}
