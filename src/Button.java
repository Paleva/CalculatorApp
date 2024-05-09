import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Button extends JButton {
    
    Button(String text, Dimension size){
        setText(text);
        setFont(new Font(null, Font.PLAIN, 50));
        setVerticalTextPosition(CENTER);
        setSize(size);
        setPreferredSize(size);
        setBorder(new LineBorder(java.awt.Color.BLACK, 2, true));
    }   
}
