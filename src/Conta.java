
public class Conta {
		private int numero;
		private String agencia;
		private String nome;
		private double saldo;
		
		public Conta() {
			
		}

		public Conta(int numero, String agencia, String nome) {
			super();
			this.numero = numero;
			this.agencia = agencia;
			this.nome = nome;
			saldo = 0;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getSaldo() {
			return saldo;
		}

		public void saque(double saque) {
			if(saque>saldo) {
				System.out.println("Não é possivel sacar esse valor");
			}else {
				this.saldo=saldo-saque;
				System.out.println("Novo saldo: "+ getSaldo());
			}
		}
		
		public void setSaldo(double saldo) {
			if(saldo<0) {
				System.out.println("Não é possivel depositar valores negativos");
			}else {
				this.saldo = saldo;
			}
			
		}

		@Override
		public String toString() {
			return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + ", e seu saldo " + saldo+" já esta disponivel para saque ";
		}

		
}

