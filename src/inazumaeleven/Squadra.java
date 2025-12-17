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
    public Giocatore checkCentrocampista(){
        for (Giocatore g : giocatori){
            if(g.ruolo.equals("centrocampista")){
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
    public int tiroAttaccante() {
    Giocatore a = this.checkAttaccante();

    if (a instanceof Attaccante) {
        Attaccante attaccante = (Attaccante) a;
         return attaccante.tira();
    }
    return 0;
}

    public int parataPortiere(){
        Giocatore a = this.checkPortiere();
        if( a instanceof Portiere){
            Portiere portiere = (Portiere) a;
            return portiere.paraTiro();
        }
        return 0;
    }
    public int driblingCentrocampista(){
        Giocatore a = this.checkCentrocampista();
        if( a instanceof Centrocampista){
            Centrocampista centrocampista = (Centrocampista) a;
            return centrocampista.scartaAvversario();
        }
        return 0;
    }
}
