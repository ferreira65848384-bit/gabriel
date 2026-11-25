package aula5;

    import java.util.Scanner;

    public class Exercicio05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] nomes = {"Ana", "Bruno", "Carlos"};
            boolean encontrado = false;

            System.out.print("Digite o nome que deseja verificar: ");
            String nomeBusca = scanner.nextLine();

            for (String nome : nomes) {
                if (nome.equalsIgnoreCase(nomeBusca)) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("O nome está presente no vetor.");
            } else {
                System.out.println("O nome não está presente no vetor.");
            }

            scanner.close();
        }
    }

