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
public class Squadra {
    protected ArrayList <Giocatore> giocatori;

    public Squadra(ArrayList<Giocatore> giocatori) {
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
    public void tiroAttaccante(){
        this.checkAttaccante();
        if(this.checkPortiere()){
             //implementare il tiro
            }
            
        }
}
