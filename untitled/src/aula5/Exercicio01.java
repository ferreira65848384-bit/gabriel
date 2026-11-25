package aula5;

    public class Exercicio01 {
        public static void main(String[] args) {
            int[] numeros = {10, 25, 30, 15, 20};
            int soma = 0;

            for (int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
            }

            System.out.println("A soma dos elementos do vetor é: " + soma);
        }
    }

