import java.util.Scanner;

public class PrimeiraQuest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total de vendas (R$): ");
        double vendas = sc.nextDouble();
        System.out.print("Digite a avaliação de desempenho (0 a 10): ");
        double avaliacao = sc.nextDouble();
        double salarioFixo = 2000.00;
        double comissao;
        if (vendas >= 10000) {
            comissao = vendas * 0.07;
        } else {
            comissao = vendas * 0.05;
        }

        double bonus = 0;
        if (avaliacao >= 8) {
            bonus = 500.00;
        }

        double remuneracaoTotal = salarioFixo + comissao + bonus;
        System.out.printf("Remuneração total do vendedor: R$ %.2f%n", remuneracaoTotal);
       sc.close();
    }
}
    
        
