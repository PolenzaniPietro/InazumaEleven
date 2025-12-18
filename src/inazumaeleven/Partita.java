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
     public int passaggio(){
         for( Squadra squadra: squadre){
             spettacolo=squadra.passaggioCentrocampista();
         }
         return spettacolo;
     }
     public int dribla(){
         for( Squadra squadra: squadre){
             spettacolo=squadra.driblingCentrocampista();
         }
         return spettacolo;
     }
     public ArrayList<Squadra> allenamento(){
         for( Squadra squadra: squadre){
             squadra.allenamento();
         }
         return squadre;
     }
     public int contrasta(){
         for( Squadra squadra: squadre){
             spettacolo= squadra.contrasto();
         }
         return spettacolo;
     }
     public int rubaPalla(){
         for( Squadra squadra: squadre){
             spettacolo = squadra.intercetta();
         }
         return spettacolo;
     }
     
}
