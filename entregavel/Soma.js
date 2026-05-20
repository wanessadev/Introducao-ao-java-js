const readline = require('readline');

// Configuração para ler a entrada do terminal
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite o primeiro número: ", (input1) => {
    rl.question("Digite o segundo número: ", (input2) => {
        
        // Converte os textos digitados para números (aceita inteiros e decimais)
        const num1 = parseFloat(input1);
        const num2 = parseFloat(input2);

        // Realiza a soma
        const resultado = num1 + num2;

        // Exibe o resultado usando Template Literals (as crases ``)
        console.log(`A soma de ${num1} + ${num2} é: ${resultado}`);

        rl.close();
    });
});
