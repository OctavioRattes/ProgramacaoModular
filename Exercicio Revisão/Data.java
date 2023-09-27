import java.util.Scanner;

/*Utilizando os códigos dos exercícios de revisão 08 e 09, use Java para criar uma classe Data. Os objetos desta classe 
obedecem aos requisitos: 
o Deve haver verificação de validade da data e, em caso de problemas, a data passa a ser 01/01/1900; 
o O usuário pode alterar completamente a data para outra, informando dia, mês e ano; 
o Independente do ano que ela indica, a data deve saber dizer em qual dia da semana ela cairá no ano de 
2024; 
o A data deve conseguir ser comparada com outra data e indicar, com valor booleano, se está à frente desta 
outra data no calendário; 
o A data deve ser retornada em uma String formatada para ser usada em outros contextos */

public class Data {

    static Scanner teclado;

    static int[] DIASDOMES = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static String dataValida(String data){
        String resposta="Data válida.";
        
        String[] detalhes = data.split("/");
        if(detalhes.length!=3 || data.length()!=10)
            return "Data em formato incorreto.";

        int dia = Integer.parseInt(detalhes[0]);    
        int mes = Integer.parseInt(detalhes[1]);
        int ano = Integer.parseInt(detalhes[2]);
        int maxDia;
        
        if(ano<1900)
            resposta =  "Ano inválido: só de 1900 em diante.";
        else{
           if (mes < 1 || mes > 12)                           //mês<1 ou mês>12 --> data inválida
                resposta =  "Mês inválido: só de 1 a 12.";
           else { 
                   maxDia = DIASDOMES[mes];
                   if(anoBissexto(ano)&&mes==2)     //para fevereiro de bissextos...
                        maxDia++;
                   
                   if (dia > maxDia)                //verifica validade de acordo com o mês atual
                        resposta =  "Dia inválido: máximo de "+maxDia+" para o mês "+mes+".";
                }
        }                       
        return resposta;

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
    }

    public static boolean anoBissexto(int ano){
        boolean resposta = false;
        if(ano%400==0) 
              resposta = true;
        else if(ano%4==0 && ano%100!=0)
              resposta = true;
        
        return resposta;
    }

    public static String diaDaSemana(String data){

        String resultado = "";


        
        return resultado;

    }
    

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        System.out.println("Digite uma data no formato DD/MM/AAAA:");
        String data = teclado.nextLine();

        data = dataValida(data);

        System.out.println("=============================");
        System.out.println("            Menu\n");
        System.out.println("Digite 1 para alterar a data fornecida:");
        System.out.println("Digite 2 para digitar uma nova data e comparar com a data armazenada anteriormente:");
        System.out.println("Digite 3 para Sair:");

        int opcao = teclado.nextLine();

        int opcao;
        switch (opcao) {
            case 1:
                data = dataValida(data);
                break;
            case 2:
                data = modificarData(data);
                break;
            case 3:
                data = compararData(data);
                break;     
            default:
                System.out.println("Opção inválida.");
                break;
        }

        
        data = diaDaSemana(data);

        System.out.println(dataValida(data));
        System.out.println(diaDaSemana(data));

        teclado.close();
    }

    private static String compararData(String data) {
        return null;
    }

    private static String modificarData(String data) {
        return null;
    }
    
    
}
