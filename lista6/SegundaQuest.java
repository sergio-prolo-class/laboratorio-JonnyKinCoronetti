import java.util.Scanner;
public class SegundaQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o lado c: ");
        double c = scanner.nextDouble();


        if (a + b > c && b + c > a && c + a > b) {

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("lados inválidos!");
        }

        scanner.close();
    }
}


