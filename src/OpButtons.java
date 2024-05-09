import javax.swing.JPanel;
import java.awt.GridLayout;

public class OpButtons {
    private JPanel panel = new JPanel();
    OpButtons(){
        panel.setLayout(new GridLayout(4, 1, 5, 5));
        panel.setSize(150, 450);
        panel.add(new Button("+"));
        panel.add(new Button("-"));
        panel.add(new Button("*"));
        panel.add(new Button("/"));
    }

    public JPanel getPanel(){
        return panel;
    }
}
