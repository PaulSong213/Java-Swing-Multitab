/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author great_000
 */
public class MainPanel extends JPanel{
    
    TheFrame frame;
    exitMinimize exit = new exitMinimize();
    CenterTabbed center = new CenterTabbed();
    SidePanel side = new SidePanel();
    
    //Handler handler;
    
    public MainPanel(){
        this.setPreferredSize(new Dimension(430, 480));
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setLayout(null);
        this.setBounds(0, 0, 430, 480);
        this.add(exit);
        //handler = new Handler(center, side.home);
        
        this.add(center);
        
       
    }
    
}
