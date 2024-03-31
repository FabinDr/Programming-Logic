package academy.devdojo.EstruturasCondicionais.ifelse;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Fabio";
        int idade = 20;
        if (idade <= 10){
            System.out.println(nome+ " participará da categoria infatil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome+ " participará da categoria juvenil");
        } else if (idade >=16 && idade <= 19) {
            System.out.println(nome+ " participará da categoria pré-adulto");
        } else {
            System.out.println(nome+ " participará da categoria adulto");
        }

    }

}
