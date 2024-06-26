import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

public class NumberButtons {
    
    private JPanel panel = new JPanel();

    private CalculatorLabel calculatorLabel = null;

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_clear;
    private Button button_equals;

    private Calculator calculator;

    NumberButtons(){
        this.calculator = Calculator.getInstance();
        this.calculatorLabel = CalculatorLabel.getInstance("0");

        panel.setLayout(new GridLayout(4, 3, 5, 5));
        panel.setSize(new Dimension(300, 450));
        button_1 = new Button("1", new Dimension(100, 100));
        button_2 = new Button("2", new Dimension(100, 100));
        button_3 = new Button("3", new Dimension(100, 100));
        button_4 = new Button("4", new Dimension(100, 100));
        button_5 = new Button("5", new Dimension(100, 100));
        button_6 = new Button("6", new Dimension(100, 100));
        button_7 = new Button("7", new Dimension(100, 100));
        button_8 = new Button("8", new Dimension(100, 100));
        button_9 = new Button("9", new Dimension(100, 100));
        button_0 = new Button("0", new Dimension(100, 100));
        button_clear = new Button("C", new Dimension(100, 100));
        button_equals = new Button("=", new Dimension(100, 100));
        panel.add(button_7);
        panel.add(button_8);
        panel.add(button_9);
        panel.add(button_4);
        panel.add(button_5);
        panel.add(button_6);
        panel.add(button_1);
        panel.add(button_2);
        panel.add(button_3);
        panel.add(button_0);
        panel.add(button_clear);
        panel.add(button_equals);
        addListeners();
    }

    public JPanel getPanel(){
        return panel;
    }

    private void addListeners(){
        button_0.addActionListener(e -> {
            System.out.println("0");
            calculator.setNumber("0");
            calculatorLabel.appendText("0");
        });
        button_1.addActionListener(e -> {
            System.out.println("1");
            calculator.setNumber("1");
            calculatorLabel.appendText("1");
        });
        button_2.addActionListener(e -> {
            System.out.println("2");
            calculator.setNumber("2");
            calculatorLabel.appendText("2");
        });
        button_3.addActionListener(e -> {
            System.out.println("3");
            calculator.setNumber("3");
            calculatorLabel.appendText("3");
        });
        button_4.addActionListener(e -> {
            System.out.println("4");
            calculator.setNumber("4");
            calculatorLabel.appendText("4");
        });
        button_5.addActionListener(e -> {
            System.out.println("5");
            calculator.setNumber("5");
            calculatorLabel.appendText("5");
        });
        button_6.addActionListener(e -> {
            System.out.println("6");
            calculator.setNumber("6");
            calculatorLabel.appendText("6");
        });
        button_7.addActionListener(e -> {
            System.out.println("7");
            calculator.setNumber("7");
            calculatorLabel.appendText("7");
        });
        button_8.addActionListener(e -> {
            System.out.println("8");
            calculator.setNumber("8");
            calculatorLabel.appendText("8");
        });
        button_9.addActionListener(e -> {
            System.out.println("9");
            calculator.setNumber("9");
            calculatorLabel.appendText("9");
        });
        button_clear.addActionListener(e -> {
            System.out.println("C");
            calculator.clear();
            calculator.clearResult();
            calculatorLabel.setText("0")    ;   
        });
        button_equals.addActionListener(e -> {
            System.out.println("="); 
            System.out.println(calculator.calculate());
            calculatorLabel.setText(Float.toString(calculator.calculate()));  
        });
    } 

}
