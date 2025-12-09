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
public class Attaccante extends Giocatore{
    private int potenzaTiro;
    private int precisioneTiro;

    public Attaccante(int potenzaTiro, int precisioneTiro, int resistenza, int fisico, String nome, String ruolo, int spettacolo, ArrayList<Squadra> squadre) {
        super(resistenza, fisico, nome, ruolo, spettacolo, squadre);
        this.potenzaTiro = potenzaTiro;
        this.precisioneTiro = precisioneTiro;
    }

    


    public int tira(){
        if(this.precisioneTiro>75){
            if(this.potenzaTiro>60){
                spettacolo-=5;
            } 
            else if(this.potenzaTiro>80){
                spettacolo+=10;
            }
            else {
                spettacolo += potenzaTiro;
            }
        }
        else{
            spettacolo-=spettacolo/2;
        }
        return spettacolo;
    }
}
