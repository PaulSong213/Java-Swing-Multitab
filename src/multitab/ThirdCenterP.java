/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;


import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author great_000
 */

public class ThirdCenterP extends JPanel implements ActionListener{
    
    JPanel ticPanel;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;

    private boolean bntState = true;
    private boolean clicked = false;
    Timer timer;

    public int p1score = 0;
    public int p2score = 0;
    JLabel p1Score;
    JLabel p2Score;
    
    JButton restart;
    Color btnColor;
       
    public ThirdCenterP(){
        this.setPreferredSize(new Dimension(430,340));
        this.setBackground(new Color(3, 7, 30));
        this.setLayout(null);
        
        p1Score = new JLabel();
        p1Score.setFont(new Font("Agency FB", Font.BOLD, 45));
        p1Score.setText(" " + p1score);
        p1Score.setBounds(400, 150, 50 , 50);
        p1Score.setForeground(Color.RED);
        this.add(p1Score);
        
        p2Score = new JLabel();
        p2Score.setFont(new Font("Agency FB", Font.BOLD, 45));
        p2Score.setText(" " + p2score);
        p2Score.setBounds(400, 193, 50 , 50);
        p2Score.setForeground(Color.RED);
        this.add(p2Score);
        
        
        restart = new JButton("Restart");
        restart.setBackground(new Color(55, 6, 23));
        restart.setEnabled(false);
        restart.setBounds(320, 270, 100, 50);
        restart.setFocusable(false);
        restart.addActionListener(this);
        this.add(restart);
        
        ticPanel = new JPanel();
        ticPanel.setBounds(30, 50, 250, 300);
        ticPanel.setBackground(new Color(55, 6, 23));
        ticPanel.setBorder(new LineBorder(new Color(106, 4, 15), 5));
        ticPanel.setLayout(new GridLayout(3, 3, 5, 10));
        this.add(ticPanel);

        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        
        btnColor = new Color(208, 0, 0);
        Font btnFont = new Font("Agency FB", Font.BOLD, 54);
  
        b1.setBackground(btnColor);
        b1.addActionListener(this);
        b1.setFont(btnFont);
   
        b2.setBackground(btnColor);
        b2.addActionListener(this);
        b2.setFont(btnFont);
   
        b3.setBackground(btnColor);
        b3.addActionListener(this);
        b3.setFont(btnFont);
   
        b4.setBackground(btnColor);
        b4.addActionListener(this);
        b4.setFont(btnFont);
   
        b5.setBackground(btnColor);
        b5.addActionListener(this);
        b5.setFont(btnFont);
   
        b6.setBackground(btnColor);
        b6.addActionListener(this);
        b6.setFont(btnFont);
   
        b7.setBackground(btnColor);
        b7.addActionListener(this);
        b7.setFont(btnFont);
   
        b8.setBackground(btnColor);
        b8.addActionListener(this);
        b8.setFont(btnFont);
   
        b9.setBackground(btnColor);
        b9.addActionListener(this);
        b9.setFont(btnFont);
   
        
        ticPanel.add(b1);
        ticPanel.add(b2);
        ticPanel.add(b3);
        ticPanel.add(b4);
        ticPanel.add(b5);
        ticPanel.add(b6);
        ticPanel.add(b7);
        ticPanel.add(b8);
        ticPanel.add(b9);
  
        //timer = new Timer(1000000, this);
        //timer.start();
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       
        Graphics2D g2 = (Graphics2D)g;

        GradientPaint paint = new GradientPaint(300, 200, Color.BLUE, 280 , 100 , Color.RED, true);
        g2.setFont(new Font("Agency FB", Font.BOLD, 55));
        //g2.setColor(Color.yellow);
        g2.setPaint(paint);
        g2.drawString("TIC TAC TOE", 290 , 100);
        g2.setFont(new Font("Agency FB", Font.BOLD, 35));
        g2.drawString("Player 1 :" , 290, 190);
        g2.drawString("Player 2:"  , 290, 235);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Color n = Color.BLUE;
        
        //restart button
        if(e.getSource() == restart){
           
                b1.setEnabled(true);
                b1.setBackground(btnColor);
                b1.setText("");
                
                b2.setEnabled(true);
                b2.setBackground(btnColor);
                b2.setText("");
                
                b3.setEnabled(true);
                b3.setBackground(btnColor);
                b3.setText("");
                
                b4.setEnabled(true);
                b4.setBackground(btnColor);
                b4.setText("");
                
                b5.setEnabled(true);
                b5.setBackground(btnColor);
                b5.setText("");
                
                b6.setEnabled(true);
                b6.setBackground(btnColor);
                b6.setText("");
                
                b7.setEnabled(true);
                b7.setBackground(btnColor);
                b7.setText("");
                
                b8.setEnabled(true);
                b8.setBackground(btnColor);
                b8.setText("");
                
                b9.setEnabled(true);
                b9.setBackground(btnColor);
                b9.setText("");

            restart.setEnabled(false);
            restart.setBorder(new LineBorder(Color.WHITE, 1));
            bntState = true;
            
        }     
        
        
                //button1
        if(e.getSource() == b1){
           
            if(bntState == true){   
            b1.setText("X");
            bntState = false;
        }else if (bntState == false){            
            for(int i = 0; i < 9; i++ ){
            b1.setText("O");}
            bntState = true;
        } 
            b1.setEnabled(false);
            clicked = true;
            if(clicked == true){
                b1.setBackground(n);
                
            }
        }
        
        //button2
        if(e.getSource() == b2){
            if(bntState == true){
            for(int i = 0; i < 9; i++ ){
            b2.setText("X");}
            bntState = false;
        }else if (bntState == false){
            
            b2.setText("O");
            bntState = true;
        }
            
         b2.setEnabled(false);
         clicked = true;
            if(clicked == true){
                b2.setBackground(n);
            }        
        
        }
        
        //button3
        if(e.getSource() == b3){
            if(bntState == true){
            for(int i = 0; i < 9; i++ ){
            b3.setText("X");}
            bntState = false;
        }else if (bntState == false){
            
            b3.setText("O");
            bntState = true;
        }
             
        b3.setEnabled(false);
        clicked = true;
            if(clicked == true){
                b3.setBackground(n);
            }
        }
        
        //button4
        if(e.getSource() == b4){
            if(bntState == true){
            for(int i = 0; i < 9; i++ ){
            b4.setText("X");}
            bntState = false;
        }else if (bntState == false){
            
            b4.setText("O");
            bntState = true;
        }
            
        b4.setEnabled(false);
        clicked = true;
            if(clicked == true){
                b4.setBackground(n);
            }
        
        }
        
        //button5
        if(e.getSource() == b5){
            if(bntState == true){
            
            b5.setText("X");
            bntState = false;
        }else if (bntState == false){
            
            b5.setText("O");
            bntState = true;
        }
         
        b5.setEnabled(false);
        clicked = true;
            if(clicked == true){
                b5.setBackground(n);
            }
        }
        
        //button6
        if(e.getSource() == b6){
            if(bntState == true){
            for(int i = 0; i < 9; i++ ){
            b6.setText("X");}
            bntState = false;
        }else if (bntState == false){
            
            b6.setText("O");
            bntState = true;
        }
            
        b6.setEnabled(false);
        clicked = true;
            if(clicked == true){
                b6.setBackground(n);
            }
        }
        
        //button7
        if(e.getSource() == b7){
            if(bntState == true){
            for(int i = 0; i < 9; i++ ){
            b7.setText("X");}
            bntState = false;
        }else if (bntState == false){
            
            b7.setText("O");
            bntState = true;
        }
        
        b7.setEnabled(false);
        clicked = true;
            if(clicked == true){
                b7.setBackground(n);
            }
        }
        
        //button8
        if(e.getSource() == b8){
            if(bntState == true){
            for(int i = 0; i < 9; i++ ){
            b8.setText("X");}
            bntState = false;
        }else if (bntState == false){
            
            b8.setText("O");
            bntState = true;
        }
        
        b8.setEnabled(false);
        clicked = true;
            if(clicked == true){
                b8.setBackground(n);
            }
            
        }
        
        //button9
        if(e.getSource() == b9){
            if(bntState == true){
            
            b9.setText("X");
            bntState = false;
        }else if (bntState == false){
            b9.setText("O");
            bntState = true;
        }
            
            b9.setEnabled(false);
            clicked = true;
            if(clicked == true){
                b9.setBackground(n);
            }
           
        }
        
        //Tic tac toe logic
        if("X".equals(b1.getText()) & "X".equals(b5.getText()) & "X".equals(b9.getText()) ||
                 "O".equals(b1.getText()) & "O".equals(b5.getText()) & "O".equals(b9.getText())){
            
                 b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
            //score logic
            if("X".equals(b1.getText()) & "X".equals(b5.getText()) & "X".equals(b9.getText()) ){
            p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
           
           b1.setBackground(Color.CYAN);
           b5.setBackground(Color.CYAN);
           b9.setBackground(Color.CYAN);
           b2.setBackground(btnColor);
           b3.setBackground(btnColor);
           b4.setBackground(btnColor);
           b6.setBackground(btnColor);
           b7.setBackground(btnColor);
           b8.setBackground(btnColor);
           
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);
            repaint();
        }
        
         if("X".equals(b3.getText()) & "X".equals(b5.getText()) & "X".equals(b7.getText()) ||
                "O".equals(b3.getText()) & "O".equals(b5.getText()) & "O".equals(b7.getText())){
             //score logic
            if("X".equals(b3.getText()) & "X".equals(b5.getText()) & "X".equals(b7.getText())){
            p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
            
            b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
                 
           b3.setBackground(Color.CYAN);
           b5.setBackground(Color.CYAN);
           b7.setBackground(Color.CYAN);
           b1.setBackground(btnColor);
           b2.setBackground(btnColor);
           b4.setBackground(btnColor);
           b6.setBackground(btnColor);
           b8.setBackground(btnColor);
           b9.setBackground(btnColor);
            
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);
           
            
        }
         
         if("X".equals(b1.getText()) & "X".equals(b4.getText()) & "X".equals(b7.getText()) ||
                "O".equals(b1.getText()) & "O".equals(b4.getText()) & "O".equals(b7.getText())){
             //score logic
            if("X".equals(b1.getText()) & "X".equals(b4.getText()) & "X".equals(b7.getText())){
             p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
            
                 b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
                 
           b1.setBackground(Color.CYAN);
           b4.setBackground(Color.CYAN);
           b7.setBackground(Color.CYAN);
           b2.setBackground(btnColor);
           b3.setBackground(btnColor);
           b5.setBackground(btnColor);
           b6.setBackground(btnColor);
           b9.setBackground(btnColor);
           b8.setBackground(btnColor);
            
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);  
        }
        
        if("X".equals(b2.getText()) & "X".equals(b5.getText()) & "X".equals(b8.getText()) ||
                "O".equals(b2.getText()) & "O".equals(b5.getText()) & "O".equals(b8.getText())){
             //score logic
            if("X".equals(b2.getText()) & "X".equals(b5.getText()) & "X".equals(b8.getText())){
            p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
            
                 b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
                 
           b2.setBackground(Color.CYAN);
           b5.setBackground(Color.CYAN);
           b8.setBackground(Color.CYAN);
           b1.setBackground(btnColor);
           b3.setBackground(btnColor);
           b4.setBackground(btnColor);
           b6.setBackground(btnColor);
           b7.setBackground(btnColor);
           b9.setBackground(btnColor);
            
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);  
        }
       
         if("X".equals(b3.getText()) & "X".equals(b6.getText()) & "X".equals(b9.getText()) ||
                "O".equals(b3.getText()) & "O".equals(b6.getText()) & "O".equals(b9.getText())){
             //score logic
            if("X".equals(b3.getText()) & "X".equals(b6.getText()) & "X".equals(b9.getText())){
            p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
            
                 b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
                 
           b3.setBackground(Color.CYAN);
           b6.setBackground(Color.CYAN);
           b9.setBackground(Color.CYAN);
           b1.setBackground(btnColor);
           b2.setBackground(btnColor);
           b4.setBackground(btnColor);
           b5.setBackground(btnColor);
           b7.setBackground(btnColor);
           b8.setBackground(btnColor);
            
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);  
        }
        
         if("X".equals(b1.getText()) & "X".equals(b2.getText()) & "X".equals(b3.getText()) ||
                "O".equals(b1.getText()) & "O".equals(b2.getText()) & "O".equals(b3.getText())){
             //score logic
            if("X".equals(b1.getText()) & "X".equals(b2.getText()) & "X".equals(b3.getText())){
             p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
            
                 b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
                 
           b1.setBackground(Color.CYAN);
           b2.setBackground(Color.CYAN);
           b3.setBackground(Color.CYAN);
           b4.setBackground(btnColor);
           b5.setBackground(btnColor);
           b6.setBackground(btnColor);
           b7.setBackground(btnColor);
           b8.setBackground(btnColor);
           b9.setBackground(btnColor);
            
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);  
        }
         
         if("X".equals(b4.getText()) & "X".equals(b5.getText()) & "X".equals(b6.getText()) ||
                "O".equals(b4.getText()) & "O".equals(b5.getText()) & "O".equals(b6.getText())){
             //score logic
            if("X".equals(b4.getText()) & "X".equals(b5.getText()) & "X".equals(b6.getText())){
            p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
            
                 b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
                 
           b4.setBackground(Color.CYAN);
           b5.setBackground(Color.CYAN);
           b6.setBackground(Color.CYAN);
           b1.setBackground(btnColor);
           b2.setBackground(btnColor);
           b3.setBackground(btnColor);
           b7.setBackground(btnColor);
           b8.setBackground(btnColor);
           b9.setBackground(btnColor);
            
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);  
        }
         
         if("X".equals(b7.getText()) & "X".equals(b8.getText()) & "X".equals(b9.getText()) ||
                "O".equals(b7.getText()) & "O".equals(b8.getText()) & "O".equals(b9.getText())){
             //score logic
            if("X".equals(b7.getText()) & "X".equals(b8.getText()) & "X".equals(b9.getText())){
             p1score  += 1;
            p1Score.setText(" "+ p1score);
            }else{ p2score += 1;
            p2Score.setText(" "+ p2score);}
            
                 b1.setEnabled(false);            
                 b2.setEnabled(false);            
                 b3.setEnabled(false);            
                 b4.setEnabled(false);            
                 b5.setEnabled(false);            
                 b6.setEnabled(false);            
                 b7.setEnabled(false);            
                 b8.setEnabled(false);            
                 b9.setEnabled(false);
                 
           b7.setBackground(Color.CYAN);
           b8.setBackground(Color.CYAN);
           b9.setBackground(Color.CYAN);
            
            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);  
        } 
         
