public class ordenarVetor{
    public static void main(String args[]){
        int[] vetorOriginal = {17, 36, 48, 12, 10, 38};
        int[] vetorOrdenado = new int[16];

        System.out.println("\nVetor fora de ordem: ");
        imprimeVetor(vetorOriginal);
        vetorOrdenado = ordenarVetor(vetorOriginal);
        System.out.println("\nVetor Ordenado: ");
        imprimeVetor(vetorOrdenado);
        System.out.println("\nSoma do vetor:\n" + imprimeSoma(vetorOriginal));
        
    }
    public static int[] ordenarVetor(int[] v){
         for (int i = 0; i < v.length - 1; i++) {
        for (int j = 0; j < v.length - 1 - i; j++) {

            if (v[j] > v[j + 1]) {
                int aux = v[j];
                v[j] = v[j + 1];
                v[j + 1] = aux;
            }

        }
    }
    return v;

    }
    public static void imprimeVetor(int[] vetor){
        int i;
        for (i=0; i<6; i++){
            System.out.printf("%d ", vetor[i]);
        }
    }

    public static int imprimeSoma(int[] v){
    int soma = 0;

        for(int i = 0; i < v.length; i++){
        soma += v[i];
        }
    return soma;
    }
}   
