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
public class RoyaleAccademy extends Squadra{
    private int scorrettezza;
    private boolean rayDark;

    public RoyaleAccademy(int scorrettezza, boolean rayDark, ArrayList<Giocatore> giocatori, int spettacolo, ArrayList<Squadra> squadre) {
        super(giocatori, spettacolo, squadre);
        this.scorrettezza = scorrettezza;
        this.rayDark = rayDark;
    }

   

    public int giocaSporco(boolean rayDark){
        this.rayDark=rayDark;
        if(rayDark){
            scorrettezza+=scorrettezza;
        }
        else {
            scorrettezza-=10;
        }
        if(scorrettezza>150){
            spettacolo-= this.giocatori.size()*5;
        }
        else if (scorrettezza>80){
            spettacolo-= this.giocatori.size();
        }
        else{
            spettacolo+=this.giocatori.size();
        }
        return spettacolo;
    }
    
    
    
}
