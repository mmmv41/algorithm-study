import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 

        int bOnes = b % 10;            
        int bTens = (b / 10) % 10;    
        int bHundreds = b / 100;     

        int result3 = a * bOnes;    
        int result4 = a * bTens;     
        int result5 = a * bHundreds;  

        int result6 = a * b;

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        scanner.close();
    }
}