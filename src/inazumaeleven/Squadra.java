/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inazumaeleven;

import java.util.ArrayList;

/**
 *
 * @author polenzani.pietro
 */
public class Squadra extends Partita{
    protected ArrayList <Giocatore> giocatori;

    public Squadra(ArrayList<Giocatore> giocatori, int spettacolo) {
        super(spettacolo);
        this.giocatori = giocatori;
    }

    
    
    
}
