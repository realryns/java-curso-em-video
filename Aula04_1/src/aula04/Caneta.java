package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //Método Construtor
    public Caneta(String m, String c, float p) {

        this.tampar();
        this.cor = c;
        this.ponta = p;
        this.modelo = m;

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("MODELO: " + this.modelo);
        System.out.println("PONTA: " + this.ponta);
        System.out.println("COR: " + this.cor);
        System.out.println("TAMPADA: " + this.tampada);
    }

    public void tampar() {

        this.tampada = true;

    }

    public void destampar() {

        this.tampada = false;

    }

}
