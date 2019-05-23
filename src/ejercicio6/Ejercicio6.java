package ejercicio6;

/**
 * 6. Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. 
 * Componentes gráficos: 
 * Etiquetas.
 * Fichero a comprobar.
 * Caja de texto con resultado.
 * Botón calcular.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class Ejercicio6 extends JFrame {

  private JPanel contentPane;
  private JTextField palabraParaContar;
  private JTextField nOcurrencias;
  File fichero;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio6 frame = new Ejercicio6();
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
  public Ejercicio6() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 545, 289);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("FICHERO");
    lblNewLabel.setBounds(48, 33, 101, 26);
    contentPane.add(lblNewLabel);

    JLabel lblPalabra = new JLabel("PALABRA");
    lblPalabra.setBounds(48, 79, 101, 26);
    contentPane.add(lblPalabra);

    palabraParaContar = new JTextField();
    palabraParaContar.setBounds(195, 81, 154, 22);
    contentPane.add(palabraParaContar);
    palabraParaContar.setColumns(10);

    JButton btnNewButton = new JButton("FICHERO");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
          fichero = fileChooser.getSelectedFile();
        }
      }
    });
    btnNewButton.setBounds(195, 34, 154, 25);
    contentPane.add(btnNewButton);

    JLabel lblNOcurrencias = new JLabel("Nº OCURRENCIAS");
    lblNOcurrencias.setBounds(48, 175, 127, 26);
    contentPane.add(lblNOcurrencias);

    nOcurrencias = new JTextField();
    nOcurrencias.setColumns(10);
    nOcurrencias.setBounds(195, 177, 154, 22);
    contentPane.add(nOcurrencias);

    JButton btnNewButton_1 = new JButton("OK");
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          BufferedReader br = new BufferedReader(new FileReader(fichero));
          String palabra = palabraParaContar.getText();
          String linea = "";
          int i = 0;
          int repeticiones = 0;
          
          while ((linea = br.readLine()) != null) {
            
            while ((i = linea.indexOf(palabra)) != -1) {
              linea = linea.substring(i + palabra.length(), linea.length());
              repeticiones++;
            }
          }
          
          br.close();
          
          nOcurrencias.setText(Integer.toString(repeticiones));

        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "ERROR");
        }
      }
    });
    btnNewButton_1.setBounds(397, 33, 106, 70);
    contentPane.add(btnNewButton_1);
  }
}
