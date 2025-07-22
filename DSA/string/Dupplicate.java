public class Dupplicate {
    public static void  main (String [] a1){
        String name="Gaurav gupta";
        char[] a=name.toLowerCase().toCharArray();
for(int i=0;i<a.length;i++){
    int count =1;
    for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
count++;
a[j]='0';
        }
    }
    if(count>1&&a[i]!='0')
        System.out.println("Duplicate"+a[i]);

}
    }
    
}
