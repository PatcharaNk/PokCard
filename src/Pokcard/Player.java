/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokcard;

import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 *
 * @author Harleyhihew
 */
public class Player {

    private final int numCard=3; //จำนวนการ์ดบนมือ
    private Card[] onHand = new Card[3]; //การ์ดที่อยู่บนมือ
    
    private int numhand ; //จำนวนมือ
    private int cash; //เงินสดที่มี
    private int bet;  //เงินเดิมพัน
    
    public Player(){
        cash = 1000;
        bet = 0;
        numhand =1;
    
    }
    
    public void playerCard(CardInDeck deck){
        
        onHand[0] = deck.getCard() ;
        onHand[1] = deck.getCard() ;
        onHand[2] = new Card(0, -1);
    }
    public void addCard(CardInDeck deck){
        onHand[2] = deck.getCard();
    }
    public void clearCard(){
        onHand[0] = null;
        onHand[1] = null;
        onHand[2] = null;
    }
   
    public int rankPoint(){
        //เช็คแต้ม
        int point = 0;
        
        //ไพ่บนมือ2ใบ
        if("null".equals(onHand[2].cardStr())){ 
            //
            if(onHand[0].getRank()<10) point = onHand[0].getRank();
            if(onHand[1].getRank()<10) point += onHand[1].getRank();
            point = point%10;
            
            if(point==9) point = 90; //ป้อก9ใหญ่ 90แต้ม
            if(point==8) point = 80; //ป้อก9ใหญ่ 80แต้ม
           
        }
        //ไพ่บนมือ3ใบ
        if(!"null".equals(onHand[2].cardStr())){
            
            if(onHand[0].getRank()<10) point = onHand[0].getRank();
            if(onHand[1].getRank()<10) point += onHand[1].getRank();
            if(onHand[2].getRank()<10) point += onHand[2].getRank();
                
            point = point%10; 
            
            if(onHand[0].getRank() == onHand[1].getRank() && onHand[0].getRank() == onHand[2].getRank()){
                point = 33; //ไพ่ตองแต้มพิเศษ 33 แต้ม
            }
            if(onHand[0].getRank()>10 && onHand[1].getRank()>10 && onHand[2].getRank()>10 
               && onHand[0].getRank() != onHand[1].getRank() && onHand[0].getRank() != onHand[2].getRank()
               && onHand[1].getRank() != onHand[2].getRank() ){
                point = 13; //ไพ่สามเหลือง JQK แต้มพิเศษ 13 แต้ม
            }
            
            
        }
        return point;
    }    
    public int suitExtraBet(){
        //เช็คการได้เดิมพันจากหน้าไพ่
        int extra = 1;
        
        if("null".equals(onHand[2].cardStr())){ //ไพ่บนมือ2ใบ
         
           if(onHand[0].getSuit()==onHand[1].getSuit() || onHand[0].getRank()==onHand[1].getRank()) 
               extra = 2; //สองเด้ง ได้เดิมพัน2เท่า 
            
        }
        
        if(!"null".equals(onHand[2].cardStr())){ //ไพ่บนมือ3ใบ
            
            if(onHand[0].getSuit()==onHand[1].getSuit() && onHand[0].getSuit()==onHand[2].getSuit()
                    && onHand[1].getSuit()== onHand[2].getSuit())
                extra = 3;//สามเด้ง ได้เดิมพัน3เท่า
            
            if(onHand[0].getRank() == onHand[1].getRank() && onHand[0].getRank() == onHand[2].getRank())
                extra = 5;//ไพ่ตอง ได้เดิมพัน5เท่า
            
            if(onHand[0].getRank()>10 && onHand[1].getRank()>10 && onHand[2].getRank()>10 
               && onHand[0].getRank() != onHand[1].getRank() && onHand[0].getRank() != onHand[2].getRank()
               && onHand[1].getRank() != onHand[2].getRank() ){
                extra = 3; //ไพ่สามเหลือง JQK เดิมพัน3เท่า
            }
            
            //เช็คไพ่เรียง เดิมพัน3เท่า
            int[] sort = new int[3] ;
            int[] QKA = {1,12,13};
            for(int i=0;i<3;i++){
                sort[i] = onHand[i].getRank();
            }
            Arrays.sort(sort);
            if(sort[0]+1 == sort[1] && sort[1]+1 == sort[2]&& Arrays.binarySearch(sort, 1) == -1  ){//ไม่ใช่ K A 2 และ A 2 3
                extra = 3;
            }
            if(sort[0]==QKA[0] && sort[1]==QKA[1] && sort[2]==QKA[2]){
                extra = 3;
            } //Q K A
            
        } 
        return extra;
            
    }
    /*
    public void setCard(){
        onHand[0] = new Card(1,2);
        onHand[1] = new Card(5,2);
        onHand[2] = new Card(3,2);
    }
    */
    public int getHand(){
        return numhand;
    }
    public void setHand(int hand){
        this.numhand = hand;
    }
    
    public int getCash(){
        return cash;
    }
    public void increaseCash(int amount){
        this.cash += amount;
    }
    public void decreaseCash(int amount){
        this.cash -= amount;
    }
    
    public int getBet(){
        return bet;
    }
    public void setBet(int bet){
        this.bet = bet;
        
    }
    
    //ไว้ใส่รูปไพ่
    public String OnHandcard(int index){
        return onHand[index].cardStr();
    }
    
    
    
}

  
