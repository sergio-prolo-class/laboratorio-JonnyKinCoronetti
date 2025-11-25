import java.util.Scanner;

public class ContagemDigitos {
    private static final int LIMITE_MAX = 999_999_999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um inteiro positivo entre 1 e 999999999: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > LIMITE_MAX);

        int[] contagem = new int[10];

        int temp = numero;
        while (temp > 0) {
            int digito = temp % 10;
            contagem[digito]++;
            temp /= 10;
        }

        System.out.println("\nTabela de ocorrência dos dígitos:");
        System.out.println("Dígito | Quantidade");
        System.out.println("-------------------");

        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > 0) {
                System.out.printf("%6d | %10d%n", i, contagem[i]);
            }
        }

        sc.close();
    }
}
