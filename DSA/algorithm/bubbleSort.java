//import java.util.*;
 public class bubbleSort{
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]= temp;

                }

            }
        }
    }
    public static void main(String[]  rr){
        int a1[] ={23,54,6,8};
        bubbleSort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }

    }
 }