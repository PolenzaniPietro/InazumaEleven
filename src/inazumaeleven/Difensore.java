/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inazumaeleven;

/**
 *
 * @author polenzani.pietro
 */
public class Difensore extends Giocatore {
    private int contrasto;
    private int letturaDifensiva;

    public Difensore(int contrasto, int letturaDifensiva, int resistenza, int fisico, String nome, int spettacolo) {
        super(resistenza, fisico, nome, spettacolo);
        this.contrasto = contrasto;
        this.letturaDifensiva = letturaDifensiva;
    }

    
    
    
}
