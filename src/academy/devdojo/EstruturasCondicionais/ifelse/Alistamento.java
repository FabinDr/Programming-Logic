package academy.devdojo.EstruturasCondicionais.ifelse;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Diga a sua idade: ");
        int idade = Input.nextInt();
        System.out.println("Diga o seu sexo: ('M'; 'F')");
        char Sexo = Input.next().charAt(0);

        if ( (Sexo == 'M' || Sexo == 'F') && idade < 18){
            System.out.println("academy.devdojo.EstruturasCondicionais.ifelse.Alistamento não permitido");
        } else if (Sexo == 'M' && idade >= 18) {
            System.out.println("academy.devdojo.EstruturasCondicionais.ifelse.Alistamento obrigatorio");
        }else if (Sexo == 'F' && idade >= 18) {
            System.out.println("Desja se alistar? (Sim ou Não)");
            String resposta = Input.next();
            if(resposta.equalsIgnoreCase("Sim")){
                System.out.println("academy.devdojo.EstruturasCondicionais.ifelse.Alistamento concluído com sucesso.");
            }else if(resposta.equalsIgnoreCase("Não")){
                System.out.println("Processo finalizado, alistamento não realizado.");
            }
        }
    }
}
