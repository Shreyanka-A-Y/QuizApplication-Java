package quizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Login extends JFrame implements ActionListener{
	JTextField jtf;

    Login() {
        // Set basic properties
        setTitle("Login Screen");
        setSize(1200, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); // Using absolute positioning

        // Load and resize image safely
        URL imgUrl = getClass().getResource("/images/login.jpg");
        if (imgUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imgUrl);
            Image scaledImage = imageIcon.getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            imageLabel.setBounds(0, 0, 600, 500); // Half of the frame width
            add(imageLabel);
        } else {
            System.err.println("Image not found at /images/login.jpg");
        }
        
        JLabel heading = new JLabel("QuizMe");
        heading.setBounds(750,25,300,150);
        heading.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
        heading.setForeground(new Color(100, 100, 150));
        add(heading);
        
        JLabel name = new JLabel("Enter your name : ");
        name.setBounds(750,125,330,100);
        name.setFont(new Font("SansSerif", Font.PLAIN, 24));
        name.setForeground(new Color(100, 100, 150));
        add(name);
        
        jtf = new JTextField();
        jtf.setBounds(750,200,330,30);
        jtf.setFont(new Font("SansSerif", Font.PLAIN, 20));
        jtf.setForeground(new Color(100, 100, 150));
        add(jtf);
        
        JButton rules = new JButton("Rules");
        rules.setBounds(750,250,150,30);
        rules.setBackground(new Color(100, 100, 150));
        rules.setForeground(new Color(255, 255, 255));
        rules.addActionListener(this);
        add(rules);
        
        JButton back = new JButton("Exit");
        back.setBounds(930,250,150,30);
        back.setBackground(new Color(100, 100, 150));
        back.setForeground(new Color(255, 255, 255));
        back.addActionListener(e -> System.exit(0));
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
    	 String name = jtf.getText().trim();
    	    if (name.isEmpty()) {
    	        JOptionPane.showMessageDialog(this, "Please enter your name.");
    	    } else {
    	        new Rules(name); // Open the Rules window and pass the name
    	        setVisible(false); // Hide the Login window
    	    }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}
