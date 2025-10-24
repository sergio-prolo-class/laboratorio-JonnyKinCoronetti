import java.util.Scanner;

public class RPG {

    // Função para calcular o nível mínimo necessário
    public static int calcularNivel(int classe, int vitalidadeDesejada) {
        int vitalidadeInicial = 0;
        int incremento = 0;

        // Usando o switch para determinar a vitalidade inicial e o incremento com base na classe
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
                // Classe inválida
                System.out.println("Classe inválida!");
                return -1; // Retorna -1 para indicar que a classe foi inválida
        }

        // Inicializando o nível e a vitalidade do personagem
        int nivel = 0;
        int vitalidadeAtual = vitalidadeInicial;

        // Usando o laço while para calcular o nível até atingir ou superar a vitalidade desejada
        while (vitalidadeAtual < vitalidadeDesejada) {
            nivel++;
            // Se o nível for múltiplo de 5, o incremento é dobrado
            if (nivel % 5 == 0) {
                vitalidadeAtual += 2 * incremento;
            } else {
                vitalidadeAtual += incremento;
            }
        }

        // Retorna o nível mínimo necessário
        return nivel;
    }

    public static void main(String[] args) {
        // Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo o código da classe e a vitalidade desejada
        System.out.print("Digite o código da classe (1 - Arqueiro, 2 - Bárbaro, 3 - Druida, 4 - Mago): ");
        int classe = scanner.nextInt();

        System.out.print("Digite a vitalidade desejada: ");
        int vitalidadeDesejada = scanner.nextInt();

        // Calculando o nível mínimo necessário
        int nivelMinimo = calcularNivel(classe, vitalidadeDesejada);

        // Se a classe for válida, imprime o nível mínimo
        if (nivelMinimo != -1) {
            System.out.println("O nível mínimo necessário para alcançar ou superar a vitalidade desejada é: " + nivelMinimo);
        }

        // Fechando o scanner
        scanner.close();
    }
}
