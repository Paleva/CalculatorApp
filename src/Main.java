import javax.swing.SwingUtilities;

//Author: arnas.voitkevicius@stud.mif.vu.lt
class Main{
    public 
    static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Gui();
            }
        });
    }
}