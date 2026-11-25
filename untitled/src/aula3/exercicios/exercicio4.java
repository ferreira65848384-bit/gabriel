package aula3.exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor das vendas: R$ ");
        double vendas = scanner.nextDouble();
        double comissao;

        if (vendas < 1000.0) { //[cite: 12]
            comissao = vendas * 0.05; // 5%[cite: 12]
        } else if (vendas <= 5000.0) { // Entre R$1000 e R$5000[cite: 12]
            comissao = vendas * 0.10; // 10%[cite: 12]
        } else { // Superiores a R$5000[cite: 12]
            comissao = vendas * 0.15; // 15%[cite: 12]
        }

        System.out.printf("Valor da comissão: R$ %.2f%n", comissao); //[cite: 12]

        scanner.close();
    }
}
