import java.util.*;
public class PairSum{
    public static void main(String[] arr){
        int[] a = {1,5,7,8};
        ArrayList<Integer> a1 = new ArrayList<>();
        int target = 9;
        int i=0;
        int j = a.length-1;
        while(i<j){
            int pairSum = a[i]+a[j];
            if(pairSum>target)
            j--;
            else if(pairSum<target)
            i++;
            else{
            a1.add(i);
            a1.add(j);
            break;

            }

        }
        if(a1.isEmpty())
        System.out.print("Not pair found");
        else{
            for(int a3:a1){
                System.out.print(a3+" ");
            }
        
         
        }
        }

    }
