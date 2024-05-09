import javax.swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Gui {
    private JFrame frame;
    private JPanel panel;
    private GridBagConstraints gbc;
    Gui(){

        frame = MainFrame("Calculator");
        panel = new JPanel();
        gbc = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());

        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label("0"), gbc);
        gbc.gridy = 1;
        
        panel.add(new NumberButtons().getPanel(), gbc);
        gbc.gridx = 1;
        panel.add(new OpButtons().getPanel(), gbc);
        frame.setVisible(true);
        frame.add(panel); 
    }

    private JFrame MainFrame(String name){
        JFrame frame = new JFrame();
        frame.setTitle(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        
        return frame;
    }

    private JLabel label(String text){
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setSize(new Dimension(600, 150));
        label.setFont(label.getFont().deriveFont(24.0f));
        return label;
    }
}
