package ejercicio2;

/**
 * 2. Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.
 * Componentes gráficos: 
 * Etiquetas.
 * Cajas de texto para base y altura.
 * Botón para calcular.
 * Caja de texto resultado.
 * No utilizar asistente.F
 */
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
  public Ventana() {
    super("Calculo Distancia entre puntos");
    setSize(600, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Container cp = getContentPane();
    cp.add(new JLabel("x1:"));
    JTextField x1 = new JTextField(10);
    cp.add(x1);
    cp.add(new JLabel("y1:"));
    JTextField y1 = new JTextField(10);
    cp.add(y1);
    cp.add(new JLabel("x2: "));
    JTextField x2 = new JTextField(10);
    cp.add(x2);
    cp.add(new JLabel("y2: "));
    JTextField y2 = new JTextField(10);
    cp.add(y2);
    cp.add(new JLabel("Resultado= "));
    JTextField resultado = new JTextField(10);
    cp.add(resultado);
    JButton boton = new JButton("Calcular");
    cp.add(boton);
    boton.addActionListener(new Boton(x1, y1, x2, y2, resultado));
    cp.add(boton);
  }

}
