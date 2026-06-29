import java.util.Scanner;

public class PesquisaTemepartura {
    public static Scanner teclado = new Scanner(System.in);
    public static int[] temperatura;

    public static void main(String[] args) throws Exception {
        temperatura = new int[12];
        setTemperaturas();
        getMedia();
        getComparacao();
        getMesesAcimaMedia();
    }
     public static void setTemperaturas(){
        int i; //variavel local para ler 6 temperaturas
        System.out.println("Insira a temperatra média dos últimos 12 meses em °C");
        for (i=0; i<12; i++){
            temperatura[i] = teclado.nextInt();
        }
    }
     public static void getMedia(){
        int i, somaT, media;
        somaT = 0;
        for(i = 0; i < 12; i++){
            somaT = somaT + temperatura[i];
        }
        media = somaT/12;
        System.out.println("Média anual de temperatura em °C: " + media);
    }
    public static void getComparacao(){
        int maior = temperatura[0];
        int menor = temperatura[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        int i;

        String[] meses = {
        "Janeiro", "Fevereiro", "Março", "Abril",
        "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        for(i = 0; i < temperatura.length; i++){

            if (temperatura[i] > maior){
                maior = temperatura[i];
                indiceMaior = i;
            }
            if (temperatura[i] < menor){
                menor = temperatura[i];
                indiceMenor = i;
            }
        }
    System.out.println("Mês mais quente: " + meses[indiceMaior] + " com " + maior + "°C");
    System.out.println("Mês mais frio: " + meses[indiceMenor] + " com " + menor + "°C");
    }

    public static void getMesesAcimaMedia(){
    int soma = 0;

        for (int i = 0; i < temperatura.length; i++) {
            soma += temperatura[i];
        }

    int media = soma / temperatura.length;

    int contador = 0;

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > media) {
                contador++;
            }
        }
    System.out.println("Meses acima da média: " + contador);
    } 
}