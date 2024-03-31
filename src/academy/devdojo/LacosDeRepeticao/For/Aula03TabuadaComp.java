package academy.devdojo.LacosDeRepeticao.For;

public class Aula03TabuadaComp {
    public static void main(String[] args) {
        for (int i =1; i <=10; i++){
            System.out.println("Tabuada do numero: " +i);
            for (int j =1; j <=10; j++){
                System.out.println(i + "x" + j );
            }
        }
    }
}
