import java.util.*;
public class QuickSort {
    static public void Quick(int[] arr,int low,int high){
        if(low<high){
        int i = low - 1;
        int p = arr[high];
        for(int j = low;j<high;j++){
            if(arr[j]<=p){
                int temp = arr[j];
                arr[j]=arr[++i];
                arr[i]=temp;

            }

        }
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high] = temp;
        Quick(arr,low,i-1);
        Quick(arr,i+1,high);
    }
        
    }
    public static void main(String[] ar){
        int arr[] ={1,7,5,9,8,4};
        Quick(arr,0,5);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
