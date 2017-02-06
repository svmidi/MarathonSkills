/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Hello World.
 */
package marathonskills2017;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Катя
 */
public class MainScreenMarathonSkills2017 {
public static void main(String[] args) {
        JFrame frame1 = new JFrame("Marathon Skills 2017");
        frame1.setSize(800, 650);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setBackground(new Color (255,255,255));
        frame1.setMaximumSize(new java.awt.Dimension(800, 650));
        frame1.setMinimumSize(new java.awt.Dimension(800, 650));
        frame1.setResizable(false);
        frame1.setLayout(new GridBagLayout());
       
       JPanel panel = new JPanel();
       panel.setBackground(new Color (80,80,80));
      frame1.add(panel, new GridBagConstraints(0,0,1,1,0,1,
               GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,5,0),800,180));
       panel.setLayout(new GridBagLayout());
           
       JLabel label1 = new JLabel("MARATHON SKILLS 2017");
       Font fontLabel1 = new Font("Open Sans Semibold",Font.BOLD,40);
       label1.setFont(fontLabel1);
       label1.setForeground(new Color(255,255,255));
       panel.add(label1, new GridBagConstraints(0,0,1,1,0,1,
               GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(50,0,0,0),10,10));
       
       
       JLabel label2 = new JLabel("Москва, Россия");
       Font font1 = new Font("Open Sans Semibold",Font.ITALIC,18);
       label2.setFont(font1);
       label2.setForeground(Color.WHITE);
       panel.add(label2, new GridBagConstraints(0,1,1,1,0,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
       new Insets(10,0,5,0),0,0));
       
       JLabel label3 = new JLabel("вторник 14 февраля 2017");
       Font font2 = new Font("Open Sans Semibold",Font.ITALIC,18);
       label3.setFont(font2);
       label3.setForeground(Color.WHITE);
       panel.add(label3, new GridBagConstraints(0,2,1,1,0,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
       new Insets(5,0,5,0),0,0));
          
        JButton button1 = new JButton("Я хочу стать бегуном");
        Font fontButton1 = new Font("Open Sans Light",Font.BOLD,18);
        button1.setFont(fontButton1);
        button1.setSize(50, 40);
        frame1.add(button1,new GridBagConstraints(0,2,1,1,0,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
       new Insets(5,200,5,200),30,30));
        button1.setBorder(new RoundedBorder(20));
        button1.setBackground(new Color(235,235,235));
         
        JButton button2 = new JButton("Я хочу стать спонсором бегуна");
        Font fontButton2 = new Font("Open Sans Light",Font.BOLD,18);
        button2.setFont(fontButton2);
        button2.setSize(50, 40);
        frame1.add(button2,new GridBagConstraints(0,3,1,1,0,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
       new Insets(5,200,5,200),30,30));
        button2.setBorder(new RoundedBorder(20));
        button2.setBackground(new Color(235,235,235));
        
        JButton button3 = new JButton("Я хочу узнать больше о событии");
        Font fontButton3 = new Font("Open Sans Light",Font.BOLD,18);
        button3.setFont(fontButton3);
        button3.setSize(50, 40);
        frame1.add(button3,new GridBagConstraints(0,4,1,1,0,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
       new Insets(5,200,5,200),30,30));
        button3.setBorder(new RoundedBorder(20));
        button3.setBackground(new Color(235,235,235));
        
        JButton loginButton = new JButton("Login");
        Font fontLoginButton = new Font("Open Sans Light",Font.BOLD,18);
        loginButton.setFont(fontLoginButton);
        loginButton.setSize(20, 20);
        frame1.add(loginButton,new GridBagConstraints(0,5,1,1,0,1,GridBagConstraints.SOUTHEAST,GridBagConstraints.HORIZONTAL,
       new Insets(5,680,10,20),0,0));
        loginButton.setBorder(new RoundedBorder(10));
        loginButton.setBackground(new Color(235,235,235));
        
       JPanel panel1 = new JPanel();
       panel1.setBackground(new Color (80,80,80));
       frame1.add(panel1, new GridBagConstraints(0,6,1,1,0,1,
               GridBagConstraints.SOUTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),800,50));
       
       JLabel label4 = new JLabel();
       Font font3 = new Font("Open Sans Semibold",Font.ITALIC,18);
       label4.setFont(font3);
       label4.setForeground(Color.WHITE);
       panel1.add(label4, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.SOUTH,GridBagConstraints.HORIZONTAL,
       new Insets(10,10,10,10),0,0));
       Date currentDate = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        //SimpleDateFormat format2 = new SimpleDateFormat("dd День MM Месяц yyyy Год");
        label4.setText(format1.format(currentDate));
       frame1.pack();
    }    
public static class RoundedBorder implements Border {
    private int radius;
    RoundedBorder(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}
}
