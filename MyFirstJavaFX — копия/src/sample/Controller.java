package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {
    public Button plus;
    public Button mult;
    public Button minus;
    public Button division;
    public Button Sqrt;


    public Label label;
    public TextField field1;
    public TextField field2;
    public Pane sqrt;
    public Button fact;
    public Button pow;


    public void startPlus(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);
            label.setText(String.valueOf(first + second));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }

    public void startMult(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);
            label.setText(String.valueOf(first * second));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }

    public void startMinus(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            int first = Integer.parseInt(str1);
            int second = Integer.parseInt(str2);
            label.setText(String.valueOf(first - second));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }

    public void startDivision(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            double first = Integer.parseInt(str1);
            double second = Integer.parseInt(str2);
            label.setText(String.valueOf(first / second));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }

    public void startSqrt(ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            double first = Integer.parseInt(str1);
            label.setText(String.valueOf(Math.sqrt(first)));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }

    public void startFact(ActionEvent actionEvent) {
        String str1 = field1.getText();
        int first = Integer.parseInt(str1);
        int x = 1;
        for (int i = 1; i <= first; i++) {
            x = x * i;
        }
        try {
            label.setText(String.valueOf(x));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }


    public void startPow(ActionEvent actionEvent) {
        String str1 = field1.getText();
        String str2 = field2.getText();
        try {
            double first = Integer.parseInt(str1);
            double second = Integer.parseInt(str2);
            label.setText(String.valueOf(Math.pow(first, second)));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }

    public void startX(ActionEvent actionEvent) {
        String str1 = field1.getText();
        try {
            double first = Integer.parseInt(str1);
            label.setText(String.valueOf(1 / first));
        } catch (NumberFormatException e) {
            label.setText("Укажите числа");
        }
    }
}