         if(!b1.isEnabled() & !b2.isEnabled() & !b3.isEnabled() & !b4.isEnabled() & 
         !b5.isEnabled() & !b6.isEnabled() & !b7.isEnabled() & !b8.isEnabled() &!b9.isEnabled()){

            restart.setEnabled(true);
            restart.setBorder(new LineBorder(Color.green, 2, true));
            restart.setForeground(Color.GREEN);
            
        }
         
        /*
        ai logic
        check if O turn
        find blank (not clicked) buttons
        click it
        switch to X turn
        */
        
        if(!bntState){
            if(b5.isEnabled()){
                  b5.doClick();
                  bntState = true;
            }else if(b1.isEnabled()){
                b1.doClick();
                bntState = true;
            }else if (b4.isEnabled()){
                b4.doClick();
                bntState = true;
            }else if (b7.isEnabled()){
                b7.doClick();
                bntState = true;
            }else if (b3.isEnabled()){
                b3.doClick();
                bntState = true;
            }else if (b6.isEnabled()){
                b6.doClick();
                bntState = true;
            }else if (b9.isEnabled()){
                b9.doClick();
                bntState = true;
            }else if (b2.isEnabled()){
                b2.doClick();
                bntState = true;
            }else if (b8.isEnabled()){
                b8.doClick();
                bntState = true;
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
