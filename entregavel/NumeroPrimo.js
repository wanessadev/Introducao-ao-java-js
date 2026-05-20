const readline = require('readline');

// Função que verifica se o número é primo
function ehPrimo(n) {
    if (n <= 1) {
        return false;
    }

    if (n === 2) {
        return true;
    }

    if (n % 2 === 0) {
        return false;
    }

    // Math.sqrt() funciona igualzinho ao Java
    for (let i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i === 0) {
            return false;
        }
    }

    return true;
}

// Configuração para ler a entrada do usuário no terminal (Substituto do Scanner)
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite um numero inteiro positivo para saber se é primo: ", (input) => {
    // Converte o texto digitado para um número inteiro (Equivalente ao nextInt())
    const numero = parseInt(input); 

    if (ehPrimo(numero)) {
        console.log("O número é primo.");
    } else {
        console.log("O número não é primo.");
    }

    rl.close();
});
