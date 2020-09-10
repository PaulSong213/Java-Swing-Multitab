/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitab;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author great_000
 */
public class exitMinimize extends JPanel implements ActionListener{
    
    
    TheFrame frame;
    MotionPanel motion = new MotionPanel(frame);
    MouseHandler mhandler;
    public JLabel exit;
    private JLabel titleName;
    private JLabel P;
    private String banner1= "''a test ";
    private String banner2= "application''";
    private float xBanner1 = 270;
    private float xBanner2 = 400;
    private float yBanner1 = 45;
    private float yBanner2 = 60;
    private float xVel = 1;
    
    private Timer timer;
    Font notClicked;
    Font clicked;
    
   
   public exitMinimize(){
        timer = new Timer(1, this);
        timer.start();
        
         
        
        //when using null lay out use set bounds to resize and position it
        this.setBounds(0, 0, 510, 103);
        this.setLocation(0, 0);
        this.setLayout(null);
        
        
        
        clicked = new Font("Aharoni Bold", Font.BOLD, 18);
        notClicked = new Font("Aharoni Bold", Font.PLAIN, 18);
        
        exit = new JLabel("X");
        exit.setFont(notClicked);
        exit.setForeground(Color.WHITE);
        exit.setBounds(480, 2, 20, 20);
        exit.addMouseListener(mhandler);
        this.add(exit);
        mhandler = new MouseHandler(frame, exit);
        
        
        P = new JLabel("P");
        P.setFont(new Font("Eras Bold ITC", Font.PLAIN, 75));
        P.setForeground(Color.white);
        P.setBounds(20, 0, 50, 100);
        titleName = new JLabel();
        titleName.setFont(new Font("Eras Bold ITC", Font.PLAIN, 44));
        titleName.setForeground(Color.white);
        titleName.setBounds(60, 10, 300, 100);
        this.add(titleName);
        this.add(P);
        pAdds();
        
       
        
   }
   
   //banner animation
    @Override
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       this.setBackground(new Color (115, 0, 35));
       Graphics2D g2 = (Graphics2D) g;
       if("aul's GUI".equals(titleName.getText())){
           g2.setColor(Color.white);
           g2.setFont(new Font("Colonna MT", Font.PLAIN,24));
           g2.drawString( banner1, xBanner1, yBanner1);
           g2.drawString(banner2, xBanner2, yBanner2);
           
     
       }       
   }
   
   
   
   //Paul's GUI animation
   public void pAdds()  {
        
     Thread th=new Thread(){
            @Override
            public void run (){
                try{
                    for(int a=0;a<=8;a++){
                        Thread.sleep(300);
                        if (a==1){titleName.setText("a");}
                        if (a==2){titleName.setText("au");}
                        if (a==3){titleName.setText("aul");}
                        if (a==4){titleName.setText("aul'");}
                        if (a==5){titleName.setText("aul's");}
                        if (a==6){titleName.setText("aul's G");}
                        if (a==7){titleName.setText("aul's GU");}
                        if (a==8){titleName.setText("aul's GUI");}
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
        };
     th.start();
        
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       if("aul's GUI".equals(titleName.getText())){
           if(xBanner1 < 320){
           xBanner1 += xVel;
           }if(xBanner2 > 350){
           xBanner2 += (-xVel);}
       }
        repaint();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
