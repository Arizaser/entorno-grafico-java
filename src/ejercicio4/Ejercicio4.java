package ejercicio4;

/**
 * 4. Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de forma "ideal"; es decir, con el menor número de billetes y monedas posibles.
 * Componentes gráficos: 
 * Etiquetas.
 * Caja de texto para introducir dinero a cambiar.
 * Cajas de texto para billetes y monedas.
 * Botón para calcular.
 * Opcional: sustituir la etiqueta de cada billete y moneda por su imagen. 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio4 extends JFrame {

  private JPanel contentPane;
  private JTextField cantidad;
  private JTextField billete500;
  private JTextField billete200;
  private JTextField billete100;
  private JTextField billete50;
  private JTextField billete20;
  private JTextField billete10;
  private JTextField billete5;
  private JTextField moneda2;
  private JTextField moneda1;
  private JTextField moneda50;
  private JTextField moneda20;
  private JTextField moneda10;
  private JTextField moneda5;
  private JTextField moneda02;
  private JTextField moneda01;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio4 frame = new Ejercicio4();
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
  public Ejercicio4() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 539, 320);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblNewLabel = new JLabel("Euros a recibir");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblNewLabel.setBounds(28, 13, 125, 23);
    contentPane.add(lblNewLabel);

    cantidad = new JTextField();
    cantidad.setBounds(177, 13, 148, 22);
    contentPane.add(cantidad);
    cantidad.setColumns(10);

    JLabel lblNewLabel_1 = new JLabel("500€");
    lblNewLabel_1.setBounds(24, 58, 56, 16);
    contentPane.add(lblNewLabel_1);

    JLabel label = new JLabel("200€");
    label.setBounds(92, 58, 56, 16);
    contentPane.add(label);

    JLabel label_1 = new JLabel("100€");
    label_1.setBounds(160, 58, 56, 16);
    contentPane.add(label_1);

    JLabel label_2 = new JLabel("50€");
    label_2.setBounds(228, 58, 56, 16);
    contentPane.add(label_2);

    JLabel label_3 = new JLabel("20€");
    label_3.setBounds(296, 58, 56, 16);
    contentPane.add(label_3);

    JLabel label_4 = new JLabel("10€");
    label_4.setBounds(364, 58, 56, 16);
    contentPane.add(label_4);

    JLabel label_5 = new JLabel("5€");
    label_5.setBounds(432, 58, 56, 16);
    contentPane.add(label_5);

    JLabel label_6 = new JLabel("2€");
    label_6.setBounds(24, 139, 56, 16);
    contentPane.add(label_6);

    JLabel label_7 = new JLabel("1€");
    label_7.setBounds(92, 139, 56, 16);
    contentPane.add(label_7);

    JLabel label_8 = new JLabel("0.50€");
    label_8.setBounds(160, 139, 56, 16);
    contentPane.add(label_8);

    JLabel label_9 = new JLabel("0.20€");
    label_9.setBounds(228, 139, 56, 16);
    contentPane.add(label_9);

    JLabel label_10 = new JLabel("0.10€");
    label_10.setBounds(296, 139, 56, 16);
    contentPane.add(label_10);

    JLabel label_11 = new JLabel("0.05€");
    label_11.setBounds(364, 139, 56, 16);
    contentPane.add(label_11);

    JLabel label_12 = new JLabel("0.02€");
    label_12.setBounds(432, 139, 56, 16);
    contentPane.add(label_12);

    JLabel label_13 = new JLabel("0.01€");
    label_13.setBounds(24, 201, 56, 16);
    contentPane.add(label_13);

    billete500 = new JTextField();
    billete500.setBounds(12, 87, 56, 22);
    contentPane.add(billete500);
    billete500.setColumns(10);

    billete200 = new JTextField();
    billete200.setColumns(10);
    billete200.setBounds(80, 87, 56, 22);
    contentPane.add(billete200);

    billete100 = new JTextField();
    billete100.setColumns(10);
    billete100.setBounds(148, 87, 56, 22);
    contentPane.add(billete100);

    billete50 = new JTextField();
    billete50.setColumns(10);
    billete50.setBounds(216, 87, 56, 22);
    contentPane.add(billete50);

    billete20 = new JTextField();
    billete20.setColumns(10);
    billete20.setBounds(284, 87, 56, 22);
    contentPane.add(billete20);

    billete10 = new JTextField();
    billete10.setColumns(10);
    billete10.setBounds(352, 87, 56, 22);
    contentPane.add(billete10);

    billete5 = new JTextField();
    billete5.setColumns(10);
    billete5.setBounds(420, 87, 56, 22);
    contentPane.add(billete5);

    moneda2 = new JTextField();
    moneda2.setColumns(10);
    moneda2.setBounds(12, 168, 56, 22);
    contentPane.add(moneda2);

    moneda1 = new JTextField();
    moneda1.setColumns(10);
    moneda1.setBounds(80, 168, 56, 22);
    contentPane.add(moneda1);

    moneda50 = new JTextField();
    moneda50.setColumns(10);
    moneda50.setBounds(148, 168, 56, 22);
    contentPane.add(moneda50);

    moneda20 = new JTextField();
    moneda20.setColumns(10);
    moneda20.setBounds(216, 168, 56, 22);
    contentPane.add(moneda20);

    moneda10 = new JTextField();
    moneda10.setColumns(10);
    moneda10.setBounds(284, 168, 56, 22);
    contentPane.add(moneda10);

    moneda5 = new JTextField();
    moneda5.setColumns(10);
    moneda5.setBounds(352, 168, 56, 22);
    contentPane.add(moneda5);

    moneda02 = new JTextField();
    moneda02.setColumns(10);
    moneda02.setBounds(420, 168, 56, 22);
    contentPane.add(moneda02);

    moneda01 = new JTextField();
    moneda01.setColumns(10);
    moneda01.setBounds(12, 230, 56, 22);
    contentPane.add(moneda01);

    JButton btnNewButton = new JButton("OK");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        double numero = Double.parseDouble(cantidad.getText());
        String cadCantidad = String.valueOf(numero);
        double pDecimal = Double.parseDouble(cadCantidad.substring(cadCantidad.indexOf(".")));

        int partEntera = Integer.parseInt(cadCantidad.substring(0, cadCantidad.indexOf(".")));
        int partDecimal = (int) (pDecimal * 100);
        int euros[] = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int euros1[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int centimos[] = { 50, 20, 10, 5, 2, 1 };
        int centimos1[] = { 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < euros.length; i++) {
          euros1[i] = partEntera / euros[i];
          partEntera -= euros1[i] * euros[i];
        }

        for (int i = 0; i < centimos.length; i++) {
          centimos1[i] = partDecimal / centimos[i];
          partDecimal -= centimos1[i] * centimos[i];
        }

        billete500.setText(Integer.toString(euros1[0]));
        billete200.setText(Integer.toString(euros1[1]));
        billete100.setText(Integer.toString(euros1[2]));
        billete50.setText(Integer.toString(euros1[3]));
        billete20.setText(Integer.toString(euros1[4]));
        billete10.setText(Integer.toString(euros1[5]));
        billete5.setText(Integer.toString(euros1[6]));
        moneda2.setText(Integer.toString(euros1[7]));
        moneda1.setText(Integer.toString(euros1[8]));
        moneda50.setText(Integer.toString(centimos1[0]));
        moneda20.setText(Integer.toString(centimos1[1]));
        moneda10.setText(Integer.toString(centimos1[2]));
        moneda5.setText(Integer.toString(centimos1[3]));
        moneda02.setText(Integer.toString(centimos1[4]));
        moneda01.setText(Integer.toString(centimos1[5]));

      }
    });
    btnNewButton.setBounds(366, 13, 97, 25);
    contentPane.add(btnNewButton);
  }
}
