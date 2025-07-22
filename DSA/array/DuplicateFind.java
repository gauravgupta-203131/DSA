public class DuplicateFind {
    public static void main(String[] ar) {
        int a[] = { 1, 7, 5, 7, 9, 5, 6, 7, 6,78,65 ,65};
        int a2[]=new int[15];
        for (int i = 0; i < a.length; i++) {
           int c=0;
            for (int j= i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c++;  
                    
                }
                
                }
                if(c>=1)
                 System.out.println("duplicate"+a[i]+" times "+c);
               
            }
        }
    }


