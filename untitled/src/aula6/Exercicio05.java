package aula6;

    public class Exercicio05 {
        public static void main(String[] args) {
            double media = calcularMedia(7.5, 8.0, 9.5);
            System.out.println("A média das notas é: " + media);
        }

        public static double calcularMedia(double n1, double n2, double n3) {
            return (n1 + n2 + n3) / 3.0;
        }
    }

