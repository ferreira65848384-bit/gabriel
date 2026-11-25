package aula3.exercicios;


import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int codigo = scanner.nextInt();

        switch (codigo) { //
            case 1:
                System.out.println("Categoria: Eletrônicos"); //[cite: 12]
                break;
            case 2:
                System.out.println("Categoria: Alimentos"); //[cite: 12]
                break;
            case 3:
                System.out.println("Categoria: Vestuário"); //[cite: 12]
                break;
            default:
                System.out.println("Código de produto inválido.");
        }

        scanner.close();
    }
}