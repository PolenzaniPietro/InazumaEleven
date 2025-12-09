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

    public RoyaleAccademy(int scorrettezza, boolean rayDark, ArrayList<Giocatore> giocatori) {
        super(giocatori);
        this.scorrettezza = scorrettezza;
        this.rayDark = rayDark;
    }

   

   

    public int giocaSporco(boolean rayDark){
        int a =0;
        this.rayDark=rayDark;
        if(rayDark){
            scorrettezza+=scorrettezza;
        }
        else {
            scorrettezza-=10;
        }
        if(scorrettezza>150){
            a-= this.giocatori.size()*5;
        }
        else if (scorrettezza>80){
            a-= this.giocatori.size();
        }
        else{
            a+=this.giocatori.size();
        }
        return a;
    }
    
    
    
}
