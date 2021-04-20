package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcActionListener implements ActionListener {

    private final JTextField inputField;

    public CalcActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = inputField.getText();
        String[] splittedValues;
        double sum = 0;

        if (text.contains("+")) {
            splittedValues = text.split("\\+");
            sum = Integer.parseInt(splittedValues[0]) + Integer.parseInt(splittedValues[1]);
        } else if (text.contains("-")) {
            splittedValues = text.split("-");
            sum = Integer.parseInt(splittedValues[0]) - Integer.parseInt(splittedValues[1]);
        } else if (text.contains("*")) {
            splittedValues = text.split("\\*");
            sum = Integer.parseInt(splittedValues[0]) * Integer.parseInt(splittedValues[1]);
        } else if (text.contains("/")) {
            splittedValues = text.split("/");
            sum = Double.parseDouble(splittedValues[0]) / Double.parseDouble(splittedValues[1]);
        } else if (text.contains("√")) {
            splittedValues = text.split("√");
            sum = Math.sqrt(Double.parseDouble(splittedValues[1]));
        }

        inputField.setText(String.valueOf(sum));

    }

}
