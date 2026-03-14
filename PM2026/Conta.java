public class Conta {

	private String cpf;
	private String conta;
	private double saldo;
	private double limite;
	private double taxa = 0.03;

	public Conta (String cpf, String conta, double saldo, double limite){
		this.cpf = cpf;
		this.conta = conta;
		this.saldo = saldo;
		this.limite = limite;
	}

	public double saque(double valorSaque) {
		if (saldo + limite >= valorSaque) {
			saldo -= valorSaque;
		} else {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}
		return saldo;
	}

	public double deposito(double valorDeposito) {
		if (saldo < 0) {
			return saldo += valorDeposito - calcularTaxa(valorDeposito);
		}
		return saldo + valorDeposito;
	}

	public double calcularTaxa(double valorDeposito) {
		return valorDeposito * taxa;
	}

}
