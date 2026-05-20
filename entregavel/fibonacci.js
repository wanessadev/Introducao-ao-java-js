const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Quantos números da sequência de Fibonacci você quer ver? ", (input) => {
    const termos = parseInt(input);

    let primeiro = 0;
    let segundo = 1;
    
    // Criamos uma lista (array) para guardar a sequência e printar bonito no final
    const sequencia = [];

    for (let i = 1; i <= termos; i++) {
        sequencia.push(primeiro); // Adiciona o número atual na lista

        let proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
    }

    // .join(", ") junta todos os números do array separados por uma vírgula e espaço
    console.log(`Sequência de Fibonacci: ${sequencia.join(", ")}`);

    rl.close();
});
