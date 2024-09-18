import java.util.Arrays;

public class Insercao_elementos_unicos {
    public static void main(String[] args){
    	int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};

        // Calculando o tamanho total
        int n = A.length;
        int[] U = new int[2 * n];

        // Copiando os elementos
        for (int i = 0; i < n; i++) {
            U[i] = A[i];
            U[i + n] = B[i];
        }
        
        System.out.println(Arrays.toString(U));
    }
}
