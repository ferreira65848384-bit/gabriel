package aula2.exercicios;

public class exercicio9 {
    public class Exercicio09 {
        public static void main(String[] args) {
            float valorFloat = 45.75f;
            long valorLong = (long) valorFloat; // Casting explícito (perde o .75)
            double valorDouble = valorLong;     // Casting implícito (adiciona .0)

            System.out.println("Valor float: " + valorFloat);
            System.out.println("Valor long: " + valorLong);
            System.out.println("Valor double: " + valorDouble);
        }
    }
}
