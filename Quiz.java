package quizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Quiz extends JFrame implements ActionListener {

    private final String[][] questions;
    private final String[] answers;
    private final String[][] userAnswers = new String[10][1];

    private final JLabel qno = new JLabel();
    private final JLabel question = new JLabel();
    private final ButtonGroup btngrp = new ButtonGroup();
    private final JRadioButton opt1 = new JRadioButton();
    private final JRadioButton opt2 = new JRadioButton();
    private final JRadioButton opt3 = new JRadioButton();
    private final JRadioButton opt4 = new JRadioButton();
    private final JButton next = new JButton("Next");
    private final JButton submit = new JButton("Submit");

    private static int count = 0;
    private static int score = 0;
    private static int timer = 15;           // ⏱️ countdown timer per question
    private static int ans_given = 0;

    private final String name;

    public Quiz(String name, String topic) {
        this.name = name;

        QuestionBank bank = switch (topic) {
            case "C" -> new CQuestionBank();
            case "C++" -> new CppQuestionBank();
            case "Python" -> new PythonQuestionBank();
            case "Ruby" -> new RubyQuestionBank();
            case "JavaScript" -> new JavaScriptQuestionBank();
            default -> new JavaQuestionBank();
        };
        questions = bank.getQuestions();
        answers = bank.getAnswers();

        setTitle("Quiz");
        setSize(1200, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        URL imgUrl = getClass().getResource("/images/login.jpg");
        if (imgUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imgUrl);
            Image scaledImage = imageIcon.getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
            imageLabel.setBounds(0, 0, 600, 500);
            add(imageLabel);
        }

        qno.setBounds(620, 80, 300, 30);
        qno.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(qno);

        question.setBounds(640, 80, 600, 30);
        question.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(question);

        setupOption(opt1, 120);
        setupOption(opt2, 160);
        setupOption(opt3, 200);
        setupOption(opt4, 240);

        next.setBounds(640, 300, 100, 30);
        next.addActionListener(this);
        add(next);

        submit.setBounds(750, 300, 100, 30);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        loadQuestion(count);
        setVisible(true);
    }

    private void setupOption(JRadioButton rb, int y) {
        rb.setBounds(620, y, 700, 30);
        rb.setBackground(Color.WHITE);
        rb.setFont(new Font("SansSerif", Font.PLAIN, 14));
        btngrp.add(rb);
        add(rb);
    }

    private void loadQuestion(int index) {
        qno.setText((index + 1) + ".");
        question.setText(questions[index][0]);
        opt1.setText(questions[index][1]);
        opt1.setActionCommand(questions[index][1]);
        opt2.setText(questions[index][2]);
        opt2.setActionCommand(questions[index][2]);
        opt3.setText(questions[index][3]);
        opt3.setActionCommand(questions[index][3]);
        opt4.setText(questions[index][4]);
        opt4.setActionCommand(questions[index][4]);
        btngrp.clearSelection();
        timer = 15; // reset timer each question ⏱️
        repaint();  // ⏱️ triggers paint
    }

    public void actionPerformed(ActionEvent ae) {
        ans_given = 1;

        if (btngrp.getSelection() == null) {
            userAnswers[count][0] = "";
        } else {
            userAnswers[count][0] = btngrp.getSelection().getActionCommand();
        }

        if (ae.getSource() == next) {
            count++;
            if (count == 9) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            loadQuestion(count);
        } else if (ae.getSource() == submit) {
            for (int i = 0; i < userAnswers.length; i++) {
                if (userAnswers[i][0].equals(answers[i])) {
                    score += 10;
                }
            }
            setVisible(false);
            new score(name, score);
        }
    }

    // ⏱️ Timer countdown via repaint
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 16));
        String timeStr = "Time Left: " + timer + " sec";
        if (timer > 0) {
            g.drawString(timeStr, 900, 350);
        } else {
            g.drawString("Time's Up!", 900, 350);
        }

        timer--;  // ⏱️ countdown

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;

            if (btngrp.getSelection() == null) {
                userAnswers[count][0] = "";
            } else {
                userAnswers[count][0] = btngrp.getSelection().getActionCommand();
            }

            if (count == 9) {
                for (int i = 0; i < userAnswers.length; i++) {
                    if (userAnswers[i][0].equals(answers[i])) {
                        score += 10;
                    }
                }
                setVisible(false);
                new score(name, score);
            } else {
                count++;
                if (count == 9) {
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
                loadQuestion(count);
            }
        }
    }

    public static void main(String[] args) {
        new Quiz("User", "Java");
    }
}
