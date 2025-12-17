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

    public Attaccante(int potenzaTiro, int precisioneTiro, int resistenza, int fisico, String nome, String ruolo) {
        super(resistenza, fisico, nome, ruolo);
        this.potenzaTiro = potenzaTiro;
        this.precisioneTiro = precisioneTiro;
    }


    



    

    public int tira(){
        int a =0;
        if(this.precisioneTiro>75){
            if(this.potenzaTiro>60){
                a-=5;
            } 
            else if(this.potenzaTiro>80){
                a+=10;
            }
            else {
                a += potenzaTiro;
            }
        }
        else{
            a-=a/2;
        }
        return a;
    }
}
