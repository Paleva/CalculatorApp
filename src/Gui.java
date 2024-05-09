import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Gui {
    private JFrame mainFrame;
    private JPanel mainPanel;
    private GridBagConstraints gbc;
    private Calculator calculator;
    private ButtonPanel buttonPanel;
    private CalculatorLabel calculatorLabel;

    Gui(){
        mainFrame = MainFrame("Calculator");
        mainPanel = new JPanel();
        gbc = new GridBagConstraints();
        mainPanel.setLayout(new GridBagLayout());
        calculator = new Calculator();
        buttonPanel = new ButtonPanel(calculator);
        calculatorLabel = new CalculatorLabel("0");

        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(calculatorLabel.getPanel(), gbc);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        mainPanel.add(buttonPanel.getPanel(), gbc);
        mainFrame.setVisible(true);
        mainFrame.add(mainPanel); 
    }

    private JFrame MainFrame(String name){
        JFrame frame = new JFrame();
        frame.setTitle(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setResizable(false);
        return frame;
    }

    
}
