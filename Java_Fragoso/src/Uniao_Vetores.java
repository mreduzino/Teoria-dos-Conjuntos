import java.util.Arrays;
import java.util.Scanner;

public class Uniao_Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] A = new Integer[5];
        int C = 0;

        while(C < 5) {
            if(C == 0) {
                System.out.print("Digite um valor: ");
                A[C] = scanner.nextInt();
                C++;
            } else {
                int chave = 0;
                System.out.print("Digite um valor: ");
                int valor = scanner.nextInt();

                for(int i = 0; i < C; i++) {
                    if(A[i] == valor) {
                        chave = 1;
                        break;
                    }
                }


                if(chave == 0) {
                    A[C] = valor;
                    C++;
                } else {
                    System.out.println("Valor já existe. Tente outro valor.");
                }
            }
        }

        System.out.println("Valores armazenados:");
        System.out.println(Arrays.toString(A));
    }
}
