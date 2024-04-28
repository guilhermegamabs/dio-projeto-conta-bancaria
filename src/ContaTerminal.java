import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numero = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = entrada.nextDouble();

        System.out.println(ContaTerminal.toString(numero, agencia, nomeCliente, saldo));

        entrada.close();
    }

    public static String toString(int numero, String agencia, String nomeCliente, double saldo) {
        return "\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    }
}