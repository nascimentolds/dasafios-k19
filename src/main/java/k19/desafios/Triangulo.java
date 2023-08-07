package k19.desafios;

// Crie um programa que exiba no Console um triângulo de “*”. Adicione uma classe chamada
// Triangulo. Veja o exemplo abaixo:
//
// *
// **
// ***
// ****
// *****

public class Triangulo {
    public static void main(String[] args) {
        int linhas = 5; // Número de linhas do triângulo

        for (int i = 1; i <= linhas; i++) {
            // Imprimir os asteriscos em cada linha
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Quebrar a linha após imprimir os asteriscos
            System.out.println();
        }
    }
}
