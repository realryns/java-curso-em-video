package uscs.semana05;

/**
 *
 * @author RYNS
 */
public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Souza");
        p1.setIdade(31);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Bia Nunes");
        p2.setIdade(25);
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Paulo Santos");
        p3.setIdade(45);
        
        Pessoa p4 = new Pessoa();
        p4.setNome("Rui Matos");
        p4.setIdade(13);
        
        p1.Imprime();
        p2.Imprime();
        p3.Imprime();
        p4.Imprime();
        
    }
}
