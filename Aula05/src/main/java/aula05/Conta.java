package aula05;

/**
 *
 * @author RYNS
 */
public class Conta {
    int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
    } 
    
    public void fecharConta(){
        
    } 
    
    public void depositar(){
        
    }
    
    public void sacar(){
        
    }
    
    public void pagarMensal(){
    
    }
    
    
    
    //Métodos especiais
    
    //Método construtor
    public Conta(){
        this.setStatus(true);
        this.setSaldo(0);
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
    

