import javax.swing.border.LineBorder;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class CalculatorLabel {

    private JLabel label;
    private JPanel panel;

    private static CalculatorLabel calculatorLabel;
    
    CalculatorLabel(String text){
        label = new JLabel();
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.EAST;
        label.setText(text);
        label.setFont(new java.awt.Font(null, java.awt.Font.PLAIN, 50));
        label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        // label.setBorder(new LineBorder(java.awt.Color.BLACK, 1));
        panel.setPreferredSize(new java.awt.Dimension(600, 150));
        panel.setBorder(new LineBorder(java.awt.Color.BLACK, 1));
        panel.add(label);
    }

    public static CalculatorLabel getInstance(String text){
        if(calculatorLabel == null){
            calculatorLabel = new CalculatorLabel(text);
        }
        return calculatorLabel;
    }

    public void setText(String text){
        label.setText(text);
    }

    public void clearText(){
        label.setText("");
    }

    public String getText(){
        return label.getText();
    }
    
    public void appendText(String text){
        if(label.getText().equals("0")){
            label.setText("");
        }
        label.setText(label.getText() + text);
    }

    public JPanel getPanel(){
        return panel;
    }


}
