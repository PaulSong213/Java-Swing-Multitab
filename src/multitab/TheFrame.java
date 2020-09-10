/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.Dimension;
import java.awt.*;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author great_000
 */
public class TheFrame extends JFrame {
   
    MainPanel Main = new MainPanel();
    SidePanel side = new SidePanel(); 
    Handler handler;
    
    GridBagConstraints gbc = new GridBagConstraints();
    MouseHandler mhandler;
    JPanel panel = new MotionPanel(this);
    MotionPanel motion = new MotionPanel(this);
    
    public TheFrame() throws IOException{
        
        this.setMinimumSize(new Dimension(650, 490));
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setLayout(null);
        
      
        side = new SidePanel();
        side.setBounds(0, 0, 140,490);
        Main.setBounds(140, 0, 510, 490);
        motion.setBounds(140, 0, 510, 100);
        
        this.add(side );
        this.add(Main);
        this.add(motion);
        
        handler = new Handler(Main.center, side.home , side.calcu, side.tictac, side.about);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
