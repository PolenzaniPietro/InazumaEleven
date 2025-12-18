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
public class Portiere extends Giocatore{
    private int riflessi;
    private int elevazione;

    public Portiere(int riflessi, int elevazione, int resistenza, int fisico, String nome, String ruolo) {
        super(resistenza, fisico, nome, ruolo);
        this.riflessi = riflessi;
        this.elevazione = elevazione;
    }

    public int getRiflessi() {
        return riflessi;
    }

    public void setRiflessi(int riflessi) {
        this.riflessi = riflessi;
    }

    public int getElevazione() {
        return elevazione;
    }

    public void setElevazione(int elevazione) {
        this.elevazione = elevazione;
    }

    
    public int paraTiro(){
        int a=0;
        if(this.riflessi>80){
            
            if(this.elevazione>60){
                a+=30;
            }
            else if(this.elevazione>40){
                a+=10;
            }
        }
        else {
            a+=20;
        }
        return a;
    }

  
 
    
}