import java.io.IO;

public class Exercício2 {
    public static void main(String[] args) {
        String numero1 = IO.readln("Digite a largura do retângulo: ");
        int largura  = Integer.parseInt(numero1);
        String numero2 = IO.readln("Digite a altura do retângulo: ");
        int altura  = Integer.parseInt(numero2);
        
        for (int i = 0; i < largura; i++) {
            IO.print("X");
        }
        IO.println();
        for (int i = 0; i < altura; i++){
            IO.print("X");
            for (int j = 0; j < largura - 2; j++) {
                IO.print(" ");
            }
            if (largura > 1) {
                IO.print("X");
            }
            IO.println();
        }
        for (int i = 0; i < largura; i++) {
            IO.print("X");
        }
    }
}
