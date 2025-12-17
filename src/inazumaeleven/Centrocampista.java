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
public class Centrocampista extends Giocatore{
    private int precisionePassaggio;
    private int dribling;

    public Centrocampista(int precisionePassaggio, int dribling, int resistenza, int fisico, String nome, String ruolo) {
        super(resistenza, fisico, nome, ruolo);
        this.precisionePassaggio = precisionePassaggio;
        this.dribling = dribling;
    }

    public int scartaAvversario(){
        int a=0;
        if(dribling > 90){
            a+=40;
        }
        else if(dribling > 75){
            a+=20;
        }
        else {
            a-=10;
        }
        return a;
    }

 
}
