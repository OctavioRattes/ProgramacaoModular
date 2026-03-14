public class ContaTest {

    @Test
    public void sacarValorMenorQueSaldoELimite() {
        Conta conta = new Conta("12345678900", "12345-6", 1000.0, 500.0);
        double saldoAposSaque = conta.saque(1200.0);
        assertEquals(-200.0, saldoAposSaque, 0.01);
    }
    
}
