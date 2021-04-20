package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame(){
        setTitle("Calculator v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(150, 50, 400, 500);
        setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(6, 3));
        add(bottomPanel, BorderLayout.CENTER);

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputField);
        for (int i = 0; i <= 9; i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jButton.addActionListener(digitButtonActionListener);
            bottomPanel.add(jButton);
        }

        JButton plus = new JButton("+");
        plus.addActionListener(digitButtonActionListener);
        bottomPanel.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(digitButtonActionListener);
        bottomPanel.add(minus);

        JButton multiply = new JButton("*");
        multiply.addActionListener(digitButtonActionListener);
        bottomPanel.add(multiply);

        JButton divide = new JButton("/");
        divide.addActionListener(digitButtonActionListener);
        bottomPanel.add(divide);

        JButton sqrt = new JButton("√");
        sqrt.addActionListener(digitButtonActionListener);
        bottomPanel.add(sqrt);

        JButton clear = new JButton("C");
        ActionListener clearAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        };

        clear.addActionListener(clearAction);
        bottomPanel.add(clear);

        JButton calc = new JButton("=");
        calc.addActionListener(new CalcActionListener(inputField));
        bottomPanel.add(calc);

        JButton na = new JButton("N\\A");
        bottomPanel.add(na);

        setVisible(true);
    }


}
