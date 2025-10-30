import java.util.Scanner;

public class TrianguloDeFloyd {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de linhas do Triângulo de Floyd: ");
        int n = entrada.nextInt();

        int num = 1; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        entrada.close();
    }
}
