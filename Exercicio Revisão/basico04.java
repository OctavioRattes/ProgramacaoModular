import java.util.Scanner;

public class basico04 {

    public static char[] inverter(char[] frase) {
        char letra;
        int tamanho = frase.length;

        for (int i = 0; i < (tamanho / 2); i++) {
            letra = frase[i];
            frase[i] = frase[tamanho - i - 1];
            frase[tamanho - i - 1] = letra;
        }
        return frase;
    }

    public static char[] lerFrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase de até 100 caracteres ou 'fim' para terminar:");
        String input = scanner.nextLine();

        if (input.equals("fim")) {
            System.exit(0);
        }

        return input.toCharArray();
    }

    public static void main(String[] args) {

        char[] frase;

        while (true) {
            frase = lerFrase();
            if (new String(frase).equals("fim")) {
                break;
            }
            frase = inverter(frase);
            System.out.println("Invertida: " + new String(frase));
        }
        scanner.close();
    }
}
