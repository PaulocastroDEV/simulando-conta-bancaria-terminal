import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da conta");
		conta.setNumero(sc.nextInt());
		System.out.println("Digite a agencia");
		conta.setAgencia(sc.next());
		System.out.println("Digite seu nome");
		conta.setNome(sc.next());
		System.out.println("Digite o saldo");
		conta.setSaldo(sc.nextDouble());
		System.out.println(conta.toString());
		System.out.println("Qual valor deseja sacar: ");
		conta.saque(sc.nextDouble());
		sc.close();
	}

}
