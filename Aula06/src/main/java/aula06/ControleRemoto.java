package aula06;

/**
 *
 * @author RYNS
 */
public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
        
        
    }
    
    private int getVolume() {
        return this.volume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    private boolean getTocando() {
        return this.tocando;
    }
    
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("LIGANDO...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("DESLIGANDO...");
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------------------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("VOLUME: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i+=5) {
                System.out.print("|");
            }
            System.out.println();
        System.out.println("-------------------");
        
        
    }

    @Override
    public void fecharMenu() {
        System.out.println();
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
            System.out.print("VOLUME: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i+=5) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("Dispositivo desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
            System.out.print("VOLUME: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i+=5) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("Dispositivo desligado!");
        }
    }

    @Override
    public void ligarMudo() {
        if((this.getLigado()) && (this.getVolume() > 0)) {
            this.setVolume(0);
            System.out.println("VOLUME: 0");
        } else {
            System.out.println("Nâo foi possível ligar mudo...");
        }
    }

    @Override
    public void desligarMudo() {
        if ((this.getLigado()) && (this.getVolume() == 0)) {
            this.setVolume(50);
            System.out.print("VOLUME: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i+=5) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("Nâo foi possível desligar mudo...");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
            System.out.println("TOCANDO...");
        } else {
            System.out.println("Nâo é possível tocar...");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("PAUSADO...");
        } else {
            System.out.println("Nâo é possível pausar...");
        }
    }
}
