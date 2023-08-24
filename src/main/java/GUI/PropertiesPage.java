package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.locks.Condition;

public class PropertiesPage extends JFrame implements ActionListener {

    JButton backButton = new JButton("Back");
    JButton postButton = new JButton("Post");
    JPanel infoHead = new JPanel();
    JLabel infoTitle = new JLabel("Let's sell your Houses and Lands");
    ImageIcon greyGradient = new ImageIcon("D:\\Academics\\Curricular Works\\Semester_04\\IntelliJ\\KeyBay\\src\\main\\java\\greybg.jpg");
    Image resizedGradientImage = greyGradient.getImage().getScaledInstance(625,700,Image.SCALE_SMOOTH);
    ImageIcon resizedGreyGradientIcon = new ImageIcon(resizedGradientImage);
    JLabel backGround = new JLabel(resizedGreyGradientIcon);

    JLabel condition = new JLabel("Condition");
    JRadioButton used = new JRadioButton("Used");
    JRadioButton newed = new JRadioButton("New");


    JLabel typeTitle = new JLabel("Select Type");
    String[] type = {"Houses","Lands","Others"};
    JComboBox selectType = new JComboBox(type);

    JLabel brand = new JLabel("Brand");
    JLabel model = new JLabel("Model");
    JLabel title = new JLabel("Title");
    JLabel description = new JLabel("Description");
    JLabel descriptionInfo = new JLabel("(Provide Adequate Information)");
    JLabel price = new JLabel("Price in LKR");
    JLabel location = new JLabel("Vendor's Location");
    JLabel  details = new JLabel("Contact Details");
    JLabel name = new JLabel("Vendor's Name");
    JLabel mail = new JLabel("Email Address");
    JLabel number = new JLabel("Phone Number");

    JTextField brandField = new JTextField();
    JTextField modelField = new JTextField();
    JTextField titleField = new JTextField();
    JTextField descriptionField = new JTextField();
    JTextField priceField = new JTextField();
    JTextField locationField = new JTextField();
    JTextField nameField = new JTextField();
    JTextField mailField = new JTextField();
    JTextField numberField = new JTextField();


    public PropertiesPage() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(625,700);
        this.setVisible(true);


        backButton.setBounds(15,600,125,40);
        this.add(backButton);
        backButton.addActionListener(this);
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        postButton.setBounds(475,600,125,40);
        this.add(postButton);
        postButton.addActionListener(this);
        postButton.setBorder(BorderFactory.createBevelBorder(0));

        infoTitle.setBounds(20,2,600,50);
        infoTitle.setFont(new Font(null,Font.ITALIC,30));
        infoTitle.setForeground(Color.WHITE);
        this.add(infoTitle);

        infoHead.setBackground(new Color(31, 73, 116));
        infoHead.setBounds(0,0,625,50);
        infoHead.setPreferredSize(new Dimension(625,50));
        this.add(infoHead);

        condition.setBounds(20,50,100,50);
        condition.setFont(new Font(null,Font.PLAIN,17));
        condition.setForeground(Color.BLACK);
        this.add(condition);

        used.setBounds(200,65,60,20);
        used.setBackground(Color.LIGHT_GRAY);
        this.add(used);

        newed.setBounds(400,65,60,20);
        newed.setBackground(Color.LIGHT_GRAY);
        this.add(newed);

        typeTitle.setBounds(20,90,100,50);
        typeTitle.setFont(new Font(null,Font.PLAIN,17));
        typeTitle.setForeground(Color.BLACK);
        this.add(typeTitle);

        selectType.setBounds(200,105,140,25);
        this.add(selectType);

        brand.setBounds(20,130,100,50);
        brand.setFont(new Font(null,Font.PLAIN,17));
        brand.setForeground(Color.BLACK);
        this.add(brand);

        model.setBounds(20,170,100,50);
        model.setFont(new Font(null,Font.PLAIN,17));
        model.setForeground(Color.BLACK);
        this.add(model);

        title.setBounds(20,210,100,50);
        title.setFont(new Font(null,Font.PLAIN,17));
        title.setForeground(Color.BLACK);
        this.add(title);

        description.setBounds(20,250,100,50);
        description.setFont(new Font(null,Font.PLAIN,17));
        description.setForeground(Color.BLACK);
        this.add(description);

        descriptionInfo.setBounds(20,270,200,50);
        descriptionInfo.setFont(new Font(null,Font.ITALIC,12));
        descriptionInfo.setForeground(Color.BLACK);
        this.add(descriptionInfo);

        price.setBounds(20,350,100,50);
        price.setFont(new Font(null,Font.PLAIN,17));
        price.setForeground(Color.BLACK);
        this.add(price);

        location.setBounds(20,390,300,50);
        location.setFont(new Font(null,Font.PLAIN,17));
        location.setForeground(Color.BLACK);
        this.add(location);

        name.setBounds(20,430,300,50);
        name.setFont(new Font(null,Font.PLAIN,17));
        name.setForeground(Color.BLACK);
        this.add(name);

        mail.setBounds(20,470,300,50);
        mail.setFont(new Font(null,Font.PLAIN,17));
        mail.setForeground(Color.BLACK);
        this.add(mail);

        number.setBounds(20,510,300,50);
        number.setFont(new Font(null,Font.PLAIN,17));
        number.setForeground(Color.BLACK);
        this.add(number);

        brandField.setBounds(200,145,350,25);
        this.add(brandField);

        modelField.setBounds(200,185,350,25);
        this.add(modelField);

        titleField.setBounds(200,225,350,25);
        this.add(titleField);

        descriptionField.setBounds(200,265,350,75);
        this.add(descriptionField);

        priceField.setBounds(200,365,350,25);
        this.add(priceField);

        locationField.setBounds(200,405,350,25);
        this.add(locationField);

        nameField.setBounds(200,445,350,25);
        this.add(nameField);

        mailField.setBounds(200,485,350,25);
        this.add(mailField);

        numberField.setBounds(200,525,350,25);
        this.add(numberField);





        backGround.setBounds(0,0,625,700);
        backGround.setPreferredSize(new Dimension(625,700));
        this.add(backGround);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton){
            this.dispose();
            SellPage property = new SellPage();
            System.out.println("Back Button Pressed!!");
        } else if (e.getSource() == postButton){
            this.dispose();
            AddPostedProperties property = new AddPostedProperties();
            System.out.println("Post Button Pressed!!");
        }



    }
}
