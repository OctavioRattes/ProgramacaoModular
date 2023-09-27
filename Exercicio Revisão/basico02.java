import java.util.Scanner;

public class basico02 {

    public static int[] calcularSoma (int[] vetor){
        
    int tamanho = vetor.length;

    int[] resultado = new int[tamanho % 2 == 0 ? tamanho / 2 : tamanho / 2 + 1]; 
    
    for (int i = 0; i < tamanho; i = i + 2){
        resultado[i/2] = vetor[i] + (i + 1 < tamanho ? vetor[i + 1] : vetor[i]);
            }
        return resultado;
        }

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int tamanho;

            System.out.println("Digite o tamanho do vetor: ");
            tamanho = input.nextInt();

           int[] vetor = new int [tamanho];

            System.out.println("Digite os números do vetor: ");
            for (int i = 0; i < tamanho; i++){
                vetor[i] = input.nextInt();
        }
            int[] resultado = calcularSoma(vetor);

            System.out.println("Resultado da soma dos vizinhos:");
                for (int valor : resultado) {
                System.out.print(valor + " ");
            }
            input.close();
        }

    }

