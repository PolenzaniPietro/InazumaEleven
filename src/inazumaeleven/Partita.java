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
public class Partita{
    protected int spettacolo;
    protected ArrayList <Squadra> squadre;

    public Partita(int spettacolo, ArrayList<Squadra> squadre) {
        this.spettacolo = spettacolo;
        this.squadre = squadre;
        }
     public int tiro(){
         for( Squadra squadra: squadre){
             spettacolo= squadra.tiroAttaccante();
         }
         return spettacolo;        
     }
     public int parata(){
         for( Squadra squadra: squadre){
             spettacolo= squadra.parataPortiere();
         }
         return spettacolo;   
     }
}
    
    
    
   
    
    
    
