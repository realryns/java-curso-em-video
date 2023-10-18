package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author RYNS
 */
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
       if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
           this.aprovada = true;
           this.desafiado = l1;
           this.desafiante = l2;
       } else {
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
           System.out.println("A luta não pode acontecer...");
       }
    }
    
    public void lutar(){
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1, 2
            switch(vencedor) {
                case 0: //Empate
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Vitória do desafiado
                    System.out.println("VITÓRIA DE " + this.desafiado.getNome() + "!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Vitória do desafiante
                    System.out.println("VITÓRIA DE " + this.desafiante.getNome() + "!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;    
            }
        }
    }
    
    
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
