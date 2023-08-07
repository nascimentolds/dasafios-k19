package k19.desafios;

// Faça um programa que percorra todos os número de 1 até 100. Para os números múltiplos de 4,
// exiba a palavra “PIN”, e para os outros, exiba o próprio número.

public class PIN {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0) {
                System.out.println("PIN");
            } else {
                System.out.println(i);
            }
        }
    }
}
