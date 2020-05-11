package ejercicios9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejercicio2  extends JFrame{
    final Color rosa = new Color(249, 199, 247);
    String respuesta;
    JLabel respuestaLabel = new JLabel("LA RESPUESTA APARECERÁ AQUÍ");
    
    public Ejercicio2() {
     initcomponents();   
    }
    
     public void initcomponents (){
         setTitle("SORPRESA!!");
         
         setVisible(true);
         setSize(350, 150);
         setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
         addWindowListener(new AdaptadorWindow());
                 
        Toolkit ventanaCentrada = Toolkit.getDefaultToolkit();
    
        Dimension tamanoScreen = ventanaCentrada.getScreenSize();
        
            int alturaPantalla = tamanoScreen.height;
            int anchoPantalla = tamanoScreen.width;
        
        setLocation(anchoPantalla/3, anchoPantalla/5);
         
         BorderLayout capa = new BorderLayout(10, 10);

         Lamina01 laminita = new Lamina01();
         add(laminita, BorderLayout.CENTER);
         
         JPanel laminaTexto = new JPanel();
         laminaTexto.setBackground(Color.MAGENTA);
         laminaTexto.add(respuestaLabel);
         add(laminaTexto, BorderLayout.PAGE_END);
         
}
 
     class Lamina01 extends JPanel implements ActionListener{
   
         JLabel mensajeNuevo= new JLabel("Tiene un mensaje nuevo");
        
         JButton aceptarboton = new JButton("Aceptar");
              
         JButton responderBoton = new JButton("Responder");
         
         Font letraFuente = new Font("Verdana", Font.BOLD, 12);
         
         public Lamina01 (){
             
            setBackground(rosa); 
            aceptarboton.setFont(letraFuente);
            responderBoton.setFont(letraFuente);
            
            add(mensajeNuevo);
            add(aceptarboton);
            add(responderBoton);
            
            aceptarboton.addActionListener(this);
            responderBoton.addActionListener(this);
         
            respuestaLabel.setFont(new Font("Times", Font.ITALIC, 14));
            add(respuestaLabel);
  
         }

        public void actionPerformed(ActionEvent e) {
 
            Object botonPuls = e.getSource();
            
            if (botonPuls == aceptarboton) {            
               JOptionPane.showMessageDialog(this,"Son las 5 de la manana \n "
                        + "y yo no he dormido nada \n"
                        + "pensando en tu belleza");
            }
         
            else if (botonPuls == responderBoton) {
                respuesta = (String) JOptionPane.showInputDialog(this, "Escriba su respuesta", "Algo bonito");
                if (respuesta!= null && respuesta.length()>0) {
                respuestaLabel.setText("Respuesta enviada: " + '\n' + respuesta);}
            }                       
        }
    }
     
     private class AdaptadorWindow extends WindowAdapter {

        public AdaptadorWindow() {}
        public void windowClosing(WindowEvent evt) {
        int cerrando = JOptionPane.showConfirmDialog(null, "Seguro?", "Ha elegido salir", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
     
        if (cerrando == JOptionPane.OK_OPTION )
            System.exit(0);             
        }
    }
 }


