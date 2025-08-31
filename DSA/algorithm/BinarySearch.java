public class BinarySearch {
    public static int  binarySearch(int[] arr,int key,int left,int right){
        if(left>right)
        return -1;
        int mid  = left + (right-left)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
           
return binarySearch(arr,key,left,mid-1);
        }
        else
          return binarySearch(arr,key,mid+1,right);

    }
      public static void main(String[]  rr){
        int a1[] ={1,2,3,4,7,9,23};
    int a2 =    binarySearch(a1,23,0,a1.length-1);
    System.out.println(a2);

    }
    
}
