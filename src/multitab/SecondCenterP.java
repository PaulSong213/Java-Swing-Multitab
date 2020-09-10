/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author great_000
 */
public class SecondCenterP extends JPanel implements ActionListener{
 
    

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b10;
    JButton b11;
    JButton b12;
    JButton b13;
    JButton b14;
    JButton b15;
    JButton b16;
    JTextField text; // main text area of numbers
    JPanel btnPanel;
   JLabel textStrore; //storage of previous number in main text area
   
    double num,ans;
    int calculation;
    public SecondCenterP(){
        this.setPreferredSize(new Dimension(430,340));
        //this.setBackground(new Color(11, 12, 23));
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        
        Font btnFont = new Font("Agency FB", Font.BOLD, 35);
        btnPanel = new JPanel();
        
        btnPanel.setLayout(new GridLayout(4, 4, 5, 5));
        btnPanel.setBounds(100, 100, 300, 250);
        btnPanel.setBackground(Color.BLACK);
        this.add(btnPanel);
        
        //text store
        textStrore = new JLabel();
        textStrore.setBounds(320, 10, 80, 20);
        textStrore.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        textStrore.setFont(new Font("Agency FB", Font.PLAIN, 15));
        textStrore.setForeground(Color.RED);
        this.add(textStrore);
        //number field
           text = new JTextField();
           text.setBounds(100, 30, 300, 60);
           text.setBackground(Color.BLACK);
           text.setBorder(new LineBorder(Color.GREEN, 3));
           text.setFont(btnFont);
           text.setForeground(Color.YELLOW);
           text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
          
           this.add(text);
        
        //array button not available
           b1 = new JButton("1");
           b2 = new JButton("2");
           b3 = new JButton("3");
           b4 = new JButton("+");
           b5 = new JButton("4");
           b6 = new JButton("5");
           b7 = new JButton("6");
           b8 = new JButton("-");
           b9 = new JButton("7");
           b10 = new JButton("8");
           b11 = new JButton("9");
           b12 = new JButton("x");
           b13 = new JButton("0");
           b14 = new JButton("del");
           b15 = new JButton("=");
           b16 = new JButton("/");
           
           b1.setBorder(new LineBorder(Color.GREEN, 3));
           b1.setBackground(Color.BLACK);
           b1.setFocusable(false);
           b1.setFont(btnFont);
           b1.setForeground(Color.GREEN);
           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
           b5.addActionListener(this);
           b6.addActionListener(this);
           b7.addActionListener(this);
           b8.addActionListener(this);
           b9.addActionListener(this);
           b10.addActionListener(this);
           b11.addActionListener(this);
           b12.addActionListener(this);
           b13.addActionListener(this);
           b14.addActionListener(this);
           b15.addActionListener(this);
           b16.addActionListener(this);
           
           b2.setBorder(new LineBorder(Color.GREEN, 3));
           b2.setBackground(Color.BLACK);
           b2.setFocusable(false);
           b2.setFont(btnFont);
           b2.setForeground(Color.GREEN);
          
           
           b3.setBorder(new LineBorder(Color.GREEN, 3));
           b3.setBackground(Color.BLACK);
           b3.setFocusable(false);
           b3.setFont(btnFont);
           b3.setForeground(Color.GREEN);
           
           b4.setBorder(new LineBorder(Color.GREEN, 3));
           b4.setBackground(Color.BLACK);
           b4.setFocusable(false);
           b4.setFont(btnFont);
           b4.setForeground(Color.GREEN);
           
           b5.setBorder(new LineBorder(Color.GREEN, 3));
           b5.setBackground(Color.BLACK);
           b5.setFocusable(false);
           b5.setFont(btnFont);
           b5.setForeground(Color.GREEN);
           
           b6.setBorder(new LineBorder(Color.GREEN, 3));
           b6.setBackground(Color.BLACK);
           b6.setFocusable(false);
           b6.setFont(btnFont);
           b6.setForeground(Color.GREEN);
           
           b7.setBorder(new LineBorder(Color.GREEN, 3));
           b7.setBackground(Color.BLACK);
           b7.setFocusable(false);
           b7.setFont(btnFont);
           b7.setForeground(Color.GREEN);
           
           b8.setBorder(new LineBorder(Color.GREEN, 3));
           b8.setBackground(Color.BLACK);
           b8.setFocusable(false);
           b8.setFont(btnFont);
           b8.setForeground(Color.GREEN);
           
           b9.setBorder(new LineBorder(Color.GREEN, 3));
           b9.setBackground(Color.BLACK);
           b9.setFocusable(false);
           b9.setFont(btnFont);
           b9.setForeground(Color.GREEN);
           
           b10.setBorder(new LineBorder(Color.GREEN, 3));
           b10.setBackground(Color.BLACK);
           b10.setFocusable(false);
           b10.setFont(btnFont);
           b10.setForeground(Color.GREEN);
           
           b11.setBorder(new LineBorder(Color.GREEN, 3));
           b11.setBackground(Color.BLACK);
           b11.setFocusable(false);
           b11.setFont(btnFont);
           b11.setForeground(Color.GREEN);
           
           b12.setBorder(new LineBorder(Color.GREEN, 3));
           b12.setBackground(Color.BLACK);
           b12.setFocusable(false);
           b12.setFont(btnFont);
           b12.setForeground(Color.GREEN);
           
           b13.setBorder(new LineBorder(Color.GREEN, 3));
           b13.setBackground(Color.BLACK);
           b13.setFocusable(false);
           b13.setFont(btnFont);
           b13.setForeground(Color.GREEN);
           
           b14.setBorder(new LineBorder(Color.GREEN, 3));
           b14.setBackground(Color.BLACK);
           b14.setFocusable(false);
           b14.setFont(btnFont);
           b14.setForeground(Color.GREEN);
           
           b15.setBorder(new LineBorder(Color.GREEN, 3));
           b15.setBackground(Color.BLACK);
           b15.setFocusable(false);
           b15.setFont(btnFont);
           b15.setForeground(Color.GREEN);
           
           b16.setBorder(new LineBorder(Color.GREEN, 3));
           b16.setBackground(Color.BLACK);
           b16.setFocusable(false);
           b16.setFont(btnFont);
           b16.setForeground(Color.GREEN);

           btnPanel.add(b1);
           btnPanel.add(b2);
           btnPanel.add(b3);
           btnPanel.add(b4);
           btnPanel.add(b5);
           btnPanel.add(b6);
           btnPanel.add(b7);
           btnPanel.add(b8);
           btnPanel.add(b9);
           btnPanel.add(b10);
           btnPanel.add(b11);
           btnPanel.add(b12);
           btnPanel.add(b13);
           btnPanel.add(b14);
           btnPanel.add(b15);
           btnPanel.add(b16);
           
          

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == b1){
            text.setText(text.getText() + "1");
        }else if(ae.getSource() == b2){
              text.setText(text.getText() + "2");
        }else if(ae.getSource() == b3){
              text.setText(text.getText() + "3");
        }else if(ae.getSource() == b4){
             if(!"".equals(text.getText())){
              
               if("".equals(textStrore.getText())){
               num =  Double.parseDouble(text.getText()) ;
               }else{
                   num = num -  Double.parseDouble(text.getText());
               }
               textStrore.setText(textStrore.getText() + text.getText() +"+");
               calculation = 1;
               text.setText("");
            }
        }else if(ae.getSource() == b5){
              text.setText(text.getText() + "4");
        }else if(ae.getSource() == b6){
              text.setText(text.getText() + "5");
        }else if(ae.getSource() == b7){
              text.setText(text.getText() + "6");
        }else if(ae.getSource() == b8){
             if(!"".equals(text.getText())){
               
               if("".equals(textStrore.getText())){
               num =  Double.parseDouble(text.getText()) ;
               }else{
                   num = num -  Double.parseDouble(text.getText());
               }
               textStrore.setText(textStrore.getText() + text.getText() + "-");
               calculation = 2;
               text.setText("");
             }
            
        }else if(ae.getSource() == b9){
              text.setText(text.getText() + "7");
        }else if(ae.getSource() == b10){
              text.setText(text.getText() + "8");
        }else if(ae.getSource() == b11){
              text.setText(text.getText() + "9");
        }else if(ae.getSource() == b12){
            
            if(!"".equals(text.getText())){
               
               if("".equals(textStrore.getText())){
               num =  Double.parseDouble(text.getText()) ;
               }else{
                   num = num *  Double.parseDouble(text.getText());
               }
               textStrore.setText(textStrore.getText() + text.getText() + "x");
               calculation = 3;
               text.setText("");
             }
            
        }else if(ae.getSource() == b13){
              text.setText(text.getText() + "0");
        }else if(ae.getSource() == b14){
               int length = text.getText().length();
            int number = text.getText().length() - 1;
            String store;
            
            if(length > 0){
                StringBuilder back = new StringBuilder(text.getText());
                back.deleteCharAt(number);
                store = back.toString();
                text.setText(store);
                
            }
        }else if(ae.getSource() == b15){
            
            textStrore.setText("");
            arithmetic_operation();
            num = 0;
              
        }else if(ae.getSource() == b16){
             
            if(!"".equals(text.getText())){
               
               if("".equals(textStrore.getText())){
               num =  Double.parseDouble(text.getText()) ;
               }else{
                   num = num /  Double.parseDouble(text.getText());
               }
               textStrore.setText(textStrore.getText() + text.getText() + "/");
               calculation = 4;
               text.setText("");
             }
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public void arithmetic_operation(){
        
        
        switch(calculation){
            case 1: //addtion
                ans = num + Double.parseDouble(this.text.getText());
                this.text.setText(Double.toString(ans));
                break;
            
            case 2: //subtraction
                ans = num - Double.parseDouble(this.text.getText());
                this.text.setText(Double.toString(ans));
                break;
                
            case 3: //multiplication
                ans = num * Double.parseDouble(this.text.getText());
                this.text.setText(Double.toString(ans));
                break;    
                
            case 4: //division
                ans = num / Double.parseDouble(this.text.getText());
                this.text.setText(Double.toString(ans));
                break;    
            
        }
    }
}
