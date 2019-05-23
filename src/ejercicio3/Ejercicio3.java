package ejercicio3;

/**
 * 3. Pide un DNI y comprueba que es correcto, será correcto si tiene 9 caracteres y la letra es correcta.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

  private JPanel contentPane;
  private JTextField textField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio3 frame = new Ejercicio3();
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
  public Ejercicio3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("DNI");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblNewLabel.setBounds(94, 38, 49, 28);
    contentPane.add(lblNewLabel);

    textField = new JTextField();
    textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
    textField.setBounds(189, 42, 163, 28);
    contentPane.add(textField);
    textField.setColumns(10);

    JButton btnNewButton = new JButton("Comprobar");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        try {
          String arrayLetras[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
              "V", "H", "L", "C", "K", "E" };
          String dni = textField.getText();
          int numerosDni = Integer.parseInt(dni.substring(0, 8));
          String letraDni = dni.substring(8);
          int modDni = numerosDni % 23;
          if (letraDni.equals(arrayLetras[modDni])) {
            JOptionPane.showMessageDialog(null, "DNI válido");
          } else {
            JOptionPane.showMessageDialog(null, "DNI no válido");
          }
        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "DNI no válido");
        }
      }
    });
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
    btnNewButton.setBounds(147, 112, 115, 28);
    contentPane.add(btnNewButton);
  }

}
