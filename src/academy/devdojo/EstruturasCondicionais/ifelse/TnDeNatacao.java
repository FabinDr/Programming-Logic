package academy.devdojo.EstruturasCondicionais.ifelse;

import java.util.Scanner;

public class TnDeNatacao {
    public static void main(String[] args) {
        Scanner torneio = new Scanner(System.in);
        System.out.println("Digite o nome do competidor: ");
        String nome = torneio.next();
        System.out.println("Digite a sua idade: ");
        int idade = torneio.nextInt();
        if (idade <= 10) {
            System.out.println("O competidor " + nome + " participará da categoria infatil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("O competidor " + nome + " participará da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("O competidor " + nome + " participará da categoria pré-adulto");
        } else {
            System.out.println("O competidor " + nome + " participará da categoria adulto");
        }
    }
}
