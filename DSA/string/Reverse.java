public class Reverse {
    public static void main(String[] ar){
        String name="Argusoft";
        String name1="";
        for(int i=1;i<=name.length();i++){
           name1=name1+name.charAt(name.length()-i);
        }
        System.out.println(name1);
    }
    
}
