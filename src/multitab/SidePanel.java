/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


/**
 *
 * @author great_000
 */
public class SidePanel extends JPanel implements MouseMotionListener{
    
    public JButton home;
    public JButton calcu;
    public JButton tictac;
    public JButton about;
    
    BufferedImage imageLogo= null;
    BufferedImage theAbout = null;
    BufferedImage theTicTac = null;
    BufferedImage theCalcu = null;
    BufferedImage theFb = null;
    BufferedImage theInsta = null;
    BufferedImage theYoutube = null;
    private Color boxColor = new Color(48, 48, 48);
    private Color box1 = boxColor;
    private Color box2 = boxColor;
    private Color box3 = boxColor;
    private Color box4 = boxColor;
    Handler handler;
    Timer timer;
    
    private CenterTabbed center;

    public SidePanel() {
  
        this.setPreferredSize(new Dimension(160,480));
        this.setBackground(new Color(48,48,48));
        
        this.addMouseMotionListener(this);
        this.setLayout(null);

        home = new JButton("HOME");
            home.setBounds(7, 120, 125, 40);
            home.setBorder(null);
            home.setBackground(box1);
            home.setFont(new Font("Agency FB", Font.PLAIN, 25));
            home.setForeground(Color.WHITE);
            home.setFocusable(false);
            home.addMouseMotionListener(this);
           
            
        calcu = new JButton(" Calculator");
            calcu.setBounds(40, 170, 90, 40);
            calcu.setBackground(box2);
            calcu.setBorder(null);
            calcu.setFont(new Font("Agency FB", Font.BOLD, 18));
            calcu.setForeground(Color.WHITE);
            calcu.setFocusable(false);
            calcu. setHorizontalAlignment(SwingConstants.LEFT);
            calcu.addMouseMotionListener(this);
            
        tictac = new JButton(" Tic Tac Toe");
            tictac.setBounds(40, 220, 90, 40);
            tictac.setBackground(box3);
            tictac.setBorder(null);
            tictac.setFont(new Font("Agency FB", Font.BOLD, 16));
            tictac.setForeground(Color.WHITE);
            tictac.setFocusable(false);
            tictac.setHorizontalAlignment(SwingConstants.LEFT);
            tictac.addMouseMotionListener(this);
            this.add(tictac);
         
        about = new JButton(" About");
            about.setBounds(40, 270, 90, 40);
            about.setBackground(box4);
            about.setBorder(null);
            about.setFont(new Font("Agency FB", Font.BOLD, 18));
            about.setForeground(Color.WHITE);
            about.setFocusable(false);
            about.setHorizontalAlignment(SwingConstants.LEFT);
            about.addMouseMotionListener(this);
            this.add(about);
            
            CenterTabbed tab1 = new CenterTabbed();
            handler = new Handler(tab1, home , calcu , tictac,about);
            home.addActionListener(handler);
            calcu.addActionListener(handler);
            this.add(calcu);
            this.add(home);
        
        try{
        imageLogo = ImageIO.read(new File("src\\ImgFiles\\TheLogo.png"));
        theAbout = ImageIO.read(new File("src\\ImgFiles\\Theabout.png"));
        theTicTac = ImageIO.read(new File("src\\ImgFiles\\TheTicTac.png"));
        theFb = ImageIO.read(new File("src\\ImgFiles\\TheFb.png"));
        theCalcu = ImageIO.read(new File("src\\ImgFiles\\TheCalcu.png"));
        theInsta = ImageIO.read(new File("src\\ImgFiles\\TheInsta.png"));
        theYoutube = ImageIO.read(new File("src\\ImgFiles\\TheYoutube.png"));
        }catch(IOException e){
          e.printStackTrace(); 
        }
    }
   
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
       
        g2.drawImage(imageLogo, 30 , 0, null);
        
        g2.setColor(new Color(0, 223, 50));
        g2.drawLine(0, 100, 140, 100);
        g2.drawLine(0, 448, 140, 448);
        
            
        g2.drawImage(theCalcu, 0, 170,null);
        g2.drawImage(theTicTac, 0, 220,null);
        g2.drawImage(theAbout, 0, 270,null);
        
        g2.drawImage(theFb, 5, 450,null);
        g2.drawImage(theInsta, 50, 450,null);
        g2.drawImage(theYoutube, 95, 450,null);
        
    }
    
    

    @Override
    public void mouseDragged(MouseEvent me) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
        if(me.getSource() == home){
            home.setForeground(Color.BLACK);
            home.setBackground(Color.GRAY);
        }else{
           home.setForeground(Color.WHITE); 
           home.setBackground(boxColor);}
        
        if(me.getSource() == calcu){
           calcu.setForeground(Color.BLACK); 
           calcu.setBackground(Color.GRAY);
        }else{
           calcu.setForeground(Color.WHITE);
           calcu.setBackground(boxColor);
        }
        
        if(me.getSource() == tictac){
           tictac.setForeground(Color.BLACK);  
           tictac.setBackground(Color.GRAY);
        }else{
           tictac.setForeground(Color.WHITE); 
           tictac.setBackground(boxColor);}
        
        if(me.getSource() == about){
            about.setForeground(Color.BLACK);  
            about.setBackground(Color.GRAY);
        }else{
           about.setForeground(Color.WHITE); 
           about.setBackground(boxColor);}

    }
}
