package aula2.exercicios;

public class exercicio10 {
    public class Exercicio10 {
        public static void main(String[] args) {
            short valorShort = 50;
            int valorInt = valorShort;           // Casting implícito
            byte valorByte = (byte) valorShort;  // Casting explícito

            System.out.println("Valor short: " + valorShort);
            System.out.println("Valor int: " + valorInt);
            System.out.println("Valor byte: " + valorByte);
        }
    }
}
