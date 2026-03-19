<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
import org.junit.Test;
=======
import org.junit.Test;
import static org.junit.Assert.assertEquals;
>>>>>>> c86b1045537bd3a6e60407ad6807a8bb99ee07bb

public class ContaTest {

    @Test
    public void testSaqueValorMaiorQueSaldoELimite() {
        Conta conta = new Conta("12345678900", "12345-6", 100.0, 50.0);
        double saldoAposSaque = conta.saque(160.0);
        assertEquals(100.0, saldoAposSaque, 0.001);
    }

    @Test
    public void testDepositoComSaldoNegativo() {
        Conta conta = new Conta("12345678900", "12345-6", -50.0, 100.0);
        double saldoAposDeposito = conta.deposito(100.0);
        assertEquals(47.0, saldoAposDeposito, 0.001);
    }

    @Test
    public void testDepositoComSaldoPositivo() {
        Conta conta = new Conta("12345678900", "12345-6", 50.0, 100.0);
        double saldoAposDeposito = conta.deposito(100.0);
        assertEquals(150.0, saldoAposDeposito, 0.001);
    }

}
