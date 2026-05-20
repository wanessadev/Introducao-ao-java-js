// Função que calcula o MDC de forma recursiva
function calcularMDC(a, b) {
    if (b === 0) {
        return a;
    }
    return calcularMDC(b, a % b);
}

// Testando a função
let a = 48;
let b = 18;

console.log("O MDC de " + a + " e " + b + " é: " + calcularMDC(a, b));
