import java.util.Scanner;

public class MaiorColunaMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho da matriz quadrada: ");
        int n = sc.nextInt();

        int[][] matriz = lerMatriz(sc, n);

        int indice = indiceColunaMaiorSoma(matriz);

        System.out.printf("O índice da coluna com maior soma é: %d%n", indice);

        sc.close();
    }

    public static int[][] lerMatriz(Scanner sc, int n) {
        int[][] mat = new int[n][n];

        System.out.println("Entre com os valores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    public static int somaColuna(int[][] mat, int col) {
        int soma = 0;
        for (int[] linha : mat) {
            soma += linha[col];
        }
        return soma;
    }

    public static int indiceColunaMaiorSoma(int[][] mat) {
        int n = mat.length;
        int maiorSoma = somaColuna(mat, 0);
        int indiceMaior = 0;

        for (int j = 1; j < n; j++) {
            int soma = somaColuna(mat, j);
            if (soma > maiorSoma) {
                maiorSoma = soma;
                indiceMaior = j;
            }
        }
        return indiceMaior;
    }
}
