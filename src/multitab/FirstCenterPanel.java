/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author great_000
 */


public class FirstCenterPanel extends JPanel{
    
    private BufferedImage TheHome= null;
    
    public FirstCenterPanel(){
        
        this.setPreferredSize(new Dimension(430,340));
        this.setBackground(new Color(40, 35 ,20 ));
        
        try{
             TheHome = ImageIO.read(new File("src\\ImgFiles\\TheHome.jpg"));
        }catch(IOException e){
            e.printStackTrace(); 
        }
        
    }
    
    @Override
   protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.drawImage(TheHome, -5, -150, null);
        
        g2.setColor(Color.YELLOW);
        g2.setFont(new Font("Agency FB", Font.BOLD, 45));
        g2.drawString("Welcome to the App!", 110 , 70);
    }
}
