package ejercicio5;

/**
 * 5. Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante
 * aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda
 * será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
 * Componentes gráficos: 
 * Etiquetas.
 * Fichero origen y destino.
 * Botón para ejecutar la acción.
 * Caja de texto con el contenido del fichero destino no editable.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame {

  private JPanel contentPane;
  File fichero;
  File fichero2;
  File fichero3;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio5 frame = new Ejercicio5();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Ejercicio5() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 628, 388);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JTextArea textoResultado = new JTextArea();
    textoResultado.setBounds(38, 123, 526, 205);
    contentPane.add(textoResultado);

    JScrollPane scrollPane = new JScrollPane(textoResultado, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scrollPane.setBounds(38, 123, 526, 205);
    contentPane.add(scrollPane);

    JLabel lblFicheroOrigen1 = new JLabel("FICHERO ORIGEN 1");
    lblFicheroOrigen1.setBounds(38, 13, 142, 25);
    contentPane.add(lblFicheroOrigen1);

    JLabel lblFicheroDestino = new JLabel("FICHERO ORIGEN 2");
    lblFicheroDestino.setBounds(38, 51, 142, 25);
    contentPane.add(lblFicheroDestino);

    JButton btnNewButton_1 = new JButton("FICHERO 1");
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
          fichero = fileChooser.getSelectedFile();

        }
      }
    });
    btnNewButton_1.setBounds(192, 13, 97, 25);
    contentPane.add(btnNewButton_1);

    JButton btnNewButton_2 = new JButton("FICHERO 2");
    btnNewButton_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
          fichero2 = fileChooser.getSelectedFile();
        }
      }
    });
    btnNewButton_2.setBounds(192, 51, 97, 25);
    contentPane.add(btnNewButton_2);

    JLabel lblFicheroDestino_1 = new JLabel("FICHERO DESTINO");
    lblFicheroDestino_1.setBounds(38, 89, 142, 25);
    contentPane.add(lblFicheroDestino_1);

    JButton btnDestino = new JButton("DESTINO");
    btnDestino.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
          fichero3 = fileChooser.getSelectedFile();

        }
      }
    });
    btnDestino.setBounds(192, 89, 97, 25);
    contentPane.add(btnDestino);

    JButton btnNewButton = new JButton("OK");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        try {
          BufferedReader br1 = new BufferedReader(new FileReader(fichero));
          BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
          BufferedReader br3 = new BufferedReader(new FileReader(fichero3));
          BufferedWriter bw = new BufferedWriter(new FileWriter(fichero3));

          String linea1 = "";
          String linea2 = "";

          while ((linea1 != null) || (linea2 != null)) {
            linea1 = br1.readLine();
            linea2 = br2.readLine();

            if (linea1 != null) {
              bw.write(linea1 + "\n");
            }

            if (linea2 != null) {
              bw.write(linea2 + "\n");
            }
          }
          bw.close();
          br1.close();
          br2.close();
          String contenidoFichero3 = "";
          linea1 = "";
          while (linea1 != null) {
            linea1 = br3.readLine();
            if (linea1 != null) {
              contenidoFichero3 += linea1 + "\n";
            }
          }
          textoResultado.append(contenidoFichero3);
          br3.close();

        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "ERROR");
        }
      }
    });
    btnNewButton.setBounds(440, 54, 122, 56);
    contentPane.add(btnNewButton);

  }
}
