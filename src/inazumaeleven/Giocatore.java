/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inazumaeleven;

/**
 *
 * @author polenzani.pietro
 */
public class Giocatore extends Partita{
    private int resistenza;
    private int fisico;
    private String nome;

    public Giocatore(int resistenza, int fisico, String nome, int spettacolo) {
        super(spettacolo);
        this.resistenza = resistenza;
        this.fisico = fisico;
        this.nome = nome;
    }

    
    
    
}
