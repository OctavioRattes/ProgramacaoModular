import java.util.Scanner;

public class Datamain {

    static Scanner teclado;

    static int[] DIASDOMES = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    private String data;

    public Datamain(String data) {
        this.data = dataValida(data);
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = dataValida(data);
    }

    public String dataValida(String data){
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
           if (mes < 1 || mes > 12)
                resposta =  "Mês inválido: só de 1 a 12.";
           else { 
                   maxDia = DIASDOMES[mes];
                   if(anoBissexto(ano)&&mes==2)
                        maxDia++;
                   
                   if (dia > maxDia)
                        resposta =  "Dia inválido: máximo de "+maxDia+" para o mês "+mes+".";
                }
        }                       
        return resposta;
    }

    public boolean anoBissexto(int ano){
        boolean resposta = false;
        if(ano%400==0) 
              resposta = true;
        else if(ano%4==0 && ano%100!=0)
              resposta = true;
        
        return resposta;
    }

    public String diaDaSemana(){

        String resultado = "";

        if (dataValida(this.data).equals("Data válida.")) {
            String[] detalhes = this.data.split("/");
            int dia = Integer.parseInt(detalhes[0]);
            int mes = Integer.parseInt(detalhes[1]);

            int totalDias = 0;

            // Calcula quantos dias corresponde a quantidade de meses que já se passaram aproveitando a definição de DIASDOMES
            for (int i = 1; i < mes; i++) {
                totalDias += DIASDOMES[i];
            }

            // Adiciona a quantidade de dia fornecida pelo usuário
            totalDias += dia;

            // Divide por 7 pois é a quantidade de dias da semana
            int diaDaSemana = (totalDias + 1) % 7; // +1 porque 1º de janeiro de 2024 é segunda-feira

            // Estipula uma string correspondente a cada dia da semana para vincular ao resultado acima
            String[] diasDaSemana = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" };

            resultado = "O dia da semana correspondente a esta data é " + diasDaSemana[diaDaSemana] + ".";
        }

        return resultado;
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        // O usuário deverá digitar uma data no formato DD/MM/AAAA:
        System.out.println("Digite uma data no formato DD/MM/AAAA:");
        String data = teclado.nextLine();

        Datamain dataObj = new Datamain(data);

        System.out.println("\n\n=============================");
        System.out.println("            Menu\n");
        System.out.println("Digite 1 para alterar a data fornecida:");
        System.out.println("Digite 2 para digitar uma nova data e comparar com a data armazenada anteriormente:");
        System.out.println("Digite 3 para Sair:");
        
        // Deverá capturar a opção do usuário no switch.
        int opcao = Integer.parseInt(teclado.nextLine());

        switch (opcao) {
            // Opção 1 deverá receber a nova data, armazená-la, verificar se é válida. Se válida, dizer qual dia da semana corresponde
            // no ano de 2024 e retornar para o menu do switch.
            case 1:
                System.out.println("Digite uma nova data no formato DD/MM/AAAA:");
                data = teclado.nextLine();
                dataObj.setData(data);
                System.out.println(dataObj.diaDaSemana());
                break;
            // Opção 2 deverá receber a nova data, armazená-la, verificar se é válida. Se válida, dizer qual dia da semana corresponde
            // no ano de 2024. Após dizer se a nova data é mais recente ou mais antiga do que a outra data que já estava no sistema.
            // Após deverá retornar para o menu do switch.
            case 2:
                System.out.println("Digite uma nova data no formato DD/MM/AAAA:");
                data = teclado.nextLine();
                Datamain newDataObj = new Datamain(data);
                if (dataObj.getData().equals(newDataObj.getData())) {
                    System.out.println("As datas são iguais.");
                } else if (dataObj.getData().compareTo(newDataObj.getData()) > 0) {
                    System.out.println("A data armazenada é maior.");
                } else {
                    System.out.println("A nova data é maior.");
                }
                break;
            // Opção 3 deverá encerrar o programa.
            case 3:
                break;
            // No default deverá dizer que a opção digitada não é válida e retornar para o menu switch novamente.
            default:
                System.out.println("Opção inválida.");
                break;
        }

        teclado.close();
    }
}