import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for(char c : str.toCharArray())
            System.out.println(c);
        
        sc.close();
        /*for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }*/
        
    }
}