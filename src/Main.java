import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questão 1
        Fibonacci fibonacci = new Fibonacci();
        System.out.print("1)Informe um número para a sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        if (fibonacci.pertence(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        System.out.println();  // Com o intuito de dá um espaçamento entre as questões

        // Questão 2
        scanner.nextLine();
        ContadorA contadorA = new ContadorA();
        System.out.print("2)Digite uma string: ");
        String texto = scanner.nextLine();
        int quantidade = contadorA.contar(texto);
        System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");

        System.out.println();  // Com o intuito de dá um espaçamento entre as questões


        // Questão 3
        Soma soma = new Soma();
        int indice = 12;
        System.out.println("3)O valor da variável SOMA é: " + soma.calcular(indice));

        System.out.println();  // Com o intuito de dá um espaçamento entre as questões


        // Questão 4
        System.out.println("Próximo elemento de a) 1, 3, 5, 7 é 9");
        System.out.println("Próximo elemento de b) 2, 4, 8, 16, 32, 64 é 128");
        System.out.println("Próximo elemento de c) 0, 1, 4, 9, 16, 25, 36 é 49");
        System.out.println("Próximo elemento de d) 4, 16, 36, 64 é 100");
        System.out.println("Próximo elemento de e) 1, 1, 2, 3, 5, 8 é 13");
        System.out.println("Próximo elemento de f) 2, 10, 12, 16, 17, 18, 19 é 20");

        System.out.println();  // Com o intuito de dá um espaçamento entre as questões


        // Questão 5
        System.out.println(
                "Ligue o primeiro interruptor e deixe-o ligado por cerca de 5 minutos. " + "Isso fará com que a lâmpada correspondente esquente.\n" +
                "Desligue o primeiro interruptor e ligue o segundo interruptor. Deixe o segundo interruptor ligado.\n" +
                "Vá até a sala das lâmpadas:\n" +
                "A lâmpada que está acesa corresponde ao segundo interruptor (o que você deixou ligado).\n" +
                "Toque nas outras duas lâmpadas:\n" +
                "A lâmpada que está quente, mas apagada, corresponde ao primeiro interruptor (o que você ligou e depois desligou).\n" +
                "A lâmpada que está fria e apagada corresponde ao terceiro interruptor (o que você não ligou).");

        scanner.close();
    }
}
