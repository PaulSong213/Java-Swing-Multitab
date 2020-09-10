/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 *
 * @author great_000
 */
public class CenterTabbed extends JTabbedPane {
    
    FirstCenterPanel first = new FirstCenterPanel();
    SecondCenterP second = new SecondCenterP();
    ThirdCenterP third = new ThirdCenterP();
    FourthCenterP fourth = new FourthCenterP();
    Handler handler;
    SidePanel side;
    
   
    public CenterTabbed() {
        //when using null layout use setBounds
        this.setBounds(-3, 77, 518, 550);
        this.setBackground(Color.MAGENTA);
        this.add(first, "Panel 1");
        this.add(second, "Panel 2");
        this.add(third, "Panel 3");
        this.add(fourth, "Panel 4");
        this.setSelectedIndex(0);
  
    }
 
    

}
