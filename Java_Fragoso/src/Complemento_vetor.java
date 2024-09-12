import java.util.Arrays;

public class Complemento_vetor {
    public static void main(String[] args) {
        Integer[] A = new Integer[] {3, 1, 4, 2};

        int n = A.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (A[i] > A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(A));
    }
}
