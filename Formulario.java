import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
public class Formulario extends JFrame implements ActionListener {
	
        
        JLabel l1 = new JLabel("Valor Unitario");
	JLabel l2 = new JLabel("Cantidad");
	JLabel l3 = new JLabel("Tipo de zapatilla");
        JLabel l4 = new JLabel("Valor de cada venta");
        JLabel l5 = new JLabel("Venta Total Tipo 1");
        JLabel l6 = new JLabel("Venta Total Tipo 2");
        JLabel l7 = new JLabel("Venta Total Tipo 3");
	JLabel l8 = new JLabel("Venta Total Tipo 4");
        JLabel l9 = new JLabel("Total de las ventas");
        JLabel l10 = new JLabel("Numero de Venta");
        Choice ch = new Choice();
	TextArea ta = new TextArea("Para desplegar la lista",5,20,TextArea.SCROLLBARS_BOTH);
	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	JTextField t6 = new JTextField();        
        JTextField t7 = new JTextField();        
        JTextField t8 = new JTextField();
        JTextField t9 = new JTextField();        
        
	JButton b1 = new JButton("Vender");
	JButton b2 = new JButton("Listar");
	JButton b3 = new JButton("Consultar");
        
	Metodos met = new Metodos();
	String cadena = "";
		
	public Formulario(){
		super("Ventas");
		this.setLayout(null);
		ch.addItem("Tipo 1");
		ch.addItem("Tipo 2");
                ch.addItem("Tipo 3");
                ch.addItem("Tipo 4");
                
//		se crean las etiquetas y se agregan al formulario
		this.l1.setBounds(10, 10, 120, 23);
		this.add(l1);
		
		this.l2.setBounds(10, 35, 120, 23);
		this.add(l2);
		
		this.l3.setBounds(10, 60, 120, 23);
		this.add(l3);
		
		this.l4.setBounds(10, 150, 120, 23);
		this.add(l4);
		
		
                this.l5.setBounds(10, 175,120, 23);
		this.add(l5);
                
                this.l6.setBounds(10, 200, 120, 23);
		this.add(l6);
                
                this.l7.setBounds(10, 225, 120, 23);
		this.add(l7);
                
                this.l8.setBounds(10, 250, 120, 23);
		this.add(l8);
                
                this.l9.setBounds(10, 275, 120, 23);
		this.add(l9);
                
                //se crean los textos y se agregan al formulario
		this.t1.setBounds(150, 10, 200, 23);
		this.add(t1);
				
		
		
		this.t2.setBounds(150, 35, 200, 23);
		this.add(t2);
		
	//	this.t3.setEditable(false);
		this.t3.setBounds(150, 150, 200, 23);
		this.add(t3);
                
                this.t4.setBounds(150, 175, 200, 23);
		this.add(t4);
                
                this.t5.setBounds(150, 200, 200, 23);
		this.add(t5);
                
                this.t6.setBounds(150, 225, 200, 23);
		this.add(t6);
                
                this.t7.setBounds(150, 250, 200, 23);
		this.add(t7);
                
                this.t8.setBounds(150, 275, 200, 23);
		this.add(t8);
                
                this.ch.setBounds(150, 60, 200, 23);
		this.add(ch);
                
                this.l10.setBounds(10, 85, 120, 25);
		this.add(l10);
                
                
                this.t9.setBounds(130, 85, 40, 25);
                
                this.add(t9);
                
                //No deja modificar los textfield
                t3.setEditable(false);
                t4.setEditable(false);
                t5.setEditable(false);
                t6.setEditable(false);
                t7.setEditable(false);
                t8.setEditable(false);
                
//		se crean los botones y se agregan el formulario
		this.b1.setBounds(190, 85, 160, 25);
		this.b1.addActionListener(this);
		this.add(b1);
		
		this.b2.setBounds(10, 115, 160, 25);
		this.b2.addActionListener(this);
		this.add(b2);
		
		
		
                this.b3.setBounds(190, 115, 160, 25);
		this.b3.addActionListener(this);
		this.add(b3);
                
                this.ta.setBounds(10, 300, 350, 280);
		this.add(ta);
                ta.setEditable(false);
		//Cerrar el formulario
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(370,620);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main (String arg[]){
		new Formulario();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==b1){
                    
			if (t1.getText().equals("") || t2.getText().equals("")|| t9.getText().equals("") ){
				JOptionPane.showMessageDialog(new JDialog(), "Faltan Datos");
			}else {
				Nodo no = new Nodo();
                                
				no.valorU=Integer.parseInt(t1.getText());
				no.cantidadV=Integer.parseInt(t2.getText());
                                no.numVentas=t9.getText();
                                no.tipoZapatillas=ch.getSelectedIndex();                           
                                
				met.adicionar(no);
				clear(); 
                                
                        // Va haciendo calculos
                        
                        int venta=0;
                        venta=(no.valorU*no.cantidadV);
                        t3.setText(Integer.toString(venta));
                        
                        // Devuelve el valort3.setText(Double.toString(venta));
                        
                        int zapatos;
               
                        int tipo1=0, tipo2=0,tipo3=0,tipo4=0;
                        
                        
                        zapatos=  ch.getSelectedIndex();
                        
                        
                        if(zapatos==0)
                        {
                            tipo1=tipo1+venta;
                            t4.setText(Integer.toString(tipo1));
                        }
                         if(zapatos==1)
                        {
                            tipo2=tipo2+venta;
                            t5.setText(Integer.toString(tipo2));
                        }
                          if(zapatos==2)
                        {
                            tipo3=tipo3+venta;
                            t6.setText(Integer.toString(tipo3));
                        }
                           if(zapatos==3)
                        {
                            tipo4=tipo4+venta;
                            t7.setText(Integer.toString(tipo4));
                        }
                  
			}
		}
		
		if (arg0.getSource()==b2){
			cadena = met.listar();
			ta.setText(cadena);
		}
		
		if (arg0.getSource()==b3){
			met.buscar();
		}
               
		
	}
	
	public void clear(){
		t1.setText("");
		t2.setText("");
		t9.setText("");
		t1.requestFocus();
		
	}
}
