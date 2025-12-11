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
    
    public void acquistaGiocatore(Giocatore g){
         giocatori.add(g);
    }
    public void svincolaGiocatore(Giocatore g){
         giocatori.remove(g);
    }
    

    

    public Giocatore checkPortiere(){
        for (Giocatore g : giocatori){
            if(g.ruolo.equals("portiere")){
                return g;
            }
        }
            return null;                  
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
        if(this.checkAttaccante()!=null){
            Attaccante.tira();
        }
                       
    }
    public void parataPortiere(){
        if(this.checkPortiere() != null){
            Portiere.paraTiro();
        }
        
    }
}
