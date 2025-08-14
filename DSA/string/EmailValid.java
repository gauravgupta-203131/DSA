import java.util.Scanner;

public class EmailValid{
    public static boolean verify(String s){
        s=s.trim();
      if (!s.contains("@")) return false; 
      String[] a1 = s.split("@");
      if(Character.isDigit(s.charAt(0))) return false;
      if(a1.length!=2) return false;
      for(String val : a1)
      {
       if( val.startsWith(".")||val.endsWith(".")||val.contains(" ")||val.contains(".."))return false;

      }
      String dom = a1[1];
      String [] a3 = dom.split("\\.");
    
     for(int i=0;i<a3.length-1;i++)
       if(a3[i].length()<1) return false;
      if(a3[a3.length-1].length()<2) return false;
      return true;
      }
      
      public static void main(String[ ] arg){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter your email for validation");
   String s2=sc.nextLine();
       boolean s= verify(s2);
       System.out.println(s);
    }
}