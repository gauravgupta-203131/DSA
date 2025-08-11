import java.util.Scanner;
public class Reverse1 {
    public static void reverse(String str,int idx){
        if(idx <0){
        
            return;

        }
        


System.out.println(str.charAt(idx));
reverse(str,idx-1);



    }
    public static void main(String[] ar){
        String str = "Gaurav";
int idx = str.length()-1;
        reverse(str,idx);
    }
    
}
