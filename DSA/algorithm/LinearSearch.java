public class LinearSearch {
    public static int  linearSearch(int[] arr ,int key){
        for(int i=0;i<arr.length;i++){
          if(key ==arr[i])
            return i;

        }
                    return -1;

    }
     public static void main(String[]  rr){
        int a1[] ={23,54,6,8};
      int a2 =  linearSearch(a1,6);
      System.out.println(a2);
    

    }
    
}
