/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokcard;

/**
 *
 * @author Harleyhihew
 */
import java.util.ArrayList;
import javax.swing.ImageIcon;
public class Card {
    private int rank;
    private int suit;
    public Card(){
        this.rank = 0;
        this.suit = -1;
    }
    public Card(int rank,int suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    public int getRank(){
        return rank;
    }
    
    public int getSuit(){
        return suit;
    }
    
    private final String[] suitStr = {"♣", "♦", "♥","♠"}; //แทนด้วยsuit{0,1,2,3}
    private final String[] rankStr = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; 
    
    public String cardStr(){
        if(getRank()==0 || getSuit()==-1) return "null";
        return rankStr[rank-1]+suitStr[suit];
    }
    
 
}
