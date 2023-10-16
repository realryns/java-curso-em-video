package aula04;

public class Aula04 {
    public static void main(String[] args) {

       //c1 usou-se um construtor
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        c1.status();

        Caneta c2 = new Caneta();

        c2.setModelo("FaberCastell");

        c2.status();

    }
}