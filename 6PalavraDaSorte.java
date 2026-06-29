import java.util.Scanner;
public class PalavraDaSorte {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    String[] animais = {
    "cavalo", "macaco", "jacaré", "coelho", "gavião",
    "coruja", "pombo", "lagarto", "camelo", "falcão"
    };

    System.out.print("Digite um número de 0 a 9: ");
    int numero = input.nextInt();

    String animalSorte = animais[numero];
    System.out.println("O animal da sorte de hoje é: " + animalSorte);
    System.out.println("3 letra da palavra: "+animalSorte.charAt(2));
    }   
}