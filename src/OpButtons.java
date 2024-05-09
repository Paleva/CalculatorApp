import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

public class OpButtons {
    private JPanel panel = new JPanel();

    private Button division;
    private Button multiplication;
    private Button subtraction;
    private Button addition;
    private Calculator calculator;

    OpButtons(Calculator calculator){
        this.calculator = calculator;

        panel.setLayout(new GridLayout(4, 1, 5, 5));
        panel.setSize(150, 450);

        division = new Button("/", new Dimension(100, 100));
        multiplication = new Button("*", new Dimension(100, 100));
        subtraction = new Button("-", new Dimension(100, 100));
        addition = new Button("+", new Dimension(100, 100));
        
        panel.add(division);
        panel.add(multiplication);
        panel.add(subtraction);
        panel.add(addition);
        addListeners();
    }

    public JPanel getPanel(){
        return panel;
    }

    private void addListeners(){
        division.addActionListener(e -> {
            System.out.println("/");
            calculator.setOperator("/");
        });
        multiplication.addActionListener(e -> {
            System.out.println("*");
            calculator.setOperator("*");
        });
        subtraction.addActionListener(e -> {
            System.out.println("-");
            calculator.setOperator("-");
        });
        addition.addActionListener(e -> {
            System.out.println("+");
            calculator.setOperator("+");
        });
    }
}
