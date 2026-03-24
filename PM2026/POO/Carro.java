package POO;

public class Carro {
    private String placa;
    private double velocidade;

    public Carro(String placa){
        this.placa = placa;
        this.velocidade = 0.0;
    }

    public void acelerar(double valorAceleracao) {
        velocidade += valorAceleracao;
    }

    public void frear(double valorFreada) {
        velocidade -= valorFreada;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
}
