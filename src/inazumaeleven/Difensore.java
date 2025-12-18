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
public class Difensore extends Giocatore {
    private int contrasto;
    private int letturaDifensiva;

    public Difensore(int contrasto, int letturaDifensiva, int resistenza, int fisico, String nome, String ruolo) {
        super(resistenza, fisico, nome, ruolo);
        this.contrasto = contrasto;
        this.letturaDifensiva = letturaDifensiva;
    }

    public int getContrasto() {
        return contrasto;
    }

    public void setContrasto(int contrasto) {
        this.contrasto = contrasto;
    }

    public int getLetturaDifensiva() {
        return letturaDifensiva;
    }

    public void setLetturaDifensiva(int letturaDifensiva) {
        this.letturaDifensiva = letturaDifensiva;
    }
    
    public int contrasta(){
        int a =0;
        if(contrasto>=80){
            a+=25;
        }
        else if(contrasto>=70){
            a+=10;
        }
        return a;
    }
    
    public int intercettaPalla(){
        int a =0;
        if(letturaDifensiva>=85){
            a+=20;
        }
        else if(letturaDifensiva>=70){
            a+=10;
        }
        else {
            a-=20;
        }
        return a;
    }

}
