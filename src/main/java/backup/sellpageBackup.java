// Start

//import GUI.ElectronicPage;
//import GUI.HouseHoldPage;
//import GUI.PropertiesPage;
//import GUI.VehiclePage;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


//package GUI;
//
//        import javax.swing.*;
//        import java.awt.*;
//        import java.awt.event.ActionEvent;
//        import java.awt.event.ActionListener;
//        import java.awt.geom.Point2D;
//
//public class SellPage extends JFrame implements ActionListener {
//
//    JButton propertiesButton = new JButton("Properties");
//    JButton electronicButton = new JButton("Electronic");
//    JButton vehiclesButton = new JButton("Vehicles");
//    JButton houseHoldButton = new JButton("House-Holds");
//    JLabel welcomeLabel = new JLabel("Welcome User! Let's Post some Ad");
//    JLabel chooseLabel = new JLabel("Choose what you need to sell.");
//    JPanel keyBayHead = new JPanel();
//    JLabel keyBayTitle = new JLabel("KeyBay");
//    ImageIcon gradient = new ImageIcon("D:\\Academics\\Curricular Works\\Semester_04\\IntelliJ\\KeyBay\\src\\main\\java\\Dribbble _ Shot HD.jpg");
//    JLabel backGround = new JLabel(gradient);
//
//    int iconWidth = 60;
//    int iconHeight= 60;
//
//    ImageIcon propertyIcon = new ImageIcon("D:\\Academics\\Curricular Works\\Semester_04\\IntelliJ\\KeyBay\\src\\main\\java\\41870.jpg");
//    ImageIcon electronicIcon = new ImageIcon("D:\\Academics\\Curricular Works\\Semester_04\\IntelliJ\\KeyBay\\src\\main\\java\\4968074.jpg");
//    ImageIcon vehicleIcon = new ImageIcon("D:\\Academics\\Curricular Works\\Semester_04\\IntelliJ\\KeyBay\\src\\main\\java\\205.jpg");
//    ImageIcon houseHoldIcon = new ImageIcon("D:\\Academics\\Curricular Works\\Semester_04\\IntelliJ\\KeyBay\\src\\main\\java\\Living_room_001.jpg");
//
//    Image resizedPropertyImage = propertyIcon.getImage().getScaledInstance(iconWidth,iconHeight,Image.SCALE_SMOOTH);
//    Image resizedElectronicImage = electronicIcon.getImage().getScaledInstance(iconWidth,iconHeight,Image.SCALE_SMOOTH);
//    Image resizedVehicleImage = vehicleIcon.getImage().getScaledInstance(iconWidth,iconHeight,Image.SCALE_SMOOTH);
//    Image resizedHouseHoldImage = houseHoldIcon.getImage().getScaledInstance(iconWidth,iconHeight,Image.SCALE_SMOOTH);
//
//    ImageIcon resizedPropertyIcon = new ImageIcon(resizedPropertyImage);
//    ImageIcon resizedElectronicIcon = new ImageIcon(resizedElectronicImage);
//    ImageIcon resizedVehicleIcon = new ImageIcon(resizedVehicleImage);
//    ImageIcon resizedHouseHoldIcon = new ImageIcon(resizedHouseHoldImage);
//
//
//    public SellPage(){
//
//
//        this.setLayout(null);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(625,400);
//        this.setVisible(true);
//
//        propertiesButton.setBounds(15,200,125,125);
//        electronicButton.setBounds(165,200,125,125);
//        vehiclesButton.setBounds(315,200,125,125);
//        houseHoldButton.setBounds(465,200,125,125);
//
//        this.add(propertiesButton);
//        this.add(electronicButton);
//        this.add(vehiclesButton);
//        this.add(houseHoldButton);
//
//        propertiesButton.addActionListener(this);
//        electronicButton.addActionListener(this);
//        vehiclesButton.addActionListener(this);
//        houseHoldButton.addActionListener(this);
//
//        propertiesButton.setIcon(resizedPropertyIcon);
//        electronicButton.setIcon(resizedElectronicIcon);
//        vehiclesButton.setIcon(resizedVehicleIcon);
//        houseHoldButton.setIcon(resizedHouseHoldIcon);
//
//        propertiesButton.setHorizontalTextPosition(propertiesButton.CENTER);
//        propertiesButton.setVerticalTextPosition(propertiesButton.BOTTOM);
//
//        electronicButton.setHorizontalTextPosition(electronicButton.CENTER);
//        electronicButton.setVerticalTextPosition(electronicButton.BOTTOM);
//
//        vehiclesButton.setHorizontalTextPosition(vehiclesButton.CENTER);
//        vehiclesButton.setVerticalTextPosition(vehiclesButton.BOTTOM);
//
//        houseHoldButton.setHorizontalTextPosition(houseHoldButton.CENTER);
//        houseHoldButton.setVerticalTextPosition(houseHoldButton.BOTTOM);
//
//        propertiesButton.setForeground(Color.BLACK);
//        propertiesButton.setBackground(Color.WHITE);
//        propertiesButton.setBorder(BorderFactory.createBevelBorder(0));
//
//        electronicButton.setForeground(Color.BLACK);
//        electronicButton.setBackground(Color.WHITE);
//        electronicButton.setBorder(BorderFactory.createBevelBorder(0));
//
//        vehiclesButton.setForeground(Color.BLACK);
//        vehiclesButton.setBackground(Color.WHITE);
//        vehiclesButton.setBorder(BorderFactory.createBevelBorder(0));
//
//        houseHoldButton.setForeground(Color.BLACK);
//        houseHoldButton.setBackground(Color.WHITE);
//        houseHoldButton.setBorder(BorderFactory.createBevelBorder(0));
//
//        welcomeLabel.setBounds(60,60,600,50);
//        welcomeLabel.setFont(new Font("Segoe UI Semibold",Font.PLAIN,30));
//        welcomeLabel.setForeground(Color.WHITE);
//        this.add(welcomeLabel);
//
//        chooseLabel.setBounds(10,125,600,30);
//        chooseLabel.setFont(new Font("Segoe UI",Font.PLAIN,22));
//        this.add(chooseLabel);
//
//        keyBayTitle.setBounds(20,2,600,50);
//        keyBayTitle.setFont(new Font(null,Font.ITALIC,30));
//        keyBayTitle.setForeground(Color.WHITE);
//        this.add(keyBayTitle);
//
//        keyBayHead.setBackground(new Color(31, 73, 116));
//        keyBayHead.setBounds(0,0,625,50);
//        keyBayHead.setPreferredSize(new Dimension(625,50));
//        this.add(keyBayHead);
//
//        backGround.setBounds(0,0,625,500);
//        backGround.setPreferredSize(new Dimension(625,500));
//        this.add(backGround);
//
//
//
//    }
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == propertiesButton){
//            this.dispose();
//            PropertiesPage property = new PropertiesPage();
//            System.out.println("Properties Button Pressed!!");
//        } if (e.getSource() == electronicButton){
//            this.dispose();
//            ElectronicPage electronic = new ElectronicPage();
//            System.out.println("Electronic Product Button Pressed!!");
//        } if (e.getSource() == vehiclesButton){
//            this.dispose();
//            VehiclePage vehicle = new VehiclePage();
//            System.out.println("Vehicles Button Pressed!!");
//        } if (e.getSource() == houseHoldButton){
//            this.dispose();
//            HouseHoldPage houseHold = new HouseHoldPage();
//            System.out.println("House-hold Button Pressed!!");
//        }
//
//    }
//
//
//}
