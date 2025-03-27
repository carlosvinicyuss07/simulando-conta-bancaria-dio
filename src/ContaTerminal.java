import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** CONTA BANCÁRIA ****");
        System.out.print("Olá, qual o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();
        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Qual o saldo da conta? R$");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.println("\"Olá " + nomeCliente + ", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", " +
                "conta " + numero + " " +
                "e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque\".");

        sc.close();
    }
}
