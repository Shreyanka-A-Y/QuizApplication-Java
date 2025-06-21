package quizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class score extends JFrame implements ActionListener {

    JButton submit;

    public score(String name, int score) {
        setTitle("Quiz Score");
        setSize(1200, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); // absolute positioning

        // Image display
        URL imgUrl = getClass().getResource("/images/score.png");
        if (imgUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imgUrl);
            Image scaledImage = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
            imageLabel.setBounds(0, 0, 600, 500);
            add(imageLabel);
        } else {
            System.err.println("Image not found at /images/score.png");
        }

        // Score Display
        JLabel heading = new JLabel("Your Score is: " + score);
        heading.setBounds(750, 80, 400, 150);
        heading.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
        heading.setForeground(new Color(100, 100, 150));
        add(heading);

        // Play Again Button
        submit = new JButton("Play Again");
        submit.setBounds(800, 200, 150, 30);
        submit.setBackground(new Color(100, 100, 150));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("SansSerif", Font.PLAIN, 18));
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            setVisible(false);
            new Login(); // return to login screen or home
        }
    }

    public static void main(String[] args) {
        new score("User", 0);
    }
}

