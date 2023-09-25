import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Informe o segundo número");
        int segundoNumero = terminal.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Exibindo o número " + i);
        }
    }
}
