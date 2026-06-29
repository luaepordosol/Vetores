import java.util.Scanner;

public class idade {
    public static Scanner teclado = new Scanner(System.in);
    public static int idade[];
    public static void main(String[] args)  {
        idade = new int[5];
        setIdade();
        getIdade();
        idadeComparada();
        idadeInversa();
    }
    public static void setIdade(){ //rtecebe idades
        int i; // variável local para imprimir as idades
        System.out.println("Informe as idades");
        for(i = 0; i < 5; i++){
            idade[i] = teclado.nextInt();
        }
    }
    public static void getIdade(){
        int i;
        System.out.print("Idades: ");
        for(i = 0; i < 5; i++){
            System.out.print(idade[i]);
            if (i < idade.length - 1) {
            System.out.print(", ");
            }
        } 
    }
    public static void idadeComparada(){
        int i;
        int velho = idade[0];
        int novo = idade[0];

        for(i = 0; i < idade.length; i++){

            if (idade[i] > velho){
                velho = idade[i];
            }
            if (idade[i] < novo){
                novo = idade[i];
            }
        }
        System.out.println("\nIdade do mais velho: " + velho);
        System.out.println("Idade do mais novo: " + novo);
    }
    public static void idadeInversa(){
        int i;
        System.out.println("Idades inversas: ");

        for(i = idade.length - 1; i >= 0; i--){
            System.out.println(idade[i]);
        }
    }
}
