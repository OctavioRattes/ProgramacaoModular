public class App {
    public static void main(String[] args) {
        Conta conta = new Conta("12345678900", "12345-6", 1000.0, 500.0);
        
        System.out.println("Saldo inicial: " + conta.deposito(0)); // Exibe o saldo inicial
        
        double saldoAposSaque = conta.saque(1200.0);
        System.out.println("Saldo após saque de 1200.0: " + saldoAposSaque);
        
        double saldoAposDeposito = conta.deposito(500.0);
        System.out.println("Saldo após depósito de 500.0: " + saldoAposDeposito);
    }
}
