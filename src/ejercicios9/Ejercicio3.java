package ejercicios9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio3 extends JFrame {

    public Ejercicio3() {
        initComponentes();
    }

    public void initComponentes() {

        setTitle("Editor de texto");
        setVisible(true);
        setSize(300, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Toolkit ventanaCentrada = Toolkit.getDefaultToolkit();

        Dimension tamanoScreen = ventanaCentrada.getScreenSize();

        int alturaPantalla = tamanoScreen.height;
        int anchoPantalla = tamanoScreen.width;

        setLocation(anchoPantalla / 3, anchoPantalla / 5);

        CopyPaste_Lamina panel1 = new CopyPaste_Lamina();

        add(panel1);
    }

    class CopyPaste_Lamina extends JPanel {
        private JTextField txt;
        private JTextField txt02;
        private String textoCopiado;
        private boolean editartexto;

        public CopyPaste_Lamina() {

            JLabel textoIntroducir = new JLabel("    INTRODUCE EL TEXTO     ");

            add(textoIntroducir, BorderLayout.NORTH);

            txt = new JTextField("                                    ");
            txt.setEditable(true);

            txt02 = new JTextField("          EL TEXTO PEGADO VA AQUÍ          ");
            editartexto = false;

            txt02.setBackground(Color.WHITE);
            txt02.setEditable(editartexto);

            add(txt);
            add(txt02);

            JButton copiar = new JButton("Copiar");

            CopiarTexto mievento = new CopiarTexto();

            copiar.addActionListener(mievento);
            add(copiar, BorderLayout.SOUTH);

            JButton cortar = new JButton("Cortar");

            CortarTexto cortarevento = new CortarTexto();

            cortar.addActionListener(cortarevento);

            add(cortar, BorderLayout.SOUTH);

            JButton pegar = new JButton("Pegar");

            PegarTexto pegarEvento = new PegarTexto();

            pegar.addActionListener(pegarEvento);

            add(pegar, BorderLayout.SOUTH);

        }

        private class CopiarTexto implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                textoCopiado = txt.getSelectedText();

            }
        }

        private class CortarTexto implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                ;
                textoCopiado = txt.getSelectedText();
                String nuevo = txt.getText().replaceAll(textoCopiado, "");

                txt.setText(nuevo);

            }
        }

        private class PegarTexto implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                editartexto = true;

                txt02.setText(textoCopiado);

                editartexto = false;
            }
        }
    }
}
