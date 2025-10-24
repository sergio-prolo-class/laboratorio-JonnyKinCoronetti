import java.util.Scanner;

public class ControleDeAcesso {
    public static void main(String[] args) {
        final int SENHA_CORRETA = 314159;  // senha pré-definida
        final int MAX_TENTATIVAS = 3;      // número máximo de tentativas permitidas

        Scanner Entrada = new Scanner(System.in);
        int Tentativas = 0;
        int Senha;

        // Loop de tentativas
        while (Tentativas < MAX_TENTATIVAS) {
            System.out.print("Digite a senha: ");
            Senha = Entrada.nextInt();
            Tentativas++;

            if (Senha == SENHA_CORRETA) {
                System.out.println("Acesso autorizado");
                Entrada.close();
                return; // encerra o programa
            } else {
                System.out.println("Acesso negado (senha incorreta)");
            }
        }

        // Se o loop terminar sem sucesso
        System.out.println("Sistema bloqueado");
        Entrada.close();
    }
}
