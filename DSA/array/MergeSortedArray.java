public class MergeSortedArray {
    public static void main(String[] ar)
{
    int a1[]={1,2,9,7,5,3};
     int a2[]={1,2,3,8,7};
     int n=a1.length+a2.length;
     int a3[]=new int[n]; 

     int c=0;
     for(int i=0;i<=n;i++){
        if(c<a1.length){
            for(int j=0;j<a1.length;j++){
            a3[c]=a1[j];
            c++;
            }
        }
        else{
         for(int j=0;j<a1.length;j++){
            a3[c]=a2[j];
            c++;
         }
        }
        


     }
     for(int i=0;i<a3.length;i++)
     {
        System.out.println(a3[i]);
     }
}    
}
