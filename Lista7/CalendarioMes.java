import java.util.Scanner;

public class CalendarioMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes, inicioSemana;

        while (true) {
            System.out.print("Digite o número do mês (1 - Janeiro, 2 - Fevereiro, ..., 12 - Dezembro): ");
            mes = scanner.nextInt();

            System.out.print("Digite o dia da semana que o mês inicia (1 - Domingo, 2 - Segunda, ..., 7 - Sábado): ");
            inicioSemana = scanner.nextInt();

            if (mes >= 1 && mes <= 12 && inicioSemana >= 1 && inicioSemana <= 7) {
                break; 
            } else {
                System.out.println("Entrada inválida! Tente novamente.");
            }
        }


        int diasNoMes;
        switch (mes) {
            case 1: // Janeiro
            case 3: // Março
            case 5: // Maio
            case 7: // Julho
            case 8: // Agosto
            case 10: // Outubro
            case 12: // Dezembro
                diasNoMes = 31;
                break;
            case 4: // Abril
            case 6: // Junho
            case 9: // Setembro
            case 11: // Novembro
                diasNoMes = 30;
                break;
            case 2: // Fevereiro
                diasNoMes = 28;
                break;
            default:
                diasNoMes = 0; 
        }

        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        int dia = 1;

        for (int i = 1; i < inicioSemana; i++) {
            System.out.print("   "); 
        }

        while (dia <= diasNoMes) {
            // Imprime o dia atual
            System.out.printf("%2d ", dia);

            if ((inicioSemana + dia - 1) % 7 == 0) {
                System.out.println();
            }

            dia++;
        }

        if ((inicioSemana + diasNoMes - 1) % 7 != 0) {
            System.out.println();
        }

        scanner.close();
    }
}
