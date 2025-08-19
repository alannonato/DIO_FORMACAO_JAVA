import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO DA CONTA");
        numConta = leitor.nextInt();
        leitor.nextLine();

        System.out.println("DIGITE O NUMERO DA AGENCIA");
        agencia = leitor.nextLine();

        System.out.println("DIGITE SEU NOME");
        nomeCliente = leitor.nextLine();

        // Exibindo os dados coletados
        System.out.println("\n--- DADOS DA CONTA ---");
        System.out.println("Conta: " + numConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));

        System.out.println("\nOlá " + nomeCliente + " Obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ",conta " + numConta + " e seu saldo " + saldo + " já está disponivel para saque");

        leitor.close(); // Boa prática: fechar o Scanner

    }
}
