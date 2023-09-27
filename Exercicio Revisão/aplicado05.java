import java.util.Scanner;

public class aplicado05 {

    static Scanner teclado = new Scanner (System.in);

    //Método para obter o número de matérias que o aluno se inscreveu
    public static int obterNumeroMaterias(){
        System.out.println("Digite a quantidade de matérias matriculadas:");
         return teclado.nextInt();
    }

    //Método para o aluno fornecer o tempo disponível para estudo
    public static double calcularTempoDeEstudo(int horas, int minutos){
        System.out.println("Digite a quantidade de horas disponíveis para estudo por semana:");
        horas = teclado.nextInt();
        System.out.println("Digite a quantidade de minutos disponíveis para estudo por semana:");
        minutos = teclado.nextInt();
        return (horas * 60) + minutos;
    }
    
    public static void main(String[] args) {

        //Chama o método obterNumeroMateriais
        int matriculadas = obterNumeroMaterias();

        System.out.print("Você está matriculado em " + matriculadas + " matérias.\n");

        int horasDisponveis = 0;
        int minutosDisponiveis = 0;

        // Chama o método para calcular o tempo de estudo
        double tempoEstudo = calcularTempoDeEstudo(horasDisponveis, minutosDisponiveis);

        System.out.println("Você tem " + tempoEstudo + " minutos para o seu estudo de " + matriculadas + " matérias matriculadas.\n");


        System.out.println("Você pode estudar cada matéria por " + tempoEstudo / matriculadas + " sem intervalo ou pode estudar cada uma das " + matriculadas + " matérias por " + ((tempoEstudo - (matriculadas * 15)) / matriculadas) + " minutos com um intervalo de 15 minutos.");



        

    teclado.close();
    }
}
