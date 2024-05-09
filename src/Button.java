import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Button extends JButton {
    
    Button(String text){
        setText(text);
        setFont(new Font(null, Font.PLAIN, 20));
        setSize(new Dimension(100, 100));
        setBorder(new LineBorder(java.awt.Color.BLACK, 2, true));
    }
}
