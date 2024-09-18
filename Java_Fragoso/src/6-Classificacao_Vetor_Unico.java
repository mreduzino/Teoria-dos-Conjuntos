//O algoritmo encontra elementos de A que não estão em B.

import java.util.ArrayList;

public class Classificacao_Vetor_Unico {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5};
        int[] B = {2, 3, 4};
    
        ArrayList<Integer> CAB = new ArrayList<Integer>();
        int C = 0;

        for(int i = 0; i < A.length; i++){
            int Chave = 1;
            for(int j = 0; j < B.length; j++){
                if(A[i] == B[j]){
                    Chave = 0;
                    break;
                }
            }
            if(Chave >= 1){
                CAB.add(A[i]);
                C++;
            }
        }

        System.out.println(CAB);
    }
}