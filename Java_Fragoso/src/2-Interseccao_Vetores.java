import java.util.ArrayList;

public class Interseccao_Vetores {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 4};
        ArrayList<Integer> X = new ArrayList<>();
        int C = 0;

        X.add(A[0]);

        for (int i = 1; i < A.length; i++) {
            int Chave = 0;

            for (int j = 0; j <= C; j++) {
                if (A[i] == X.get(j)) {
                    Chave = 1;
                    break;
                }
            }

            if (Chave == 0) {
                C++;
                X.add(A[i]);
            }
        }

        System.out.println(X);
    }
}
