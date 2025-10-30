import java.util.Scanner;

public class RPG {

    public static int calcularNivel(int classe, int vitalidadeDesejada) {
        int vitalidadeInicial = 0;
        int incremento = 0;

        switch (classe) {
            case 1: // Arqueiro
                vitalidadeInicial = 150;
                incremento = 10;
                break;
            case 2: // Bárbaro
                vitalidadeInicial = 200;
                incremento = 15;
                break;
            case 3: // Druida
                vitalidadeInicial = 100;
                incremento = 5;
                break;
            case 4: // Mago
                vitalidadeInicial = 80;
                incremento = 4;
                break;
            default:
                System.out.println("Classe inválida!");
                return -1; 
        }

        int nivel = 0;
        int vitalidadeAtual = vitalidadeInicial;

        while (vitalidadeAtual < vitalidadeDesejada) {
            nivel++;

            if (nivel % 5 == 0) {
                vitalidadeAtual += 2 * incremento;
            } else {
                vitalidadeAtual += incremento;
            }
        }


        return nivel;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da classe (1 - Arqueiro, 2 - Bárbaro, 3 - Druida, 4 - Mago): ");
        int classe = scanner.nextInt();

        System.out.print("Digite a vitalidade desejada: ");
        int vitalidadeDesejada = scanner.nextInt();

        int nivelMinimo = calcularNivel(classe, vitalidadeDesejada);
        
        if (nivelMinimo != -1) {
            System.out.println("O nível mínimo necessário para alcançar ou superar a vitalidade desejada é: " + nivelMinimo);
        }
    
        scanner.close();
    }
}
