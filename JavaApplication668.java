/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

/**
 *
 * @author adhmi
 */
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

class MyStore extends JFrame implements ActionListener{
    private static final int frame_width = 800;
    private static final int frame_height = 400;
    private JLabel Lable1,Info;
    private JRadioButton FirstRB, SecRB; 
    ButtonGroup bg ; 
    JTextField t1;
    private JButton Confirm,Cancel;
    JPanel p;
    private Container pane; 

    public MyStore () throws MalformedURLException, IOException{
    setTitle("هنا أكتبي أسمك  ورقم السكشن ");
    setSize(frame_width,frame_height);
    Container contPane = getContentPane();
    p = new JPanel();
    p.setBorder(BorderFactory.createTitledBorder("Buy your phone : ")); 

    Lable1= new JLabel("Please Choose Phone");  
    p.add(Lable1);
    URL url = new URL("https://cdn4.iconfinder.com/data/icons/iphone-5s-5c/256/iPhone-5S-white.png");//غيري الصور والمنتجات أستخدمس صور حجمها صغير 
        Image image = ImageIO.read(url);
        final ImageIcon imageIcon = new ImageIcon(image); 
    URL url2 = new URL("https://styles.redditmedia.com/t5_43btov/styles/communityIcon_0lq84m566wha1.png");
        Image image2 = ImageIO.read(url2);
        final ImageIcon imageIcon2 = new ImageIcon(image2);     
        
FirstRB= new JRadioButton("Iphon",imageIcon);
SecRB = new JRadioButton("Galaxy",imageIcon2); 
bg = new ButtonGroup(); 
bg.add(FirstRB); 
bg.add(SecRB); 
FirstRB.setSelected(true);

p.add(FirstRB);
p.add(SecRB);


Info= new JLabel("Please Enter Your Information (Address) to Confirm The Order: ");  
t1= new JTextField(30);
p.add(Info);
p.add(t1);



Confirm= new JButton("Confirm"); 
Confirm.addActionListener(this); 
Cancel= new JButton("Cancel"); 
Cancel.addActionListener(this); 
JPanel  p2 = new JPanel();
p2.add(Confirm);
p2.add(Cancel);

contPane.add(p,BorderLayout.CENTER);
contPane.add(p2,BorderLayout.SOUTH);


 setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    }

  
public void actionPerformed(ActionEvent e) {
    String y ="";
        if(e.getSource()==Confirm){
            String x =t1.getText();
            t1.setText(" Your Order is Confirm With Address: " +x);
            if(FirstRB.isSelected()){
                 y+=FirstRB.getText();
            JOptionPane.showMessageDialog(null, y + " product purchase confirmed ");}
            else {
              y+=SecRB.getText();
            JOptionPane.showMessageDialog(null, y + " product purchase confirmed ");}
            }
        else {
         t1.setText(" Your Order is Canceled !! ");
        }}

public static void main(String[] args) throws IOException { 
MyStore obj = new MyStore();
    obj.setVisible(true);
    }
}
