import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        // Criamos o scanner para ler o teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Realiza a soma
        double resultado = num1 + num2;

        // Exibe o resultado na tela
        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}
