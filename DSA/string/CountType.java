public class CountType {
    public static String countCharIn(String name){
        char [] chara = name.toLowerCase().toCharArray();
        int vowel=0;
        int consonent=0;
        int other=0;
        for(char ch:chara){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
             vowel++;
            }else if(ch>=97 && ch<=120){
                consonent++;

            }
            else{
             other++;
            }
         
        }
         return "vowel :"+ vowel+" consonent: "+consonent+" other :"+other;
    }
    public static void main(String [] a){
        String name="Hii I Am Gaourav Gupta";
        System.out.println(countCharIn(name));
    }
    
}
