import java.util.Scanner;

public class Temp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();   
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em Celsius é:" + celsius);
        scanner.close();
    }
}
