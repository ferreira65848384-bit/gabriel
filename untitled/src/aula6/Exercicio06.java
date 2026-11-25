package aula6;

    public class Exercicio06 {
        public static void main(String[] args) {
            System.out.println("4 é par? " + verificarPar(4));
            System.out.println("7 é par? " + verificarPar(7));
        }

        public static boolean verificarPar(int numero) {
            return numero % 2 == 0;
        }
    }

