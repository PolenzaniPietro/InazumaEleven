/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inazumaeleven;

/**
 *
 * @author polenzani.pietro
 */
public class Portiere extends Giocatore{
    private int riflessi;
    private int elevazione;

    public Portiere(int riflessi, int elevazione, int resistenza, int fisico, String nome, int spettacolo) {
        super(resistenza, fisico, nome, spettacolo);
        this.riflessi = riflessi;
        this.elevazione = elevazione;
    }

  
    
    
}
