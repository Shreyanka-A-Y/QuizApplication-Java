package quizApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Rules extends JFrame implements ActionListener{

    private JButton start, back;
    private JComboBox<String> topicBox;
    String name;

    public Rules(String username) {
        setTitle("Quiz Rules");
        setSize(1200, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); // Using absolute positioning
        
        URL imgUrl = getClass().getResource("/images/login.jpg");
        if (imgUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imgUrl);
            Image scaledImage = imageIcon.getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
            imageLabel.setBounds(0, 0, 600, 500);
            add(imageLabel);
        }

        JLabel heading = new JLabel("Welcome " + username + " to QuizMe");
        heading.setBounds(620,40,500,30);
        heading.setFont(new Font("Tahoma", Font.ITALIC, 26));
        heading.setForeground(new Color(100, 100, 150));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(640,80,500,130);
        rules.setForeground(new Color(100, 100, 150));
        rules.setFont(new Font("SansSerif", Font.PLAIN, 18));
        rules.setText(
                "<html>" +
                "1. You will have 10 questions.<br>" +
                "2. Each question has 4 options.<br>" +
                "3. Only one is correct.<br>" +
                "4. No negative marking.<br>" +
                "5. Best of luck!" +
                "</html>"
        );
        add(rules);

        // Topic selection label
        JLabel selectTopicLabel = new JLabel("Select Topic:");
        selectTopicLabel.setBounds(700, 250, 100, 30);
        selectTopicLabel.setForeground(new Color(100, 100, 150));
        selectTopicLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(selectTopicLabel);

        // Topic dropdown
        String[] topics = {"Java", "C", "C++", "Python","Ruby","JavaScript"};
        topicBox = new JComboBox<>(topics);
        topicBox.setBounds(820, 250, 200, 30);
        add(topicBox);

        // START Button
        start = new JButton("Start");
        start.setBounds(700, 300, 150, 30);
        start.setBackground(new Color(100, 100, 150));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        // EXIT Button
        back = new JButton("Back");
        back.setBounds(880, 300, 150, 30);
        back.setBackground(new Color(100, 100, 150));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            String selectedTopic = (String) topicBox.getSelectedItem();
            setVisible(false);
            new Quiz(name, selectedTopic); // pass topic
        } else {
            setVisible(false);
            new Login(); // You can define this class or comment it if not needed
        }
    }

   public static void main(String[] args) {
       new Rules("User");
   }
}
