import java.util.Scanner;
public class findthearrayindex {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1");
        int size = sc.nextInt();
        int [] a = new int[size];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Enter the element for find index :");
        int result = sc.nextInt();
        int res =-1;
        for(int i=0;i<a.length;i++){
            if(result==a[i]){
                res=i;
                System.out.println("index of element are "+res);
                break;
            }
            
            System.out.println(res);
            

        }

    }
    
}
