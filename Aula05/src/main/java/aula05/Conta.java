package aula05;

/**
 *
 * @author RYNS
 */
public class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //Métodos personalizados
    
    public void estadoAtual() {
        System.out.println("----------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta de " + this.getDono() + " aberta com sucesso!");    
    }
    
    public void fecharConta(){
        if (this.getSaldo() < 0) {
            System.out.println("Não foi possível fechar a sua conta. Conta em débito.");           
        } else if (this.getSaldo() > 0){
            System.out.println("Não foi possível fechar a sua conta. Conta com dinheiro.");
        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso.");
        }
    }
    
    public void depositar(double v){
        if (this.getStatus() == false) {
            System.out.println("Impossível depositar. Conta desativada.");
        } else {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósisto realizado na conta de " + this.getDono() + ".");
        }
    }
    
    public void sacar(double v){
        if (this.getStatus() == false){
            System.out.println("Impossível sacar. Conta desativada.");
        } else if (this.getSaldo() < v){
            System.out.println("Impossível sacar. Saldo insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta de " + this.getDono() + ".");
            
        }
    }
    
    public void pagarMensal(double v){
        if (this.getTipo() == "CC")  {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        
        if (this.status == false){
            System.out.println("Impossível pagar mensalidade. Conta desativada.");
        } else if (this.saldo < v){
            System.out.println("Impossível pagar mensalidade. Conta desativada.");
        } else {
            this.setSaldo(this.getSaldo() - v);
        }
    }
    
    //Métodos especiais
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    //Método Construtor
    
    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
    } 
    
    
}
    

