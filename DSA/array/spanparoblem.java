import java.util.Scanner;
class SpanProblem{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int a []= new int[size];
        System.out.println("Enter the element in the array:");
        
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        int min =a[0];
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(min<a[i]);
            else min=a[i];
            if(max>a[i]);
            else max = a[i];
        }
        int result = max - min;
        System.out.println("difference is here  "+result);
        //alternative
// if(min>a[i]){ min=a[i]}

//if(max<a[i]){ max = a[i]}



    }
}