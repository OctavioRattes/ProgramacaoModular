
public class Pizza {
    private int maxIngredientes;
    private double precoBase;
    private String descricao;
    private double valorPorAdicional;
    private int quantidadeIngredientes;

    public Pizza(int maxIngredientes, double precoBase, String descricao, double valorPorAdicional) {
        if (maxIngredientes < 0) {
            throw new IllegalArgumentException("O limite de ingredientes nao pode ser negativo.");
        }
        if (precoBase < 0 || valorPorAdicional < 0) {
            throw new IllegalArgumentException("Valores monetarios nao podem ser negativos.");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descricao da pizza e obrigatoria.");
        }

        this.maxIngredientes = maxIngredientes;
        this.precoBase = precoBase;
        this.descricao = descricao.trim();
        this.valorPorAdicional = valorPorAdicional;
        this.quantidadeIngredientes = 0;
    }

    public double valorAPagar() {
        return precoBase + (quantidadeIngredientes * valorPorAdicional);
    }

    public int adicionarIngredientes(int quantos) {
        if (quantos <= 0) {
            System.out.println("A quantidade de ingredientes deve ser maior que zero.");
            return quantidadeIngredientes;
        }

        if (quantidadeIngredientes + quantos > maxIngredientes) {
            System.out.println("Quantidade de ingredientes excede o limite maximo.");
            return quantidadeIngredientes;
            
        }

        quantidadeIngredientes += quantos;
        return quantidadeIngredientes;
    }

    public String cupomDeVenda() {
        return "Descrição: " + descricao + "\n" +
               "Preco Base: R$ " + String.format("%.2f", precoBase) + "\n" +
               "Valor por Adicional: R$ " + String.format("%.2f", valorPorAdicional) + "\n" +
               "Quantidade de Ingredientes Adicionais: " + quantidadeIngredientes + "\n" +
               "Valor Total a Pagar: R$ " + String.format("%.2f", valorAPagar());
    }

    @Override
    public String toString() {
        return cupomDeVenda();
    }
}