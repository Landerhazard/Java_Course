package ejercicios9;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame {

    int numero1 = 0;
    int numero2 = 0;
    int resultadoNum = 0;

    public Ejercicio1() {
        initcomponents();
    }

    public void initcomponents() {

        setTitle("Sumar o restar");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Toolkit ventanaCentrada = Toolkit.getDefaultToolkit();

        Dimension tamanoScreen = ventanaCentrada.getScreenSize();

        int alturaPantalla = tamanoScreen.height;
        int anchoPantalla = tamanoScreen.width;

        setSize(anchoPantalla / 3, alturaPantalla / 3);
        setLocation(anchoPantalla / 3, anchoPantalla / 5);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Lamina01 capanueva = new Lamina01();
        add(capanueva);

    }

    class Lamina01 extends JPanel implements ActionListener {

        JTextField campo1 = new JTextField(10);
        JTextField campo2 = new JTextField(10);
        JButton boton1 = new JButton("Sumar");
        JButton boton2 = new JButton("Restar");

        JLabel resultado = new JLabel("Su resultado es: ");

        public Lamina01() {
            add(campo1);
            add(campo2);
            add(boton1);
            add(boton2);
            add(resultado);

            boton1.addActionListener(this);
            boton2.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {

            Object botonPulsado = e.getSource();

            numero1 = Integer.parseInt(campo1.getText());
            numero2 = Integer.parseInt(campo2.getText());

            if (botonPulsado == boton1) {
                resultadoNum = numero1 + numero2;
            } else
                resultadoNum = numero1 - numero2;

            resultado.setText("El resultado es: " + resultadoNum);
        }
    }
}
