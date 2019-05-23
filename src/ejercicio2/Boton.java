package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Boton implements ActionListener {
  private JTextField cuadroTexto;
  private JTextField cuadroTexto1;
  private JTextField cuadroTexto2;
  private JTextField cuadroTexto3;
  private JTextField cuadroTexto4;
  
  public Boton(JTextField x1, JTextField y1, JTextField x2, JTextField y2, JTextField resultado) {
    this.cuadroTexto = x1;
    this.cuadroTexto1 = y1;
    this.cuadroTexto2 = x2;
    this.cuadroTexto3 = y2;
    this.cuadroTexto4 = resultado;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    int x1 = Integer.parseInt(cuadroTexto.getText());
    int y1 = Integer.parseInt(cuadroTexto1.getText());
    int x2 = Integer.parseInt(cuadroTexto2.getText());
    int y2 = Integer.parseInt(cuadroTexto3.getText());
    int resultado = (int) Math.sqrt(((x1 - y1)*(x1 - y1)) + ((x2 - y2)*(x2 - y2)));
   
    cuadroTexto4.setText(Integer.toString(resultado));
    
  }
}