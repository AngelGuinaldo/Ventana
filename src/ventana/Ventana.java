
package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame {
    public Ventana(){
        setSize(500,500);
        setTitle("Titulo");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
       JPanel panel = new JPanel();
       panel.setBackground(Color.green);
       this.getContentPane().add(panel);
    }
    
}
