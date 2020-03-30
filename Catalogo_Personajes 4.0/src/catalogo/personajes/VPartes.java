/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Leon1
 */
class VPartes extends JFrame {
     FabricaPersonajes fab;
     public JPanel panel;
     public int numero;
     public Personaje[] personajes;
     String opcion;
     int velocidad;

     VPartes(FabricaPersonajes fab){
        this.fab=fab;
        iniciarComponentes();
        Mostrar();
        Entrada();
        Botones();
        
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
     }
  
    private void iniciarComponentes(){
        setSize(600,600);
        setTitle("Partes del personaje");
        panel = new JPanel();
        panel.setBackground(Color.white);
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.getContentPane().add(panel);
    }
    
    private void Mostrar(){
        JLabel imagenarma = (fab.creararma().devolver());
        JLabel imagencuerpo = (fab.crearcuerpo().devolver());
        JLabel imagenescudo = (fab.crearescudo().devolver());
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel titulo = new JLabel();
        titulo.setText("PARTES");
        titulo.setBounds(250, 10, 100, 100);
        JLabel texto1 = new JLabel();
        texto1.setText("CUERPO");
        texto1.setBounds(70, 70, 100, 100);
        JLabel texto2 = new JLabel();
        texto2.setText("ARMA");
        texto2.setBounds(70, 220, 100, 100);
        JLabel texto3 = new JLabel();
        texto3.setText("ESCUDO");
        texto3.setBounds(70, 370, 100, 100);
        imagencuerpo.setBounds(200, 100,300,100);
        imagenarma.setBounds(200, 250,300,100);
        imagenescudo.setBounds(200,400,300,100);
        panel.add(titulo);
        panel.add(imagenarma);
        panel.add(imagencuerpo);
        panel.add(imagenescudo);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
    }
    
    private void Botones(){
        JTextField entrada = new JTextField();
        System.out.println(entrada.getText());
        entrada.setBounds(450, 300, 100, 50);
        panel.add(entrada);
        System.out.println(numero);
        JButton Crear = new JButton();
        Crear.setText("Crear");
        Crear.setBounds(450, 400, 100,50  );
        JLabel Estrategy =new JLabel();
        Estrategy.setText("ESTRATEGIA DE VELOCIDAD");
        Estrategy.setBounds(420,100,220,50);
        Estrategy.setBackground(Color.red);
        JLabel Info =new JLabel();
        Info.setText("Debajo digite la cantidad a Crear");
        Info.setBounds(400,250,220,50);
        Info.setBackground(Color.red);
        JComboBox Estrategia = new JComboBox();
        Estrategia.addItem("Rapido");
        Estrategia.addItem("Medio");
        Estrategia.addItem("Lento");
        Estrategia.setBounds(450, 150, 95,50  );
        panel.add(Estrategia);
        panel.add(Crear);
        panel.add(Estrategy);
        panel.add(Info);
        
        
        ActionListener Click = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {  
                  numero=Integer.parseInt(entrada.getText());
                  personajes = new Personaje[numero]; 
                  for (int i=0;i<personajes.length;i++){
                      System.out.println(fab.cuerpocompleto());
                    Personaje p = new Personaje(fab.cuerpocompleto(),fab);
                    personajes[i]=p;
                  }
                  VCreado vc = new VCreado(personajes,velocidad);
                  vc.setVisible(true);
                  vc.setLocationRelativeTo(null);
                  
            }
    
        };
        Crear.addActionListener(Click);
        Estrategia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcion=(Estrategia.getSelectedItem().toString());
                                System.out.println(opcion);
                if(opcion=="Rapido"){
                    EstrategiaRapido rp = new EstrategiaRapido();
                    velocidad=rp.Cambiarvelocidad();
                }
                if(opcion=="Medio"){
                    EstrategiaMedia rp = new EstrategiaMedia();
                    velocidad=rp.Cambiarvelocidad();
                }
                if(opcion=="Lento"){
                    EstrategiaLento rp = new EstrategiaLento();
                    velocidad=rp.Cambiarvelocidad();
                }
            }
        });
                }

    private void Entrada() {
        
    }
}
