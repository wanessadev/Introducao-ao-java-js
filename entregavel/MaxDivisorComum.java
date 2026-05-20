public class MaxDivisorComum {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        
        System.out.println("O MDC de " + a + " e " + b + " é: " + calcularMDC(a, b));
    }

    // Método que calcula o MDC de forma recursiva
    public static int calcularMaxDivisorComum (int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }
}
