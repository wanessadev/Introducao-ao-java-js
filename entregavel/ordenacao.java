public class OrdenacaoBubbleSort {
    public static void main(String[] args) {
        // Nosso vetor desordenado
        int[] vetor = {5, 2, 9, 1, 5, 6};

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        // Aplica o algoritmo de ordenação
        bubbleSort(vetor);

        System.out.println("\nVetor ordenado:");
        imprimirVetor(vetor);
    }

    // Função que ordena o vetor
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        
        // O laço externo controla quantas vezes vamos passar pelo vetor
        for (int i = 0; i < n - 1; i++) {
            // O laço interno faz as comparações par a par
            for (int j = 0; j < n - 1 - i; j++) {
                // Se o elemento atual for maior que o próximo, eles trocam de lugar
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Função auxiliar apenas para exibir o vetor no terminal
    public static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
