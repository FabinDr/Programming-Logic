package academy.devdojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula02Impares {
    public static void main(String[] args) {
        Scanner impar = new Scanner(System.in);
        System.out.println("digite um numero inteiro: ");
        int numero = impar.nextInt();
        int contador = 0;
        while (contador <= numero) {
            if (contador % 2 == 1) {
                System.out.println("contador: " + contador);
            }
            contador++;
        }
    }
}
