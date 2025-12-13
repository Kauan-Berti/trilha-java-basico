import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {
            System.out.println("Parametro invalido, digite um valor inteiro, Ex: 1");

        } catch (ParametrosInvalidosException e) {
            System.out.println("O valor informado no primeiro parâmetro deve ser menor que o segundo!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        System.out.println("Contagem: ");
        for (int i = 0; i <= contagem; i++) {
            System.out.printf("-> %d ", i);
        }
    }
}