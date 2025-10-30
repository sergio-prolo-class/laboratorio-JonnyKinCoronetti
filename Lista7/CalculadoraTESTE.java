import java.util.Scanner;

public class CalculadoraTESTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o operador (+ ou -): ");
        char operador = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado;

        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Operador inválido! Use apenas + ou -.");
        }

        sc.close();
    }
}
