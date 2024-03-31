package academy.devdojo.Arrays.Unidimensionais;

public class Aula02ArraysUnidi {
    public static void main(String[] args) {
        int[] V1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] V2 = {2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < 9 ; i++) {
            System.out.println("Resultado: " + V1[i] * V2[i]);
        }
    }
}
