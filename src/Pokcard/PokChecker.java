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
public class PokChecker {
    private Player master;
    private Player player;
    
 
    public PokChecker(Player master,Player player){
       this.master = master;
       this.player = player;
        
    }
    
    public String checker(Player master,Player player){
        if(player.rankPoint() > master.rankPoint()){ //ชนะ
            
            return "WIN";
        }
        if(player.rankPoint() < master.rankPoint()){ //แพ้
            
            return "LOSS";
        }
        if(player.rankPoint() == master.rankPoint()){ //เสมอ
            
            return "DRAW";
        }
        
        return "error";
    }
 
    
  
  
}
