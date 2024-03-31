package academy.devdojo.Arrays.Multidimensionais;

public class Aula02ArraysMulti {
    public static void main(String[] args) {
        int[][] ArraysM = new int[2][3];
        ArraysM[0][0] = 22;
        ArraysM[0][1] = 11;
        ArraysM[0][2] = 54;
        ArraysM[1][0] = 44;
        ArraysM[1][1] = 56;
        ArraysM[1][2] = 77;
        for (int i = 0; i < ArraysM.length; i++) {
            for (int j = 0; j < ArraysM[i].length; j++) {
                System.out.println("[" + i + "][" + j + "]=" + ArraysM[i][j]);
            }
        }
    }
}
