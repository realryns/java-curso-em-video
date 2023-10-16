package aula04;

/**
 *
 * @author RYNS
 */
public class Caneta {
    
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    
    //Método Construtor
    public Caneta(String modelo, float ponta, String cor, boolean tampada){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    public void tampar(){
        
        tampada = true;
        
    }
    
    public void destampar(){
        
        tampada = false;
        
    }
    
   
    
    public void status() {        
        System.out.println("SOBRA A CANETA:");
        System.out.println("MODELO: " + this.modelo);
        System.out.println("PONTA: " + this.ponta);    
        System.out.println("COR: " + this.cor);
        
        if (this.tampada == true) {
            System.out.println("A caneta está tampada");
        } else {
            System.out.println("A caneta está destampada");
        }
        
    }
    
    
    
}
