package aula05;

/**
 *
 * @author RYNS
 */
public class Aula05 {

    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        //Depósitos
        p1.depositar(100);
        p2.depositar(500);
        
        //Saques
        p2.sacar(1000);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
