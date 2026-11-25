package aula3.exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) { //
            System.out.println("Acesso permitido."); //[cite: 11]
        } else {
            System.out.println("Acesso negado."); //[cite: 11]
        }

        scanner.close();
    }
}