package aula4;

public class exercicio5 {
    import java.util.Scanner;

    public class Exercicio05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double somaNotas = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a " + i + "ª nota: ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 5;
            System.out.println("A média das notas é: " + media);

            scanner.close();
        }
    }
}
