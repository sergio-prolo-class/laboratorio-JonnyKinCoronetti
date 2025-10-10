import java.util.Scanner;
 
public class LerLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String entrada = sc.nextLine(); // le toda a linha de texto 
        
        System.out.println("Voce digitou: " + entrada);

        sc.close();
    }
}