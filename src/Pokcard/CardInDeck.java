/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokcard;


import java.util.Random;
/**
 *
 * @author Harleyhihew
 */
public class CardInDeck{
    public Card[] cardinDeck = new Card[52] ;
    public Card[] cardoutDeck = new Card[52];
    private Random rdcard = new Random();
    public CardInDeck(){
        //สร้างไพ่ในสำรับ
        for(int i = 0; i < 52;i++){
           cardinDeck[i] = new Card(i%13+1, i/13);
        //CardInDeck[0-12] "♣" ,[13-25] "♦",[26-38] "♥",[39-51] "♠"
        } 
    }
    public Card getCard(){
        
        Card card = new Card();    
        int i = 1;   
        while(i !=0){
            int numrd = rdcard.nextInt(52);
            if(cardinDeck[numrd] != cardoutDeck[numrd]){
                card = cardinDeck[numrd];
                cardoutDeck[numrd] =cardinDeck[numrd];
                i = 0;   
            }
        }
        return card;
    }
    public void resetDeck(){
        cardoutDeck = new Card[52];
    }
    public String cardString(int i){
        return cardinDeck[i].cardStr();
    }
 
}
