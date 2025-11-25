import java.util.Scanner;

public class DesvioPadrao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho do arranjo: ");
        int n = sc.nextInt();

        int[] vals = new int[n];

        System.out.print("Entre com os valores do arranjo: ");
        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
        }

        double dp = desvioPadrao(vals);

        System.out.printf("O desvio padrão é %.6f%n", dp);

        sc.close();
    }

    public static double media(int[] vals) {
        double soma = 0;
        for (int v : vals) {
            soma += v;
        }
        return soma / vals.length;
    }

    public static double desvioPadrao(int[] vals) {
        int n = vals.length;

        if (n < 2) {
            return 0.0; // evita divisão por zero caso n = 1
        }

        double m = media(vals);
        double somaQuadrados = 0;

        for (int v : vals) {
            somaQuadrados += Math.pow(v - m, 2);
        }

        return Math.sqrt(somaQuadrados / (n - 1));
    }
}
