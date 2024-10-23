import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Porfavor digite o número da agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o numero de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu nome porfavor: ");
        String clienteNome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String clienteSobrenome = scanner.next();

        System.out.println("Digite quanto deseja depositar na conta: ");
        Double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + clienteNome + " " + clienteSobrenome + " obrigado por criar uma conta em nosso banco, sua agencia é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponivel para saque.067");

    }
}
