package interfasGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.codigo;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textQ;
	private JTextField textH;
	private JTextField textU;
	private JTextField textX;
	private JTextField textY;
	private JTextField textZ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel Punto = new JLabel("");
		Punto.setIcon(new ImageIcon(Ventana.class.getResource("/img/Punto.png")));
		
		contentPane.add(Punto);
		
		JLabel lbArriba = new JLabel("");
		lbArriba.setIcon(new ImageIcon(Ventana.class.getResource("/img/arriba.png")));
		
		contentPane.add(lbArriba);
		
		JLabel lbAbajo = new JLabel("");
		lbAbajo.setIcon(new ImageIcon(Ventana.class.getResource("/img/abajo.png")));
		
		contentPane.add(lbAbajo);
		
		JLabel lbIzquierda = new JLabel("");
		lbIzquierda.setIcon(new ImageIcon(Ventana.class.getResource("/img/izquierda.png")));
		
		contentPane.add(lbIzquierda);
		
		lbArriba.setBounds(192, 493, 50, 50);
		lbAbajo.setBounds(244, 426, 50, 50);
		lbIzquierda.setBounds(178, 479, 39, 35);
		JLabel lblNewLabel_4 = new JLabel("Ingrese datos");
		lblNewLabel_4.setFont(new Font("Poor Richard", Font.PLAIN, 34));
		lblNewLabel_4.setBounds(36, 198, 224, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblX = new JLabel("X = ");
		lblX.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblX.setBounds(53, 259, 39, 26);
		contentPane.add(lblX);
		
		textX = new JTextField();
		textX.setBounds(90, 259, 50, 27);
		contentPane.add(textX);
		textX.setColumns(10);
		
		JLabel lblY = new JLabel("Y = ");
		lblY.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblY.setBounds(53, 296, 39, 26);
		contentPane.add(lblY);
		
		JLabel lblZ = new JLabel("Z = ");
		lblZ.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblZ.setBounds(53, 331, 39, 26);
		contentPane.add(lblZ);
		
		JLabel lblKm = new JLabel("Km");
		lblKm.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblKm.setBounds(148, 259, 39, 26);
		contentPane.add(lblKm);
		
		textZ = new JTextField();
		textZ.setColumns(10);
		textZ.setBounds(90, 330, 50, 27);
		contentPane.add(textZ);
		
		textY = new JTextField();
		textY.setColumns(10);
		textY.setBounds(90, 296, 50, 27);
		contentPane.add(textY);
		
		JLabel label = new JLabel("Km");
		label.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		label.setBounds(150, 296, 39, 26);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Km");
		label_1.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		label_1.setBounds(150, 331, 39, 26);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.BOLD, 39));
		lblNewLabel_1.setBounds(438, 145, 187, 35);
		contentPane.add(lblNewLabel_1);
		
		textU = new JTextField();
		textU.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textU.setOpaque(false);
		textU.setColumns(10);
		textU.setBounds(531, 59, 108, 26);
		contentPane.add(textU);
		
		textH = new JTextField();
		textH.setOpaque(false);
		textH.setColumns(10);
		textH.setBounds(232, 112, 118, 26);
		contentPane.add(textH);
		
		textQ = new JTextField();
		textQ.setOpaque(false);
		textQ.setBounds(232, 59, 118, 26);
		contentPane.add(textQ);
		textQ.setColumns(10);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad =");
		lblEstabilidad.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblEstabilidad.setBounds(415, 108, 118, 26);
		contentPane.add(lblEstabilidad);
		
		JLabel lblUms = new JLabel("u [m/s] =");
		lblUms.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblUms.setBounds(435, 59, 98, 26);
		contentPane.add(lblUms);
		
		JLabel lblHm = new JLabel("H [m] =");
		lblHm.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblHm.setBounds(124, 108, 98, 26);
		contentPane.add(lblHm);
		
		JLabel lblNewLabel_3 = new JLabel("Q [g/s] =");
		lblNewLabel_3.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(124, 55, 98, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Contaminacion del medio ambiente");
		lblNewLabel_2.setFont(new Font("Vivaldi", Font.PLAIN, 50));
		lblNewLabel_2.setBounds(264, -2, 575, 50);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboEst = new JComboBox();
		comboEst.setBackground(Color.WHITE);
		comboEst.setMaximumRowCount(10);
		comboEst.setBounds(541, 108, 50, 26);
		contentPane.add(comboEst);
		comboEst.addItem(" A");
		comboEst.addItem(" B");
		comboEst.addItem(" C");
		comboEst.addItem(" D");
		comboEst.addItem(" E");
		comboEst.addItem(" F");
		
		
		JTextArea Resultado = new JTextArea();
		Resultado.setOpaque(false);
		Resultado.setEditable(false);
		Resultado.setBounds(427, 213, 144, 55);
		contentPane.add(Resultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Poor Richard", Font.PLAIN, 17));
		btnCalcular.setBorderPainted(false);
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.setIcon(new ImageIcon(Ventana.class.getResource("/img/calcular.png")));
		btnCalcular.addActionListener(new ActionListener() {
			double v[]=new double[6];
			String vect[]=new String[6];	
			double res[]=new double [3];
			public void actionPerformed(ActionEvent arg0) {
				// Obteniendo los datos	
				
				if(!Comprobacion()) {
					if(validarDouble()) {
						codigo c=new codigo();
						res[1]=c.y(v[3], comboEst.getSelectedIndex());
						res[2]=c.z(v[3], comboEst.getSelectedIndex());
						res[0]=c.calcular(v[0], v[1], v[2], comboEst.getSelectedIndex(), v[4], v[5]);
						Resultado.setText("");
						for(int i=0;i<3;i++) {								
							Resultado.setText(Resultado.getText()+res[i]+"\n");
						}
						posicion(v[3],v[4],v[5]);
					}else {
						JOptionPane.showMessageDialog(null, "Ingrese solo Numeros, Decimal con punto (.)", "Error", 0);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Todos los campos Tienen que ser llenados", "\tError", 0);
				}
			
				
				
			}
			// Punto 
			private void posicion(double x, double y, double z) {
				int rx=(int) x,ry=(int) y,rz=(int) z;
				int p[][]=new int [4][9] ; 
				int q[][]=new int [3][9] ; 
				
				p[0][0]=220; p[0][1]=237; p[0][2]=280; p[0][3]=327; p[0][4]=393; p[0][5]=500; p [0][6]=659; p [0][7]=860 ; p [0][8]=920;
				
				// 1 5 10 50 100 150 
				p[2][0]=190; p[2][1]=173; p[2][2]=155; p[2][3]=177; p[2][4]=80;
				p[3][0]=543; p[3][1]=560; p[3][2]=577; p[3][3]=605; p[3][4]=641;
				
				q[0][0]=1; q[0][1]=2; q[0][2]=5; q[0][3]=10; q[0][4]=20; q[0][5]=50; q [0][6]=100; q [0][7]=150 ; 
				
				q[2][0]=1; q[2][1]=5; q[2][2]=50; q[2][3]=100; q[2][4]=150;
				int i=1;boolean sw=false;
				if(rx!=0) {
					
					while(i<9 & sw==false) {						
						if(rx<=150) {
							if(rx<=q[0][i-1]) {
								if(rx==q[0][i-1])
									rx=p[0][i-1];
								else
									rx=p[0][i-1]-(int)((p[0][i]-p[0][i-1])/2);
								sw=true;
							}
						}else
							rx= p [0][8]=920;;
						i++;
						
					}
				}else
					rx=192;
				// eje z
				// 10 20 50 100 150
				p[1][0]=439; p[1][1]=391; p[1][2]=327; p[1][3]=269; p[1][4]=200; p [1][5]=177;
				q[1][0]=10; q[1][1]=20; q[1][2]=50; q[1][3]=100; q[1][4]=150;
				sw=false; i=0;
				if(rz!=0) {
					if(rz<=150) {
						while(i<5 & sw==false) {
							System.out.println(rz+" <= "+q[1][i]+" __ "+i);
							if(rz<=q[1][i]) {
								if(rz==q[1][i])
									rz=p[1][i];
								else
									rz=p[1][i]+((p[1][i]-p[1][i+1])/2);
								sw=true;
							}
							i++;
						}
					}
					else rz=p [1][5]=177;
				}
				else	
					rz=479;
				System.out.println(rz);							
				
				lbArriba.setBounds(rx, 492, 50, 50);
				/*lbAbajo.setBounds(185, 445, 50, 50); 190*/
				lbIzquierda.setBounds(175, rz, 39, 35);
				Punto.setBounds(rx, rz, 25, 25);
			}
			private boolean validarDouble() {
				boolean sw=true;
				for(int i=0;i<6;i++) {				
					if(isNumericInt(vect[i])==true | isNumericDoub(vect[i])==true) {
						v[i]=Double.parseDouble(vect[i]);						
					}
					else
						sw=false;
				}
				return sw;
			}
			private boolean Comprobacion() {
				vect[0]=textQ.getText();
				vect[1]=textH.getText();
				vect[2]=textU.getText();				
				vect[3]=textX.getText();
				vect[4]=textY.getText();
				vect[5]=textZ.getText();
				boolean sw=false;
				for(int i=0;i<6;i++) {
					if(vect[i].equals(""))
						sw=true;
				}
				return sw;
			}
			private boolean isNumericInt(String cad){
				try {
					Integer.parseInt(cad);					
					return true;
				} catch (NumberFormatException nfe){
					return false;
				}
			}
			private boolean isNumericDoub(String cad){
				try {
					Double.parseDouble(cad);					
					return true;
				} catch (NumberFormatException nfe){
					return false;
				}
			}
			
			
		});
		
		
		
		
		btnCalcular.setBounds(36, 369, 152, 60);
		contentPane.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Poor Richard", Font.PLAIN, 17));
		btnLimpiar.setBorderPainted(false);
		btnLimpiar.setOpaque(false);
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setIcon(new ImageIcon(Ventana.class.getResource("/img/limpiar.png")));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textX.setText("");
				textY.setText("");
				textZ.setText("");
			}
		});
		btnLimpiar.setBounds(36, 440, 152, 55);
		contentPane.add(btnLimpiar);
		
		JButton btnLimpiarTodo = new JButton("");
		btnLimpiarTodo.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnLimpiarTodo.setBorderPainted(false);
		btnLimpiarTodo.setIcon(new ImageIcon(Ventana.class.getResource("/img/borrar.png")));
		btnLimpiarTodo.setOpaque(false);
		btnLimpiarTodo.setContentAreaFilled(false);
		btnLimpiarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textQ.setText("");
				textH.setText("");
				textU.setText("");				
				textX.setText("");
				textY.setText("");
				textZ.setText("");
			}
		});
		
		JLabel lblNewLabel = new JLabel("Borrar Todo");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 11));
		lblNewLabel.setBounds(693, 74, 74, 26);
		contentPane.add(lblNewLabel);
		btnLimpiarTodo.setBounds(678, 52, 108, 105);
		contentPane.add(btnLimpiarTodo);
		
		JLabel lbPlano = new JLabel("");
		lbPlano.setIcon(new ImageIcon(Ventana.class.getResource("/img/Captura1.png")));
		lbPlano.setBounds(25, 181, 961, 479);
		contentPane.add(lbPlano);
		
		JLabel lblNewLabel_5 = new JLabel("Univ. Gimena Choque Quisbert");
		lblNewLabel_5.setFont(new Font("Sitka Subheading", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBounds(635, 153, 373, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Ventana.class.getResource("/img/fondo.jpg")));
		lblFondo.setBounds(0, 0, 1024, 671);
		contentPane.add(lblFondo);
	}
}
