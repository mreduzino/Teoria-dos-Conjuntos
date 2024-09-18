//O algoritmo encontra a intersecção de dois vetores A e B. Se não houver intersecção, exibe "Intersecção vazia".
import java.util.ArrayList;
import java.util.Arrays;

public class Formacao_Vetor_unico {
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {2,3,4};

        ArrayList<Integer> IT = new ArrayList<Integer>();
        int C = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    C += 1;
                    IT.add(a[i]);
                }
            }
        }
        if(C == 0){
            System.out.println("Intersecção vazia");
        }
        else{
            System.out.println("Intersecção: " + IT);
        }
    }
}