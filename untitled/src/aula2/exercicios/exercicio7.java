package aula2.exercicios;

public class exercicio7 {
    public class Exercicio07 {
        public static void main(String[] args) {
            boolean cond1 = true;
            boolean cond2 = false;
            boolean cond3 = true;

            boolean resultadoAnd = cond1 && cond2; // E lógico (falso, pois cond2 é false)
            boolean resultadoOr = cond2 || cond3;  // OU lógico (verdadeiro, pois cond3 é true)
            boolean combinado = (cond1 && cond3) || cond2;

            System.out.println("cond1 && cond2: " + resultadoAnd);
            System.out.println("cond2 || cond3: " + resultadoOr);
            System.out.println("(cond1 && cond3) || cond2: " + combinado);
        }
    }
}
