// Função que ordena o array
function bubbleSort(vetor) {
    let n = vetor.length;
    
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - 1 - i; j++) {
            // Se o elemento atual for maior que o próximo, troca de lugar
            if (vetor[j] > vetor[j + 1]) {
                let temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
            }
        }
    }
    return vetor;
}

// Testando o código
let dados = [5, 2, 9, 1, 5, 6];

console.log("Vetor original:", dados);
console.log("Vetor ordenado:", bubbleSort(dados));
