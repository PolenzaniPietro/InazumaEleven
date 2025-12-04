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

    public Squadra(ArrayList<Giocatore> giocatori, int spettacolo, ArrayList<Squadra> squadre) {
        super(spettacolo, squadre);
        this.giocatori = giocatori;
    }

    

    public boolean checkPortiere(){
        for (Giocatore g : giocatori){
            if(g.ruolo.equals("portiere")){
                return true;
            }
        }
            return false;                  
    } 
    
    public Giocatore checkAttaccante(){
        for (Giocatore g : giocatori){
            if(g.ruolo.equals("attaccante")){
                return g;
            }
        }
            return null;                  
    } 
    public int tiroAttaccante(){
        if(this.checkPortiere()&& this.checkAttaccante()){
            
        }
        return spettacolo;
    }
}
