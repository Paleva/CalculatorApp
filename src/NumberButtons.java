import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

public class NumberButtons {
    
    private JPanel panel = new JPanel();
    NumberButtons(){
        panel.setLayout(new GridLayout(4, 3, 5, 5));
        panel.setSize(new Dimension(350, 450));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("0"));
    }

    public JPanel getPanel(){
        return panel;
    }

}
