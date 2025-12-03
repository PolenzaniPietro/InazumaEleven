/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inazumaeleven;

/**
 *
 * @author polenzani.pietro
 */
public class Attaccante extends Giocatore{
    private int potenzaTiro;
    private int precisioneTiro;

    public Attaccante(int potenzaTiro, int precisioneTiro, int resistenza, int fisico, String nome, int spettacolo) {
        super(resistenza, fisico, nome, spettacolo);
        this.potenzaTiro = potenzaTiro;
        this.precisioneTiro = precisioneTiro;
    }

    
}
