package ejercicio1;

/**
 * 1. Calcular el perí­metro y área de un rectángulo dada su base y su altura.
 * Componentes gráficos: 
 * Etiquetas.
 * Cajas de texto para base y altura.
 * Botón para calcular.
 * Caja de texto resultado.
 * No utilizar asistente.
 */

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AreaRectangulo extends JFrame {
  public AreaRectangulo() {
    super("Calculo de Area Rectangulo");
    setSize(600, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Container cp = getContentPane();
    cp.add(new JLabel("Base :"));
    JTextField base = new JTextField(20);
    cp.add(base);
    cp.add(new JLabel("Altura :"));
    JTextField altura = new JTextField(20);
    cp.add(altura);
    cp.add(new JLabel("Resultado= "));
    JTextField area = new JTextField(20);
    cp.add(area);
    JButton botonArea = new JButton("Calcular Area");
    cp.add(botonArea);
    botonArea.addActionListener(new BotonArea(base, altura, area));
    cp.add(botonArea);
    }

}

