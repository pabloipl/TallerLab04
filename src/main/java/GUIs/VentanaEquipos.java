package GUIs;

import Datos.DatosEquipos;
import DominioProblema.Seleccion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class VentanaEquipos extends Ventana implements ActionListener{
    private JLabel etiquetaChoose;
    private JLabel etiquetaRanking;
    private JLabel etiquetaImagen;
    private JLabel ranking;
    private JLabel imagen;
    private JButton players;
    private JButton exit;
   private JComboBox combo;
   DatosEquipos equipos;

    public VentanaEquipos(){
        etiquetaChoose=this.generarEtiqueta("Choose Team:",30,30,250,25, Font.DIALOG,15);
        combo=new JComboBox();
        combo.setBounds(200,30,200,25);
        combo.addItem("Australia");
        combo.addItem("Cameroon");
        combo.addItem("Chile");
        combo.addItem("Germany");
        combo.setSelectedIndex(0);
        etiquetaRanking=this.generarEtiqueta("Ranking FIFA:",30,100,250,25,Font.DIALOG,15);
        players=this.generarBoton("Players",150,200,100,30);
        exit=this.generarBoton("Exit",500,200,100,30);
        players.addActionListener(this);
        exit.addActionListener(this);

        add(combo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == players) {
            this.dispose();
            new VentanaJugadores();
        }
        if (e.getSource() == exit)
            this.dispose();
    }

    public void action(ActionEvent e) {
        if (e.getSource()==combo) {
            if(combo.getSelectedIndex()==0){
            imagen.setIcon(new ImageIcon("C:\\Users\\Pablo Perez\\Desktop\\TallerLab04\\aus.png"));
            }if(combo.getSelectedIndex()==1){
                imagen.setIcon(new ImageIcon("C:\\Users\\Pablo Perez\\Desktop\\TallerLab04\\cmr.png"));
            }if(combo.getSelectedIndex()==2){
                imagen.setIcon(new ImageIcon("C:\\Users\\Pablo Perez\\Desktop\\TallerLab04\\chi.png"));
            }if(combo.getSelectedIndex()==3){
                imagen.setIcon(new ImageIcon("C:\\Users\\Pablo Perez\\Desktop\\TallerLab04\\ger.png"));
            }
        }
    }


    }








