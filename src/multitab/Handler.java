/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author great_000
 */
public class Handler implements ActionListener{
        
    private final JTabbedPane tab1;
    private final JButton home;
    private final JButton calcu;
    private final JButton tictac;
    private final JButton about;
    

    public Handler( final JTabbedPane tab1, final JButton home, final JButton calcu, final JButton tictac,
            final JButton about){
        
        this.tab1 = tab1;
        this.home = home;
        this.calcu = calcu;
        this.tictac = tictac;
        this.about = about;
        home.addActionListener(this);
        calcu.addActionListener(this);
        tictac.addActionListener(this);
        about.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == home){
            tab1.setSelectedIndex(0);
        }else if(ae.getSource() == calcu){
            tab1.setSelectedIndex(1);
        }else if(ae.getSource() == tictac){
            tab1.setSelectedIndex(2);
        }else if(ae.getSource() == about){
            tab1.setSelectedIndex(3);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
