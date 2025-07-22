public class parraladrome {
    public static String paralladrome(String name){
       char[] a1= name.toCharArray();
        for(int i =1;i<=a1.length;i++){
           if(a1[i-1]!=a1[a1.length-i])
           return "not paraladrome";
        }
        return"paralladrome";
    }
    public static void main(String[] ar){
        String n1="madam";
       System.out.println( paralladrome(n1)+"  "+n1);
    }
    
}
