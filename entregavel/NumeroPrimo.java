public class NumeroPrimo {

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo para saber se é primo: ");
        int numero = scanner.nextInt(); 

        if (ehPrimo(numero)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        scanner.close();
    }
}
