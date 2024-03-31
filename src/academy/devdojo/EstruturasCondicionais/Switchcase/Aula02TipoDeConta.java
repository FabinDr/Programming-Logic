package academy.devdojo.EstruturasCondicionais.Switchcase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner juros = new Scanner(System.in);
        System.out.println("Digite o numero referente ao seu tipo de conta: \n(1) CONTA POUPANCA \n(2) CONTA CORRENTE \n(3) CONTA INVESTIMENTO");
        int conta = juros.nextInt();

        switch (conta) {
            case 1:
                System.out.println("0.05%");
                break;
            case 2:
                System.out.println("0.02%");
                break;
            case 3:
                System.out.println("0.1%");
                break;
            default:
                System.out.println("Tipo de conta Invalido");
        }
    }
}
