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

    public Centrocampista(int precisionePassaggio, int dribling, int resistenza, int fisico, String nome, String ruolo, int spettacolo, ArrayList<Squadra> squadre) {
        super(resistenza, fisico, nome, ruolo, spettacolo, squadre);
        this.precisionePassaggio = precisionePassaggio;
        this.dribling = dribling;
    }

    

    
    
    
}
