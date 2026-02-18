import java.io.IO;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor;
        String numero = IO.readln("Quantos números você vai digitar? ");
        int n = Integer.parseInt(numero);
        vetor = new int[n];
        int soma = 0;
        int pares = 0;
        double media;
        for (int i = 0; i < n; i++) {
            String valor = IO.readln("Digite o número " + (i + 1) + ": ");
            int numerico = Integer.parseInt(valor);
            vetor[i] = numerico;
            if (numerico % 2 == 0) {
                pares++;
            }
            soma += numerico;
        }
        media = (double) soma / n;
        double metadeMedia = media / 2;
        int menorMetade = 0;
        int maiorMedia = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] > media) {
                maiorMedia++;
            }
            if (vetor[i] < metadeMedia) {
                menorMetade++;
            }
        }

        IO.println("Soma = " + soma);
        IO.println("Media = " + media);
        IO.println("Pares = " + pares);
        IO.println("Ímpares = " + (n - pares));
        IO.println("Números maiores que a média = " + maiorMedia);
        IO.println("Números menores que a metade da média = " + menorMetade);
    }
}