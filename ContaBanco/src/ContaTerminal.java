import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner conta = new Scanner(System.in);
        String nconta;
        while (true) {
            System.out.println("Digite o número da sua conta (Formato: xxxx): ");
            nconta = conta.nextLine();
            if (nconta.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Formato inválido. Tente novamente! ");
            }
        }

        Scanner agencia = new Scanner(System.in);
        String nagencia;
        while (true) {
            System.out.println("Digite o número da sua agencia (Formato: xxx-x): ");
            nagencia = agencia.nextLine();
            if (nagencia.matches("\\d{3}-\\d")) {
                break;
            } else {
                System.out.println("Formato inválido. Tente novamente! (Formato correto: xxx-x)");
            }
        }
        
        Scanner nome = new Scanner(System.in);
        String name;
        System.out.println("Digite o nome completo: ");
        name = nome.nextLine();

        Random valor = new Random();
        double randomSaldo = 0 + (100000 - 0) * valor.nextDouble();
        double saldo = Math.round(randomSaldo * 100.0) / 100.0;

        System.out.println("Olá "+name+", obrigado por criar uma conta em nosso banco, sua agência é "+nagencia+", e o número da sua conta é "+nconta+". Seu saldo de "+saldo+" já está disponível para saque!");
        
        conta.close();
        agencia.close();
        nome.close();
    
        // Exibir as mensagens para o nosso usuário
        // "Digite o número da sua conta;"
        // "Digite o número da sua agência;"
        // "Agora digite o seu nome COMPLETO"

        // Obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

    }
}
