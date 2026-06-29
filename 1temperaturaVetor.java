import java.util.Scanner;

public class tempMetodoi {
    public static Scanner teclado = new Scanner(System.in);
    public static int[] temperatura;
    public static String cidade;

    public static void main(String[] args) throws Exception {
        temperatura = new int[6];
        setTemperaturas(); //da temperaturas
        getTemperaturas();
        getMedia();
        getComparacao();
    }
    
    public static void setTemperaturas(){
        int i; //variavel local para ler 6 temperaturas
        System.out.println("Insira o nome da cidade");
        cidade = teclado.nextLine();
        System.out.println("Insira as últimas 6 temperaturas em °C");
        for (i=0; i<6; i++){
            temperatura[i] = teclado.nextInt();
        }
    }

    public static void getTemperaturas(){
        int i; 
        System.out.println("Cidade: \n" + cidade);
        for(i = 0; i < 6; i++)
        System.out.printf("\nDia %d: %dºC", i, temperatura[i]);
    }

    public static void getMedia(){
        int i, somaT, media;
        somaT = 0;
        for(i = 0; i < 6; i++){
            somaT = somaT + temperatura[i];
        }
        media = somaT/6;
        System.out.println("Média de temperatura em °C: " + media);
    }

    public static void getComparacao(){
        int maior = temperatura[0];
        int menor = temperatura[0];
        int i;

        for(i = 0; i < temperatura.length; i++){

            if (temperatura[i] > maior){
                maior = temperatura[i];
            }
            if (temperatura[i] < menor){
                menor = temperatura[i];
            }
        }
        String[] meses = {
        "Janeiro", "Fevereiro", "Março", "Abril",
        "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.println("\nMaior temperatura: °C" + meses + maior);
        System.out.println("Menor temperatura: °C" + menor);
    }
}   
