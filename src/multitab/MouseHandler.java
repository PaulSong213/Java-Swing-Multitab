/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author great_000
 */
public class MouseHandler implements MouseListener{
    
    JLabel exit;
    JLabel minimize;
    JFrame frame;
    
    public MouseHandler(JFrame frame, JLabel exit){
        this.frame = frame;
        this.exit = exit;
        exit.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource() == exit){
            System.exit(0);
        }
        if(me.getSource() == minimize){
          
            
        }
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if(me.getSource() == exit){
            exit.setForeground(Color.BLACK);
            exit.setFont(new Font("Aharoni Bold", Font.BOLD, 18));
        }
        if(me.getSource() == minimize){
            minimize.setForeground(Color.BLACK);
            minimize.setFont(new Font("Aharoni Bold", Font.BOLD, 54));
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == exit){
            exit.setForeground(Color.yellow);
            exit.setFont(new Font("Aharoni Bold", Font.BOLD, 18));
        }
        if(me.getSource() == minimize){
            minimize.setForeground(Color.yellow);
            minimize.setFont(new Font("Aharoni Bold", Font.BOLD, 54));
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource() == exit){
            exit.setForeground(Color.white);
            exit.setFont(new Font("Aharoni Bold", Font.PLAIN, 18));
        }if(me.getSource() == minimize){
            minimize.setForeground(Color.white);
            minimize.setFont(new Font("Aharoni Bold", Font.PLAIN, 54));
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
