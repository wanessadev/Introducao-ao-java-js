import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números da sequência de Fibonacci você quer ver? ");
        int termos = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Sequência de Fibonacci com " + termos + " termos:");

        for (int i = 1; i <= termos; i++) {
            System.out.print(primeiro + " ");

            // A mágica acontece aqui: calculamos o próximo e atualizamos as variáveis
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(); // Apenas quebra a linha no final
        scanner.close();
    }
}
