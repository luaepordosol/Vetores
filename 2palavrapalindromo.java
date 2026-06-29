import java.util.Scanner;

public class palavrapalindromo {
    public static Scanner teclado;
    public static String palavraS;
    public static char[] palavraV;

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        System.out.println("Insira uma palvra!");
        palavraS = teclado.nextLine();
        converterVetor();
    }

    public static void converterVetor(){
        palavraV = palavraS.toCharArray(); // convertendo de string para vetor de char;
        System.out.println("A palavra tem " + palavraV.length + " letras");
        System.out.println("A primeira letra da palvra é: " + palavraV[0]);
        int u, i;
        u = palavraV.length - 1;
        System.out.println("A última letra da palavra é: " + palavraV[u]);
        String invertida = "";
        
        for(i = u; i >= 0; i--){
            System.out.println(palavraV[i]);
            invertida += palavraV[i];
        }

        if(palavraS.equals(invertida)){
            System.out.println("É um palíndromo");
        }
        else{
            System.out.println("Não é palíndromo");
        }
    }
}