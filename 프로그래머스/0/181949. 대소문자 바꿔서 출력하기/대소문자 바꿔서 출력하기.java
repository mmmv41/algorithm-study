import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringBuilder answer = new StringBuilder();
        
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c))
                answer.append(Character.toLowerCase(c));
            else 
                answer.append(Character.toUpperCase(c));
        }
        System.out.print(answer.toString());
    }
}