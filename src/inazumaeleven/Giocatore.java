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
public class Giocatore {
    protected int resistenza;
    protected int fisico;
    protected String nome;
    protected String ruolo;

    public Giocatore(int resistenza, int fisico, String nome, String ruolo) {
        this.resistenza = resistenza;
        this.fisico = fisico;
        this.nome = nome;
        this.ruolo = ruolo;
    }

    public void setResistenza(int resistenza) {
        this.resistenza = resistenza;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    

    public int getResistenza() {
        return resistenza;
    }

    public int getFisico() {
        return fisico;
    }

    public String getRuolo() {
        return ruolo;
    }

    
    

    public Giocatore allenamento(){
        this.fisico+=10;
        this.resistenza+=10;
        return this;
    }     
}
