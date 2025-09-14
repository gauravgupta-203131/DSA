import java.util.*;
public class MergeSort {
    static public void divide(int[] arr,int st,int end){
        if(st==end){
            return;
        }
        int mid = st+(end-st)/2;
        divide(arr,st,mid);
        divide(arr,mid+1,end);
        conquer(arr,st,mid ,end);

    }
    public static void conquer(int[] arr,int st,int mid,int end){

int i=st;
int j=mid+1;
int temp[] = new int[end-st+1];
int c=0;
while(i<=mid&&j<=end){
if(arr[i]<=arr[j]){
    temp[c++]=arr[i++];

}
else{
    temp[c++]=arr[j++];

}
}
while(i<=mid){
     temp[c++]=arr[i++];
}
while(j<=end){
     temp[c++]=arr[j++];
}
for(int idx=0;idx<temp.length;idx++){
    arr[st+idx] = temp[idx];
}
    }
    public static void main(String[] arg){
        int arr[] ={3,6,4,8,9,3,0};
        divide(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
}
