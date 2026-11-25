package aula3.exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        if (horasTrabalhadas > 40) { //
            System.out.print("Digite o valor da hora normal: R$ ");
            double valorHoraNormal = scanner.nextDouble();

            double horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHoraNormal * 1.50; // 50% a mais[cite: 13]
            double totalExtras = horasExtras * valorHoraExtra;

            System.out.printf("Horas extras realizadas: %.1f%n", horasExtras);
            System.out.printf("Valor a ser pago pelas horas extras: R$ %.2f%n", totalExtras); //[cite: 13]
        } else {
            System.out.println("O funcionário não fez horas extras."); //[cite: 13]
        }

        scanner.close();
    }
}