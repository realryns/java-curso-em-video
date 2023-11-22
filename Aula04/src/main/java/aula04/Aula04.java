package aula04;

/**
 *
 * @author RYNS
 */
public class Aula04 {

    public static void main(String[] args) {
        
        /*Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setCor("Azul");
        c1.setPonta(0.5f);
       
        c1.status();
        */
        Caneta c2 = new Caneta("Rua Amazonas,294", 0.5f, "123.456.789-00", false);
        
        c2.status();
    }
}
