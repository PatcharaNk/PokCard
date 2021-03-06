/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokcard;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Harleyhihew
 */
public class GamePlay extends javax.swing.JFrame {

    /**
     * Creates new form GamePlay
     */
    private Player playerhand2 ;
    private Player hand1 = new Player();
    private Player hand3 = new Player();
    
    private Player master = new Player();
    CardInDeck Deck = new CardInDeck();
    
    private int wincount=0;
    private int losscount=0;
    private int drawcount=0;
    private int sumcount=0;
    
    DecimalFormat formatCash = new DecimalFormat("#,###,###,###");
    public GamePlay() {
        
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        losslabel = new javax.swing.JLabel();
        draw = new javax.swing.JLabel();
        loss = new javax.swing.JLabel();
        win = new javax.swing.JLabel();
        drawlabel = new javax.swing.JLabel();
        winlabel = new javax.swing.JLabel();
        handCombo = new javax.swing.JComboBox();
        newButton = new javax.swing.JButton();
        showExtraBet3 = new javax.swing.JLabel();
        showChecker3 = new javax.swing.JLabel();
        showExtraBet2 = new javax.swing.JLabel();
        showChecker2 = new javax.swing.JLabel();
        showExtraBet1 = new javax.swing.JLabel();
        showChecker1 = new javax.swing.JLabel();
        deckImg = new javax.swing.JLabel();
        hand3C3 = new javax.swing.JLabel();
        hand3C2 = new javax.swing.JLabel();
        hand3C1 = new javax.swing.JLabel();
        addCard3 = new javax.swing.JButton();
        hand2C3 = new javax.swing.JLabel();
        hand2C2 = new javax.swing.JLabel();
        hand2C1 = new javax.swing.JLabel();
        addCard2 = new javax.swing.JButton();
        hand1C3 = new javax.swing.JLabel();
        hand1C2 = new javax.swing.JLabel();
        hand1C1 = new javax.swing.JLabel();
        addCard1 = new javax.swing.JButton();
        MasterC1 = new javax.swing.JLabel();
        MasterC2 = new javax.swing.JLabel();
        MasterC3 = new javax.swing.JLabel();
        Bet = new javax.swing.JButton();
        playbutton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        moneyLabel = new javax.swing.JLabel();
        tableBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PokCard");
        setMaximumSize(new java.awt.Dimension(720, 540));
        setMinimumSize(new java.awt.Dimension(720, 540));
        setPreferredSize(new java.awt.Dimension(725, 568));
        setResizable(false);
        getContentPane().setLayout(null);

        losslabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        losslabel.setText("Loss");
        getContentPane().add(losslabel);
        losslabel.setBounds(230, 500, 50, 20);

        draw.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        draw.setText("0");
        getContentPane().add(draw);
        draw.setBounds(270, 520, 40, 14);

        loss.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loss.setText("0");
        getContentPane().add(loss);
        loss.setBounds(230, 520, 40, 14);

        win.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        win.setText("0");
        getContentPane().add(win);
        win.setBounds(190, 520, 40, 14);

        drawlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        drawlabel.setText("Draw");
        getContentPane().add(drawlabel);
        drawlabel.setBounds(270, 500, 50, 20);

        winlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        winlabel.setText("Win");
        getContentPane().add(winlabel);
        winlabel.setBounds(190, 500, 30, 20);

        handCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "One Hand", "Two Hand", "Three Hand" }));
        handCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handComboActionPerformed(evt);
            }
        });
        getContentPane().add(handCombo);
        handCombo.setBounds(310, 460, 100, 30);

        newButton.setText("New Game");
        newButton.setToolTipText("");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newButton);
        newButton.setBounds(73, 503, 90, 30);

        showExtraBet3.setFont(new java.awt.Font("Niagara Solid", 1, 95)); // NOI18N
        showExtraBet3.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(showExtraBet3);
        showExtraBet3.setBounds(530, 380, 110, 80);

        showChecker3.setFont(new java.awt.Font("Niagara Solid", 1, 100)); // NOI18N
        showChecker3.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(showChecker3);
        showChecker3.setBounds(510, 310, 190, 80);

        showExtraBet2.setFont(new java.awt.Font("Niagara Solid", 1, 95)); // NOI18N
        showExtraBet2.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(showExtraBet2);
        showExtraBet2.setBounds(320, 380, 140, 80);

        showChecker2.setFont(new java.awt.Font("Niagara Solid", 1, 100)); // NOI18N
        showChecker2.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(showChecker2);
        showChecker2.setBounds(300, 310, 190, 80);

        showExtraBet1.setFont(new java.awt.Font("Niagara Solid", 1, 95)); // NOI18N
        showExtraBet1.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(showExtraBet1);
        showExtraBet1.setBounds(100, 380, 110, 80);

        showChecker1.setFont(new java.awt.Font("Niagara Solid", 1, 100)); // NOI18N
        showChecker1.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(showChecker1);
        showChecker1.setBounds(80, 310, 190, 80);

        deckImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/deck1.png"))); // NOI18N
        getContentPane().add(deckImg);
        deckImg.setBounds(570, -60, 240, 230);

        hand3C3.setMaximumSize(new java.awt.Dimension(125, 157));
        hand3C3.setMinimumSize(new java.awt.Dimension(125, 157));
        hand3C3.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand3C3);
        hand3C3.setBounds(540, 290, 125, 157);

        hand3C2.setMaximumSize(new java.awt.Dimension(125, 157));
        hand3C2.setMinimumSize(new java.awt.Dimension(125, 157));
        hand3C2.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand3C2);
        hand3C2.setBounds(510, 290, 125, 157);

        hand3C1.setMaximumSize(new java.awt.Dimension(125, 157));
        hand3C1.setMinimumSize(new java.awt.Dimension(125, 157));
        hand3C1.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand3C1);
        hand3C1.setBounds(480, 290, 125, 157);

        addCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/addcard.png"))); // NOI18N
        addCard3.setContentAreaFilled(false);
        addCard3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCard3ActionPerformed(evt);
            }
        });
        getContentPane().add(addCard3);
        addCard3.setBounds(560, 250, 30, 40);
        addCard3.setVisible(false);

        hand2C3.setMaximumSize(new java.awt.Dimension(125, 157));
        hand2C3.setMinimumSize(new java.awt.Dimension(125, 157));
        hand2C3.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand2C3);
        hand2C3.setBounds(330, 290, 125, 157);

        hand2C2.setMaximumSize(new java.awt.Dimension(125, 157));
        hand2C2.setMinimumSize(new java.awt.Dimension(125, 157));
        hand2C2.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand2C2);
        hand2C2.setBounds(300, 290, 125, 157);

        hand2C1.setMaximumSize(new java.awt.Dimension(125, 157));
        hand2C1.setMinimumSize(new java.awt.Dimension(125, 157));
        hand2C1.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand2C1);
        hand2C1.setBounds(270, 290, 125, 157);

        addCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/addcard.png"))); // NOI18N
        addCard2.setContentAreaFilled(false);
        addCard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCard2ActionPerformed(evt);
            }
        });
        getContentPane().add(addCard2);
        addCard2.setBounds(350, 250, 30, 40);
        addCard2.setVisible(false);

        hand1C3.setMaximumSize(new java.awt.Dimension(125, 157));
        hand1C3.setMinimumSize(new java.awt.Dimension(125, 157));
        hand1C3.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand1C3);
        hand1C3.setBounds(110, 290, 125, 157);

        hand1C2.setMaximumSize(new java.awt.Dimension(125, 157));
        hand1C2.setMinimumSize(new java.awt.Dimension(125, 157));
        hand1C2.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand1C2);
        hand1C2.setBounds(80, 290, 125, 157);

        hand1C1.setMaximumSize(new java.awt.Dimension(125, 157));
        hand1C1.setMinimumSize(new java.awt.Dimension(125, 157));
        hand1C1.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(hand1C1);
        hand1C1.setBounds(50, 290, 125, 157);

        addCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/addcard.png"))); // NOI18N
        addCard1.setContentAreaFilled(false);
        addCard1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCard1ActionPerformed(evt);
            }
        });
        getContentPane().add(addCard1);
        addCard1.setBounds(130, 250, 30, 40);
        addCard1.setVisible(false);

        MasterC1.setMaximumSize(new java.awt.Dimension(125, 157));
        MasterC1.setMinimumSize(new java.awt.Dimension(125, 157));
        MasterC1.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(MasterC1);
        MasterC1.setBounds(340, 20, 125, 160);

        MasterC2.setMaximumSize(new java.awt.Dimension(125, 157));
        MasterC2.setMinimumSize(new java.awt.Dimension(125, 157));
        MasterC2.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(MasterC2);
        MasterC2.setBounds(300, 20, 125, 160);

        MasterC3.setMaximumSize(new java.awt.Dimension(125, 157));
        MasterC3.setMinimumSize(new java.awt.Dimension(125, 157));
        MasterC3.setPreferredSize(new java.awt.Dimension(125, 157));
        getContentPane().add(MasterC3);
        MasterC3.setBounds(260, 20, 125, 160);

        Bet.setText("Bet:");
        Bet.setEnabled(false);
        Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetActionPerformed(evt);
            }
        });
        getContentPane().add(Bet);
        Bet.setBounds(610, 500, 100, 30);

        playbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playbutton.setText("PLAY");
        playbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playbutton.setEnabled(false);
        playbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(playbutton);
        playbutton.setBounds(320, 503, 80, 30);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(10, 503, 51, 30);

        moneyLabel.setBackground(new java.awt.Color(0, 0, 0));
        moneyLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        moneyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money (1).png"))); // NOI18N
        moneyLabel.setText("Cash:");
        getContentPane().add(moneyLabel);
        moneyLabel.setBounds(410, 500, 260, 30);

        tableBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tableBG.jpg"))); // NOI18N
        getContentPane().add(tableBG);
        tableBG.setBounds(0, 0, 720, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void newRound(Player player,Player master){
        moneyLabel.setText("Cash: ฿"+formatCash.format(player.getCash()));
        Bet.setText("Bet: ฿"+formatCash.format(player.getBet()));
        Deck.resetDeck();
        //clear gui
        hand1C1.setIcon(null); hand1.clearCard();
        hand1C2.setIcon(null); playerhand2.clearCard();
        hand1C3.setIcon(null); hand3.clearCard();
        hand2C1.setIcon(null);
        hand2C2.setIcon(null);
        hand2C3.setIcon(null);
        hand3C1.setIcon(null);
        hand3C2.setIcon(null);
        hand3C3.setIcon(null);
        MasterC1.setIcon(null);
        MasterC2.setIcon(null);
        MasterC3.setIcon(null);
        showChecker1.setText(null);
        showChecker2.setText(null);
        showChecker3.setText(null);
        showExtraBet1.setText(null);
        showExtraBet2.setText(null);
        showExtraBet3.setText(null);
        
        
    }
    
    private void checkHand(Player hand){
        if(hand.getHand() == 1){
            addCard1.setVisible(false);
            addCard3.setVisible(false);
        }
        if(hand.getHand() == 2){
            addCard2.setVisible(false);
            
        }
               
    }
    private void checkPoint(Player master,Player hand){
        
        PokChecker check = new PokChecker(master, hand) ;
        sumcount++;
        
        if(hand == hand1) showChecker1.setText(check.checker(master, hand));
        if(hand == playerhand2) showChecker2.setText(check.checker(master, hand));
        if(hand == hand3) showChecker3.setText(check.checker(master, hand));
        
            if("win".equalsIgnoreCase(new PokChecker(master, hand).checker(master, hand))){
                wincount++;
                if(hand.suitExtraBet() != 1){
                    if(hand == hand1) showExtraBet1.setText("X"+hand.suitExtraBet());
                    if(hand == playerhand2) showExtraBet2.setText("X"+hand.suitExtraBet());
                    if(hand == hand3) showExtraBet3.setText("X"+hand.suitExtraBet());
                }
                playerhand2.increaseCash(playerhand2.getBet()*hand.suitExtraBet());
            }
            if("loss".equalsIgnoreCase(new PokChecker(master, hand).checker(master, hand))){
                losscount++;
                if(master.suitExtraBet() != 1) {
                    if(hand == hand1) showExtraBet1.setText("X"+master.suitExtraBet());
                    if(hand == playerhand2) showExtraBet2.setText("X"+master.suitExtraBet());
                    if(hand == hand3) showExtraBet3.setText("X"+master.suitExtraBet());
                }
                playerhand2.decreaseCash(playerhand2.getBet()*master.suitExtraBet());
            }
            if("draw".equalsIgnoreCase(new PokChecker(master, hand).checker(master, hand)))
                drawcount++;
    }
    /*
    private int getPercentCount(int count){
        return count*100/sumcount ;
    }
    */
    public ImageIcon imageCard(String card){
        if("A♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_A.png"));
        if("2♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_2.png"));
        if("3♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_3.png"));
        if("4♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_4.png"));
        if("5♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_5.png"));
        if("6♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_6.png"));
        if("7♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_7.png"));
        if("8♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_8.png"));
        if("9♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_9.png"));
        if("10♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_10.png"));
        if("J♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_J.png"));
        if("Q♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_Q.png"));
        if("K♣".equals(card)) return new ImageIcon(getClass().getResource("/img/card_club_K.png"));
        
        
        if("A♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_A.png"));
        if("2♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_2.png"));
        if("3♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_3.png"));
        if("4♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_4.png"));
        if("5♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_5.png"));
        if("6♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_6.png"));
        if("7♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_7.png"));
        if("8♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_8.png"));
        if("9♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_9.png"));
        if("10♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_10.png"));
        if("J♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_J.png"));
        if("Q♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_Q.png"));
        if("K♦".equals(card)) return new ImageIcon(getClass().getResource("/img/card_diamond_K.png"));
        
        if("A♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_A.png"));
        if("2♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_2.png"));
        if("3♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_3.png"));
        if("4♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_4.png"));
        if("5♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_5.png"));
        if("6♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_6.png"));
        if("7♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_7.png"));
        if("8♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_8.png"));
        if("9♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_9.png"));
        if("10♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_10.png"));
        if("J♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_J.png"));
        if("Q♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_Q.png"));
        if("K♥".equals(card)) return new ImageIcon(getClass().getResource("/img/card_heart_K.png"));
        
        if("A♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_A.png"));
        if("1♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_1.png"));
        if("2♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_2.png"));
        if("3♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_3.png"));
        if("4♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_4.png"));
        if("5♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_5.png"));
        if("6♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_6.png"));
        if("7♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_7.png"));
        if("8♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_8.png"));
        if("9♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_9.png"));
        if("10♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_10.png"));
        if("J♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_J.png"));
        if("Q♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_Q.png"));
        if("K♠".equals(card)) return new ImageIcon(getClass().getResource("/img/card_spade_K.png"));
        
        else return null;
    }
    private void playbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbuttonActionPerformed
        // TODO add your handling code here:
        //กด PLAY
        if(playbutton.getText().equals("PLAY")){
            playbutton.setText("DEAL");
            
            if(handCombo.getSelectedItem().toString().equals("One Hand")) playerhand2.setHand(1);
            if(handCombo.getSelectedItem().toString().equals("Two Hand")) playerhand2.setHand(2);
            if(handCombo.getSelectedItem().toString().equals("Three Hand")) playerhand2.setHand(3);
            handCombo.setEnabled(false);
            checkHand(playerhand2);       
            newRound(playerhand2, master);
            
            
            if("One Hand".equals(handCombo.getSelectedItem().toString()) || "Three Hand".equals(handCombo.getSelectedItem().toString()))
                addCard2.setVisible(true);
            if("Two Hand".equals(handCombo.getSelectedItem().toString()) || "Three Hand".equals(handCombo.getSelectedItem().toString())){          
                addCard1.setVisible(true);
                addCard3.setVisible(true);
            }
            
            
            if(playerhand2.getHand() == 1){ //เล่นมือเดียว
                if(playerhand2.getBet() > playerhand2.getCash()) BetActionPerformed(evt); //เดิมพันมากกว่าเงินที่มี
                Bet.setEnabled(false);
                
                playerhand2.playerCard(Deck);                              
                hand2C1.setIcon(imageCard(playerhand2.OnHandcard(0)));
                hand2C2.setIcon(imageCard(playerhand2.OnHandcard(1)));
                
                
            }
            if(playerhand2.getHand() == 2){//เล่น2มือ
                if(playerhand2.getBet()*2 > playerhand2.getCash()) BetActionPerformed(evt); //เดิมพันมากกว่าเงินที่มี
                Bet.setEnabled(false);
                hand1.playerCard(Deck);
                hand1C1.setIcon(imageCard(hand1.OnHandcard(0)));
                hand1C2.setIcon(imageCard(hand1.OnHandcard(1)));
                
                hand3.playerCard(Deck);
                hand3C1.setIcon(imageCard(hand3.OnHandcard(0)));
                hand3C2.setIcon(imageCard(hand3.OnHandcard(1)));
            }
            if(playerhand2.getHand() == 3){//เล่น3มือ
                if(playerhand2.getBet()*3 > playerhand2.getCash()) BetActionPerformed(evt); //เดิมพันมากกว่าเงินที่มี
                Bet.setEnabled(false);
                hand1.playerCard(Deck);
                hand1C1.setIcon(imageCard(hand1.OnHandcard(0)));
                hand1C2.setIcon(imageCard(hand1.OnHandcard(1)));
                
                playerhand2.playerCard(Deck);
                hand2C1.setIcon(imageCard(playerhand2.OnHandcard(0)));
                hand2C2.setIcon(imageCard(playerhand2.OnHandcard(1)));
                
                hand3.playerCard(Deck);
                hand3C1.setIcon(imageCard(hand3.OnHandcard(0)));
                hand3C2.setIcon(imageCard(hand3.OnHandcard(1)));
            }
                     
            master.playerCard(Deck);
            MasterC1.setIcon(new ImageIcon(getClass().getResource("/img/cover.png")));
            MasterC2.setIcon(new ImageIcon(getClass().getResource("/img/cover.png")));
            
            
            
        //กด DEAL    
        }else{
            playbutton.setText("PLAY");
            handCombo.setEnabled(true);
            Bet.setEnabled(true);
            
            addCard1.setVisible(false);
            addCard2.setVisible(false);
            addCard3.setVisible(false);
            if(master.rankPoint()<4 && MasterC3.getIcon()==null){
                master.addCard(Deck);
                MasterC3.setIcon(new ImageIcon(getClass().getResource("/img/cover.png")));
            }
            
            //master.setCard();;
            MasterC1.setIcon(imageCard(master.OnHandcard(0)));
            MasterC2.setIcon(imageCard(master.OnHandcard(1)));
            MasterC3.setIcon(imageCard(master.OnHandcard(2)));
            
            if(playerhand2.getHand() == 1 || playerhand2.getHand() ==3 ) checkPoint(master, playerhand2);
            if(playerhand2.getHand() == 2 || playerhand2.getHand() ==3 ){
                checkPoint(master, hand1);
                checkPoint(master, hand3);
            }
            
            moneyLabel.setText("Cash: ฿"+formatCash.format(playerhand2.getCash()));
            
            if(playerhand2.getCash() <= 0 ) {
                moneyLabel.setText("Cash: ฿"+formatCash.format(playerhand2.getCash()));
                playerhand2 = new Player();
                JOptionPane.showMessageDialog(this, "You're out of money !!");
                playbutton.setEnabled(false);
                Bet.setEnabled(false);
            }
            
            
            win.setText(wincount+"");
            loss.setText(losscount+"");
            draw.setText(drawcount+"");
            
            
            
        }        
        
        
    }//GEN-LAST:event_playbuttonActionPerformed

    private void addCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCard2ActionPerformed
        // TODO add your handling code here:
        if(hand2C3.getIcon() == null){//ขอไพ่เพิ่ม
            addCard2.setVisible(false);
            playerhand2.addCard(Deck);
            hand2C3.setIcon(imageCard(playerhand2.OnHandcard(2)));
        }
        if(master.rankPoint()<4 && MasterC3.getIcon()==null){//เจ้าจับไพ่เพิ่ม
            master.addCard(Deck);
            MasterC3.setIcon(new ImageIcon(getClass().getResource("/img/cover.png")));
        }
        
    }//GEN-LAST:event_addCard2ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetActionPerformed
        // TODO add your handling code here:
        boolean betStr ;
        int num ;
        String inputbet = JOptionPane.showInputDialog( this,"You have cash = ฿"+formatCash.format(playerhand2.getCash())+
                                                            "\nNow you bet "+formatCash.format(playerhand2.getBet())+"฿ per hand."+
                                                            "\nHow much you will bet ( "+handCombo.getSelectedItem().toString()+" ) ?");
        //กดcancel จะเป็นค่าเดิม
        if(inputbet==null && playerhand2.getBet()*playerhand2.getHand() <= playerhand2.getCash() && playerhand2.getBet() != 0) {
            betStr = false; num = playerhand2.getBet();
        }else{
            betStr = true;
            num = 0;
        }
        
        while(betStr){ //เช็คค่าที่รับต้องเป็นตัวเลข และเดิมพันต้องไม่น้อยกว่าcash
           
            try{
                    num = Integer.parseInt(inputbet);
                    if(num*playerhand2.getHand() > playerhand2.getCash() || num < 1)num = Integer.parseInt("oo");
                    
                    
            }catch(NumberFormatException numberFormatException){
                 inputbet = JOptionPane.showInputDialog( this,"You have cash = ฿"+formatCash.format(playerhand2.getCash())+
                                                            "\nNow you bet "+formatCash.format(playerhand2.getBet())+"฿ per hand."+
                                                            "\nPlease input number again !! \nHow much you will bet ( "+handCombo.getSelectedItem().toString()+" ) ?");         
                 //กดcancel จะเป็นค่าเดิม
                 if(inputbet==null && playerhand2.getBet()*playerhand2.getHand() <= playerhand2.getCash() && playerhand2.getBet() != 0) { 
                     betStr = false; num = playerhand2.getBet(); 
                 }
            }
            if(num > 0 && num*playerhand2.getHand() <= playerhand2.getCash() )   
                betStr = false;
            
        }
        
       
        playerhand2.setBet(num);
        Bet.setText("Bet: ฿"+formatCash.format(playerhand2.getBet()));
    }//GEN-LAST:event_BetActionPerformed

    private void addCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCard1ActionPerformed
        // TODO add your handling code here:
        if(hand1C3.getIcon() == null) {
            addCard1.setVisible(false);
            hand1.addCard(Deck);
            hand1C3.setIcon(imageCard(hand1.OnHandcard(2)));
        }
        if(master.rankPoint()<4 && MasterC3.getIcon()==null){//เจ้าจับไพ่เพิ่ม
            master.addCard(Deck);
            MasterC3.setIcon(new ImageIcon(getClass().getResource("/img/cover.png")));
        }
        
                                            
    }//GEN-LAST:event_addCard1ActionPerformed

    private void addCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCard3ActionPerformed
        // TODO add your handling code here:
        if(hand3C3.getIcon() == null){//ขอไพ่เพิ่ม
            addCard3.setVisible(false);
            hand3.addCard(Deck);
            hand3C3.setIcon(imageCard(hand3.OnHandcard(2)));
        }
        if(master.rankPoint()<4 && MasterC3.getIcon()==null){//เจ้าจับไพ่เพิ่ม
            master.addCard(Deck);
            MasterC3.setIcon(new ImageIcon(getClass().getResource("/img/cover.png")));
        }
    }//GEN-LAST:event_addCard3ActionPerformed

    private void handComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_handComboActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
            playbutton.setText("PLAY");
            playbutton.setEnabled(true);
            
            win.setText("0"); wincount=0;
            loss.setText("0"); losscount=0;
            draw.setText("0"); drawcount=0;
            sumcount=0;
            
            addCard1.setVisible(false);
            addCard2.setVisible(false);
            addCard3.setVisible(false);            
            Bet.setEnabled(true);
            handCombo.setEnabled(true);
            playerhand2 = new Player();
            newRound(playerhand2, master);
            BetActionPerformed(evt);
                
    }//GEN-LAST:event_newButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bet;
    private javax.swing.JLabel MasterC1;
    private javax.swing.JLabel MasterC2;
    private javax.swing.JLabel MasterC3;
    private javax.swing.JButton addCard1;
    private javax.swing.JButton addCard2;
    private javax.swing.JButton addCard3;
    private javax.swing.JLabel deckImg;
    private javax.swing.JLabel draw;
    private javax.swing.JLabel drawlabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel hand1C1;
    private javax.swing.JLabel hand1C2;
    private javax.swing.JLabel hand1C3;
    private javax.swing.JLabel hand2C1;
    private javax.swing.JLabel hand2C2;
    private javax.swing.JLabel hand2C3;
    private javax.swing.JLabel hand3C1;
    private javax.swing.JLabel hand3C2;
    private javax.swing.JLabel hand3C3;
    private javax.swing.JComboBox handCombo;
    private javax.swing.JLabel loss;
    private javax.swing.JLabel losslabel;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JButton playbutton;
    private javax.swing.JLabel showChecker1;
    private javax.swing.JLabel showChecker2;
    private javax.swing.JLabel showChecker3;
    private javax.swing.JLabel showExtraBet1;
    private javax.swing.JLabel showExtraBet2;
    private javax.swing.JLabel showExtraBet3;
    private javax.swing.JLabel tableBG;
    private javax.swing.JLabel win;
    private javax.swing.JLabel winlabel;
    // End of variables declaration//GEN-END:variables
}
