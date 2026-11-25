package aula5;

    import java.util.Scanner;

    public class Exercicio02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] letras = {"A", "B", "C", "D", "E", "F"};
            boolean encontrada = false;

            System.out.print("Digite uma letra para buscar: ");
            String busca = scanner.next();

            for (int i = 0; i < letras.length; i++) {
                if (letras[i].equalsIgnoreCase(busca)) {
                    System.out.println("Letra encontrada na posição (índice): " + i);
                    encontrada = true;
                }
            }

            if (!encontrada) {
                System.out.println("A letra não está presente no vetor.");
            }

            scanner.close();
        }
    }

