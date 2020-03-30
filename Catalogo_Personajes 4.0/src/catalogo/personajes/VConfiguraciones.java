/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

/**
 *
 * @author Lindsey Camargo
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VConfiguraciones extends JFrame{
   public Personaje[] personajes;
    public Originator originator;
    public CareTaker caretaker;
    public JPanel panel;
    String opcion;
    int velocidad;
    
    public VConfiguraciones(Personaje[] personajes, int velocidad, Originator originator, CareTaker caretaker){
        this.personajes=personajes;
        this.velocidad=velocidad;
        this.originator=originator;
        this.caretaker=caretaker;
        iniciarComponentes();
        Mostrar();
        Botones();
    }
    
    private void iniciarComponentes(){
        setSize(400,400);
        setTitle("Configuraciones");
        panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void Mostrar(){
        JLabel TP = new JLabel();
        TP.setBounds(25,0,200, 40);
        TP.setText("Configuracion");
        panel.add(TP);
    }
    
    
    private void Botones(){
                JComboBox color = new JComboBox();
		color.addItem("Azul");
		color.addItem("Rojo");
		color.addItem("Verde");
                color.setBounds(100, 10, 95, 20);
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                                opcion=(color.getSelectedItem().toString());
                                System.out.println(opcion);
                                if (opcion=="Azul"){
                                    JOptionPane.showMessageDialog(panel, "Seleccionaste Cambio de Estilo");
                                    DecorarConcretoAzul daz = new DecorarConcretoAzul(personajes);
                                    personajes=daz.CambiarColor(personajes);
                                    VCreado vc = new VCreado(personajes,velocidad);
                                    vc.setLocationRelativeTo(null);
                                    vc.setVisible(true);
                                    
                                }
                                if (opcion=="Rojo"){
                                    JOptionPane.showMessageDialog(panel, "Seleccionaste Cambio de Estilo");
                                    DecorarConcretoRojo daz = new DecorarConcretoRojo(personajes);
                                    personajes=daz.CambiarColor(personajes);
                                    VCreado vc = new VCreado(personajes,velocidad);
                                    vc.setLocationRelativeTo(null);
                                    vc.setVisible(true);
                                    
                                }
                                if (opcion=="Verde"){
                                    JOptionPane.showMessageDialog(panel, "Seleccionaste Cambio de Estilo");
                                    DecorarConcretoVerde daz = new DecorarConcretoVerde(personajes);
                                    personajes=daz.CambiarColor(personajes);
                                    VCreado vc = new VCreado(personajes,velocidad);
                                    vc.setLocationRelativeTo(null);
                                    vc.setVisible(true);
                                    
                                }

                                
			}
		});
                
                JButton Ayuda = new JButton();  
                Ayuda.setBounds(25, 50, 200, 20);
                Ayuda.setText("Ayuda");
		Ayuda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                                    JOptionPane.showMessageDialog(panel, "Seleccionaste Ayuda");
                                    JCheckBox AyudasobreEstrategia = new JCheckBox();
                                    JCheckBox AyudasobreEstilos = new JCheckBox();
                                    AyudasobreEstilos.setBackground(Color.white);
                                    AyudasobreEstilos.setText("AyudasobreEstilos");
                                    AyudasobreEstilos.setBounds(5, 105, 200, 20);
                                    AyudasobreEstrategia.setBackground(Color.white);
                                    AyudasobreEstrategia.setText("AyudasobreEstrategia");
                                    AyudasobreEstrategia.setBounds(5, 135, 200, 20);
                                    JButton ok = new JButton();
                                    ok.setText("OK");
                                    ok.setBounds(5, 160, 100, 20);
                                    panel.add(AyudasobreEstilos);
                                    panel.add(AyudasobreEstrategia);
                                    panel.add(ok);
                                    ok.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            int tipo=0;
                                            Cadena2 cd= new Cadena2();
                                            Cadena1 ca=new Cadena1(cd);
                                    
                                        if(AyudasobreEstilos.isSelected()){
                                            tipo=1;
                                            ca.Info(tipo);
                                            System.out.println("Entro a 1");
                                            JOptionPane.showMessageDialog(panel,ca.Info(tipo));
                                        }   else{
                                                if(AyudasobreEstrategia.isSelected()){
                                                tipo=2;
                                                System.out.println("entro a 2");
                                                ca.Info(tipo);
                                                JOptionPane.showMessageDialog(panel, ca.Info(tipo));
                                        }
                                    }
                                   
                                        }    
                                });
                            
			}
                        
		});
                JButton Guardar = new JButton();  
                Guardar.setBounds(25, 220, 200, 20);
                Guardar.setText("Guardar");
		Guardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                                    JOptionPane.showMessageDialog(panel, "Seleccionaste Guardar");
                                    JCheckBox Guardar = new JCheckBox();
                                    JCheckBox Recuperar = new JCheckBox();
                                    Guardar.setBackground(Color.white);
                                    Guardar.setText("Guardar");
                                    Guardar.setBounds(70, 250, 200, 20);
                                    Guardar.setVisible(true);
                                    Recuperar.setBackground(Color.white);
                                    Recuperar.setText("Recuperar");
                                    Recuperar.setBounds(70, 280, 100, 20);
                                    JButton ok = new JButton();
                                    ok.setText("OK");
                                    ok.setBounds(100, 300, 100, 20);
                                    panel.add(Guardar);
                                    panel.add(Recuperar);
                                    panel.add(ok);
                                    ok.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                        if(Guardar.isSelected()){
                                            originator.setPersonajes(personajes);
                                            caretaker.AgregarMemento(originator.guardar());
                                            
                                        }   else{
                                                if(Recuperar.isSelected()){
                                                    String respuesta=JOptionPane.showInputDialog("Digita el momento");
                                                    originator.restaurar(caretaker.getMemento(Integer.parseInt(respuesta)));
                                                    personajes = originator.getPersonajes();
                                                    VCreado vc = new VCreado(personajes,velocidad);
                                                    vc.setLocationRelativeTo(null);
                                                    vc.setVisible(true);
    
                                        }
                                    }
                                   
                                        }    
                                });
                                        }
                                    });
                            
			
                    
//                panel.setLayout(new FlowLayout());
                panel.add(Guardar);
		panel.add(color);
		panel.add(Ayuda);
                
                
    }

}

