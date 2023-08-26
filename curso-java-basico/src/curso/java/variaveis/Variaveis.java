package curso.java.variaveis;

public class Variaveis {
    public static void main(String[] args) {
        // tipos primitivos
        // int | byte | short | long | double | float | boolean | char | String

        byte idade = 123;
        short ano = 2023;
        int cep = 21070033;
        long cpf = 98765432189L;
        float pi = 3.14F; // se for float tem que terminar com F
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeronormal = numeroCurto;
        short numeroCurto2 = (short) numeronormal; //casting

        // constantes
        // declarada em caixa alta
        final double PI = 3.14;

    }
}
