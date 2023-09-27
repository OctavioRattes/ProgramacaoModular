
import java.util.Scanner;


public class aplicado06 {



    public static int lerNumSorteio(int primeiroPremio, int segundoPremio){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os números do primeiro prêmio:");
        primeiroPremio = teclado.nextInt();
        System.out.println("Digite os números do segundo sorteio:");
        segundoPremio = teclado.nextInt();
        return lerNumSorteio(numeroUm, numeroDois);
    }
   

    public static void main(String[] args) {
         int numeroUm = 0;
         int numeroDois = 0;
         int numSorteio = lerNumSorteio(numeroUm, numeroDois);
         System.out.println(numSorteio);

    }
    
}
