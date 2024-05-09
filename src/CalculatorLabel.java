import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CalculatorLabel {
    private JLabel label = new JLabel();
    private JPanel panel = new JPanel();
    CalculatorLabel(String text){
        label.setText(text);
        label.setFont(new java.awt.Font(null, java.awt.Font.PLAIN, 50));
        label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label.setBorder(new LineBorder(java.awt.Color.BLACK, 1));
        panel.setPreferredSize(new java.awt.Dimension(600, 150));
        panel.setBorder(new LineBorder(java.awt.Color.BLACK, 1));
        panel.add(label);
    }

    public JPanel getLabel(){
        return panel;
    }
}
