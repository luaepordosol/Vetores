import java.util.Scanner;

public class forca {
    public static Scanner teclado = new Scanner(System.in);
    public static int vidas = 5;
    public static String palavra;
    public static char jogar;

    public static void main(String[] args) {

        do {
            vidas = 5; // reinicia as vidas
            escolherPalavra();

        } while (jogar == 's');
    }

    public static void escolherPalavra() {
        String[] palavras = {
                "BANANA", "ESCOLA", "FUTURO", "JANELA", "CAMISA",
                "BONECA", "PAREDE", "CAVALO", "FOGUETE", "TECLAS",
                "ABELHA", "PEDRAS", "VIAGEM", "TOMATE", "BOLHAS"
        };
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha um número de 0 a 14: ");
        int pos = teclado.nextInt();

        palavra = palavras[pos];
        descobrirPalavra();
    }

    public static void descobrirPalavra() {
        char[] descoberta = new char[6];

        for (int i = 0; i < descoberta.length; i++) {
            descoberta[i] = '_';
        }

        while (vidas > 0 &&
                !String.valueOf(descoberta).equals(palavra)) {
            System.out.println("Vidas: ");
            for (int i = 0; i < vidas; i++) {
                System.out.print("* ");
            }
            System.out.print("\nDigite uma letra: ");

            char letra = teclado.next().toUpperCase().charAt(0);
            boolean acertou = false;

            for (int i = 0; i < palavra.length(); i++) {
                if (letra == palavra.charAt(i)) {
                    descoberta[i] = letra;
                    acertou = true;
                }
            }
            if (!acertou) {
                vidas--;
                System.out.println("Ai caramba! Vida restante: " + vidas);
            }
            for (int i = 0; i < descoberta.length; i++) {
                System.out.print(descoberta[i] + " ");
            }
            System.out.println();
            if (String.valueOf(descoberta).equals(palavra)) {
                System.out.println("Você venceu!");
            }
            if (vidas == 0) {
                System.out.println("Você perdeu!");
                System.out.println("A palavra era: " + palavra);
            }
        }

        System.out.println("Deseja jogar novamente?");
        jogar = teclado.next().charAt(0);
    }
}