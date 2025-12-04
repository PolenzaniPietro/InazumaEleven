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
public class Raimon extends Squadra{
    private int lvlAmicizia;
    private boolean sconfitta;

    public Raimon(int lvlAmicizia, boolean sconfitta, ArrayList<Giocatore> giocatori, int spettacolo, ArrayList<Squadra> squadre) {
        super(giocatori, spettacolo, squadre);
        this.lvlAmicizia = lvlAmicizia;
        this.sconfitta = sconfitta;
    }

 

    

    public int amicizia(boolean sconfitta,int lvlAmicizia) {
        this.sconfitta=sconfitta;
        this.lvlAmicizia=lvlAmicizia;
        if(sconfitta){
            if(lvlAmicizia>75){
                this.spettacolo+=this.giocatori.size()*2;
            }
           
        }
        else if(lvlAmicizia>75){
                this.spettacolo+=this.giocatori.size();
            }
        return spettacolo;
    
    }
    
    
}
