package aula3.exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        double valorFinal;

        if (valorCompra > 100.0) { //[cite: 11]
            valorFinal = valorCompra - (valorCompra * 0.10); // Desconto de 10%[cite: 11]
            System.out.println("Desconto de 10% aplicado!");
        } else {
            valorFinal = valorCompra; // Não aplica desconto[cite: 11]
            System.out.println("Nenhum desconto aplicado.");
        }

        System.out.printf("Valor final a ser pago: R$ %.2f%n", valorFinal); //[cite: 11]

        scanner.close();
    }
}
