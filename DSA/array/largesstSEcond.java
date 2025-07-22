public class largesstSEcond {
    public static void main(String[]ar)
{
    int a[]={10,45,87,56,90,108,45,123};

    int l=a[0];
   int s=0;
    for(int i=0;i<a.length;i++){
      if(l<a[i]){
        s=l;
        l=a[i];

      }
     
      
    }
     System.out.println("First largest numberr"+l);
      System.out.println("secont largest numberr"+s);
}    
}
