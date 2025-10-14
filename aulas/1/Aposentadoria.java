import java.util.Scanner;

public class Aposentadoria {
    public static void main (String[]args) {
    int idade, temp;
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com a idade: ");
    idade = sc.nextInt();
    System.out.print("Entre com o tempo de serviso: ");
    temp = sc.nextInt();    
    if (idade >= 65 || temp >= 30 || (idade >= 60 && temp >= 25)) {
        System.out.println("pode se aposentar");}
     else {
        System.out.println("não pode se aposentar");}
    sc.close();
  } 
}
