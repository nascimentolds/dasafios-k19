package k19.desafios;

// Crie um programa que exiba no Console vários triângulos de “*”. Adicione uma classe chamada
// Triangulos. Veja o exemplo abaixo:
// *
// **
// ***
// ****
// *
// **
// ***
// ****

public class Triangulos {
    public static void main(String[] args) {
        int linhas = 4; // Número de linhas do triângulo

        for (int i = 1; i <= linhas; i++) {
            // Imprimir os asteriscos em cada linha
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Quebrar a linha após imprimir os asteriscos
            System.out.println();
        }

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
