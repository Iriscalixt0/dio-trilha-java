import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        /*TODO: Conhecer e importar a classe Scanner
        Exibir as mensagens para o novo usuário
        Obter pela Scanner os valores digitados no terminal
        Exibir a mensagem criada*/

        Scanner teclado = new Scanner(System.in);
        
        int Numero;
        String Agencia;
        String nomeCliente;
        Double Saldo;

        System.out.println("Por favor, digite o número da Conta !");
        Numero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        Agencia = teclado.nextLine();

        System.out.println("Por favor, digite seu nome !");
        nomeCliente = teclado.nextLine();

        System.out.println("Por favor, digite o saldo !");
        Saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

        teclado.close();
    }
}
