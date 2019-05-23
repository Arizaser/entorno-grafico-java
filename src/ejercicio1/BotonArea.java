package ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotonArea implements ActionListener {
  private JTextField cuadroTexto;
  private JTextField cuadroTexto1;
  private JTextField cuadroTexto2;
  
  public BotonArea(JTextField cuadroTexto, JTextField cuadroTexto1, JTextField area) {
    this.cuadroTexto = cuadroTexto;
    this.cuadroTexto1 = cuadroTexto1;
    this.cuadroTexto2 = area;
  }

  public void actionPerformed(ActionEvent e) {
    int base = Integer.parseInt(cuadroTexto.getText());
    int altura = Integer.parseInt(cuadroTexto1.getText());
    int area = base * altura;
   
    cuadroTexto2.setText(Integer.toString(area));
    
  }
 }
