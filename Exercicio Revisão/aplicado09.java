import java.util.Scanner;

public class aplicado09 {

    static Scanner teclado;

    static int[] DIASDOMES = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static String leitura(String mensagem) {
        System.out.print("\n" + mensagem + ": ");
        return teclado.nextLine();
    }

    public static String dataValida(String data) {
        String resposta = "Data válida.";

        String[] detalhes = data.split("/");
        if (detalhes.length != 2 || data.length() != 5)
            return "Data em formato incorreto.";

        int dia = Integer.parseInt(detalhes[0]);
        int mes = Integer.parseInt(detalhes[1]);
        int maxDia;

        if (mes < 1 || mes > 12) {
            resposta = "Mês inválido: só de 1 a 12.";
        } else {
            maxDia = DIASDOMES[mes];

            if (dia > maxDia) {
                resposta = "Dia inválido: máximo de " + maxDia + " para o mês " + mes + ".";
            }
        }

        return resposta; // retorna a resposta atualizada ou "Data válida."
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        String data = leitura("Digite uma data para o ano de 2024 (formato DD/MM)");
        System.out.println(dataValida(data));

        //Aproveitei o código acima do professor que separa a data fornecida em dia e mês

        if (dataValida(data).equals("Data válida.")) {
            String[] detalhes = data.split("/");
            int dia = Integer.parseInt(detalhes[0]);
            int mes = Integer.parseInt(detalhes[1]);

            int totalDias = 0;

            // Calcula quantos dias corresponde a quantidade de meses que já se passaram aproveitando a definição de DIASDOMES
            for (int i = 1; i < mes; i++) {
                totalDias += DIASDOMES[i];
            }

            // Adiciona a quantidade de dia fornecido pelo usuário
            totalDias += dia;

            // Divide por 7 pois é a quantidade de dias da semana
            int diaDaSemana = (totalDias + 1) % 7; // +1 porque 1º de janeiro de 2024 é segunda-feira

            // Estipula uma string correspondente a cada dia da semana para vincular ao resultado acima
            String[] diasDaSemana = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" };

            System.out.println("O dia da semana correspondente a esta data é " + diasDaSemana[diaDaSemana] + ".");
        }

        teclado.close();
    }
}
