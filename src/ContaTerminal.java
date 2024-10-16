import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner numAgencia = new Scanner(System.in);
        Scanner numConta = new Scanner(System.in);
        Scanner nomeCliente = new Scanner(System.in);
        Scanner saldo = new Scanner(System.in);

        System.out.println("Digite o número da agência (Ex.: 0000-0): ");
        String numeroAgencia = numAgencia.nextLine();
        System.out.println("Digite o número da conta: ");
        int numeroConta = numConta.nextInt();
        System.out.println("Insira seu nome: ");
        String nomeCli = nomeCliente.nextLine();
        System.out.println("Insira o saldo: ");
        float saldoConta = saldo.nextFloat();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCli, numeroAgencia, numeroConta, saldoConta));
    }
}