package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPostedHouseHolds extends JFrame implements ActionListener {

    JButton backButton = new JButton("Back to Home");
    JButton backButtonSell = new JButton("Back to Sell");
    JPanel infoHead = new JPanel();
    JLabel okTitle = new JLabel("Your Advertisement was placed Successfully!");
    JLabel thankTitle = new JLabel("Thank You for Choosing KeyBay.");
    JLabel keyTitle = new JLabel("KeyBay - Your Online Marketplace for Key Deals!");
    ImageIcon greyGradient = new ImageIcon("D:\\Academics\\Curricular Works\\Semester_04\\IntelliJ\\KeyBay\\src\\main\\java\\greybg.jpg");
    JLabel backGround = new JLabel(greyGradient);

    public AddPostedHouseHolds() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(625,400);
        this.setVisible(true);


        backButton.setBounds(15,250,275,35);
        this.add(backButton);
        backButton.addActionListener(this);

        backButtonSell.setBounds(315,250,275,35);
        this.add(backButtonSell);
        backButtonSell.addActionListener(this);


        backButton.setBorder(BorderFactory.createBevelBorder(0));
        backButtonSell.setBorder(BorderFactory.createBevelBorder(0));

        okTitle.setBounds(40,2,600,50);
        okTitle.setFont(new Font(null,Font.ITALIC,25));
        okTitle.setForeground(Color.WHITE);
        this.add(okTitle);

        thankTitle.setBounds(150,80,600,50);
        thankTitle.setFont(new Font("Segoe UI Semibold",Font.PLAIN,20));
        thankTitle.setForeground(Color.BLACK);
        this.add(thankTitle);

        keyTitle.setBounds(40,150,600,50);
        keyTitle.setFont(new Font("Segoe UI",Font.PLAIN,25));
        keyTitle.setForeground(Color.BLACK);
        this.add(keyTitle);


        infoHead.setBackground(new Color(31, 73, 116));
        infoHead.setBounds(0,0,625,50);
        infoHead.setPreferredSize(new Dimension(625,50));
        this.add(infoHead);

        backGround.setBounds(0,0,625,500);
        backGround.setPreferredSize(new Dimension(625,500));
        this.add(backGround);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == backButton){
            this.dispose();
            SellPage property = new SellPage();
            System.out.println("Back Button Pressed!!");
        } else if (e.getSource() == backButtonSell){
            this.dispose();
            HouseHoldPage property = new HouseHoldPage();
            System.out.println("Back Button Pressed!!");
        }

    }
}
