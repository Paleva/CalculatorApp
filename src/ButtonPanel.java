import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;


public class ButtonPanel extends JPanel {

    private JPanel panel;
    private JPanel buttonPanel;
    private JPanel opPanel;

    ButtonPanel(Calculator calculator){
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        buttonPanel = new NumberButtons(calculator).getPanel();
        opPanel = new OpButtons(calculator).getPanel();
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);
        gbc.weighty = 1;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonPanel, gbc);
        gbc.gridx = 1; 
        panel.add(opPanel, gbc);
        
        
    }

    public JPanel getPanel(){
        return panel;
    }

    
}
