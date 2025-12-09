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
public class Zeus extends Squadra{
    private int mlNettare;

    public Zeus(int mlNettare, ArrayList<Giocatore> giocatori) {
        super(giocatori);
        this.mlNettare = mlNettare;
    }

    public int dopati(){
        int a=0;
        if(mlNettare>=80){
            a-=20;
        }
        else if(mlNettare <=50 && mlNettare >10){
            a-=5;
        } 
        else{
            a+=20;
        }
        return a;
    }

   

    
    
    
}
