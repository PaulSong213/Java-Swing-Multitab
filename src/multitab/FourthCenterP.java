/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author great_000
 */
public class FourthCenterP extends JPanel implements ActionListener{
    
    JPanel main;
    JLabel createby;
    JButton createBy;
    JButton createDate;
    JButton createInfo;
    Timer timer;
    int x= 400;
    int y = 0;
    int velX = 10;
    int btnSelection = 0;
    public FourthCenterP(){
        this.setPreferredSize(new Dimension(430,340));
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        
        createby = new JLabel("John Paul Songalia", 0);
        //createBy.setBounds(0, 0, 200, 200);
        //createby.setBackground(Color.BLACK);
        

        createBy = new JButton("Created by");
        createBy.setBounds(80, 280, 100, 80);
        createBy.setBackground(new Color(158, 0, 89));
        createBy.setFocusable(false);
        createBy.setForeground(Color.WHITE);
        createBy.setFont(new Font("Arial", Font.BOLD, 12));
        createBy.addActionListener(this);
        this.add(createBy);
        
        createDate = new JButton("Created on");
        createDate.setBounds(200, 280, 100, 80);
        createDate.setBackground(new Color(158, 0, 89));
        createDate.setFocusable(false);
        createDate.setForeground(Color.WHITE);
        createDate.setFont(new Font("Arial", Font.BOLD, 12));
        createDate.addActionListener(this);
        this.add(createDate);
        
        createInfo = new JButton("<html>Programming<br />Information</html>");
        createInfo.setBounds(320, 280, 100, 80);
        createInfo.setBackground(new Color(158, 0, 89));
        createInfo.setFocusable(false);
        createInfo.setForeground(Color.WHITE);
        createInfo.setFont(new Font("Arial", Font.BOLD, 12));
        createInfo.addActionListener(this);
        this.add(createInfo);
        
        timer = new Timer(1, this);
        timer.start();
        
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Color boxColor = new Color(26, 83, 92);
        Font boxFont = new Font("Agency FB", Font.BOLD, 20);
        
        Graphics2D g2 = (Graphics2D)g;
        
        GradientPaint paint = new GradientPaint(500, 500, Color.CYAN, 50 , 50 , Color.PINK, true);
        g2.setColor(boxColor);
        g2.setPaint(paint);
        g2.setFont(new Font("Wide Latin", Font.BOLD, 22));
        g2.drawString("About Us",160 ,100 );
        g2.fillRoundRect(x + 150, y + 30, 200, 200, 30, 30);
        
        g2.fillRoundRect(x + 400, y + 30, 200, 200, 30, 30);
        
        g2.fillRoundRect(x + 650, y + 30, 200, 200, 30, 30);
        
        g2.setColor(Color.BLACK);
        g2.setFont(boxFont);
        g2.drawString("John Paul R. Songalia", x + 183, y + 100);
        g2.drawString("July , 2020", x + 463, y + 100);
        g2.drawString("Created with Java", x + 700 , y + 100);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        if(ae.getSource() == createBy){
           btnSelection = 1;
        }else if(ae.getSource() == createDate){
           btnSelection = 2;
        }else if(ae.getSource() == createInfo){
           btnSelection = 3;
        }
        
        if(btnSelection == 1){
         if(x > 0  ){
                x -= velX;
                repaint();
                
          }else if(x < 0){
                x += velX;
                repaint();
                }
        }else if(btnSelection == 2){
            if(x > -250 ){
                x -= velX;
                repaint();
            }else if(x < -250 ){
                x += velX;
                repaint();
            }
        }else if(btnSelection == 3){
            if(x > -500 ){
                x -= velX;
                repaint();
            }else if(x < -500 ){
                x += velX;
                repaint();
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
