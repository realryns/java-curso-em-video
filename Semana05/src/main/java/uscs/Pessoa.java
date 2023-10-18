package uscs;

/**
 *
 * @author RYNS
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    
    //Métodos Personalizados    
    
    public void Imprime() {
        System.out.println("---------------------");
        System.out.println("INFORMAÇÕES:");
        System.out.println("NOME: " + this.getNome());
        System.out.println("IDADE: " + this.getIdade());      
    }
    
    //Métodos Especiais
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
