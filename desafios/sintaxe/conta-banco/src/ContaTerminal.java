import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");

        int numeroDaConta = scanner.nextInt();

        System.out.println("Informe o número da Agência: ");
        String agencia = scanner.next();

        // Consome a quebra de linha pendente deixada pelo nextInt()/next()
        scanner.nextLine();

        System.out.println("Digite seu Nome: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Digite seu o valor que deseja depositar: ");
        double saldo = scanner.nextDouble();

        // Usado para fechar o scanner, impedindo novas leituras.
        scanner.close();

        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroDaConta, saldo);
    }
}
