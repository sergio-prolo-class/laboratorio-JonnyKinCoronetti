import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[]args) {
        double altura, peso, imc;
        Scanner sc = new Scanner(System.in);
        System.out.print("peso: ");
        altura = sc.nextDouble();

        System.out.print("altura: ");
        peso = sc.nextDouble();
        imc = peso/(altura*altura); 

        if (peso <=0 ||altura <= 0) {
          sc.close();
          return; 
        }
        
        if (imc <= 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("peso normal");   
        } else if (imc <= 29.9) {
            System.out.println("sobrepeso");
        } else {
            System.out.println("obesidade");
        }
        sc.close();
    }
 } 

