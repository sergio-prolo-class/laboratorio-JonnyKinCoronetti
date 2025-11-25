import java.util.Scanner;

public class ComparadorArranjos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho dos arranjos: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("\nDigite os elementos do primeiro arranjo:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("\nDigite os elementos do segundo arranjo:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int resultado = comparaArranjos(arr1, arr2);

        System.out.println();
        switch (resultado) {
            case 0:
                System.out.printf("Ambos os arranjos possuem a mesma quantidade de números pares.%n");
                break;
            case -1:
                System.out.printf("O primeiro arranjo possui mais números pares.%n");
                break;
            case 1:
                System.out.printf("O segundo arranjo possui mais números pares.%n");
                break;
        }

        sc.close();
    }

    public static int contaPares(int[] vals) {
        int contador = 0;
        for (int v : vals) {
            if (v % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int comparaArranjos(int[] x, int[] y) {
        int paresX = contaPares(x);
        int paresY = contaPares(y);

        if (paresX == paresY) {
            return 0;
        } else if (paresX > paresY) {
            return -1;
        } else {
            return 1;
        }
    }
}
