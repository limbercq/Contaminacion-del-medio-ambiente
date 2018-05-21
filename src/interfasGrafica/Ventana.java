package interfasGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

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
		Punto.setBounds(408, 364, 25, 25);
		contentPane.add(Punto);
		
		JLabel lbArriba = new JLabel("");
		lbArriba.setIcon(new ImageIcon(Ventana.class.getResource("/img/arriba.png")));
		lbArriba.setBounds(396, 497, 50, 50);
		contentPane.add(lbArriba);
		
		JLabel lbAbajo = new JLabel("");
		lbAbajo.setIcon(new ImageIcon(Ventana.class.getResource("/img/abajo.png")));
		lbAbajo.setBounds(185, 445, 50, 50);
		contentPane.add(lbAbajo);
		
		JLabel lbIzquierda = new JLabel("");
		lbIzquierda.setIcon(new ImageIcon(Ventana.class.getResource("/img/izquierda.png")));
		lbIzquierda.setBounds(160, 364, 39, 35);
		contentPane.add(lbIzquierda);
		
		JLabel lblNewLabel_4 = new JLabel("Ingrese datos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_4.setBounds(36, 213, 224, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblX = new JLabel("X = ");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblX.setBounds(53, 259, 39, 26);
		contentPane.add(lblX);
		
		textX = new JTextField();
		textX.setBounds(90, 259, 50, 27);
		contentPane.add(textX);
		textX.setColumns(10);
		
		JLabel lblY = new JLabel("Y = ");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblY.setBounds(53, 296, 39, 26);
		contentPane.add(lblY);
		
		JLabel lblZ = new JLabel("Z = ");
		lblZ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblZ.setBounds(53, 331, 39, 26);
		contentPane.add(lblZ);
		
		JLabel lblKm = new JLabel("Km");
		lblKm.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(150, 296, 39, 26);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Km");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(150, 331, 39, 26);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(438, 145, 187, 35);
		contentPane.add(lblNewLabel_1);
		
		textU = new JTextField();
		textU.setColumns(10);
		textU.setBounds(452, 59, 108, 26);
		contentPane.add(textU);
		
		textH = new JTextField();
		textH.setColumns(10);
		textH.setBounds(142, 112, 118, 26);
		contentPane.add(textH);
		
		textQ = new JTextField();
		textQ.setBounds(142, 59, 118, 26);
		contentPane.add(textQ);
		textQ.setColumns(10);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad =");
		lblEstabilidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstabilidad.setBounds(328, 108, 118, 26);
		contentPane.add(lblEstabilidad);
		
		JLabel lblUms = new JLabel("u [m/s] =");
		lblUms.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUms.setBounds(348, 59, 98, 26);
		contentPane.add(lblUms);
		
		JLabel lblHm = new JLabel("H [m] =");
		lblHm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHm.setBounds(53, 108, 98, 26);
		contentPane.add(lblHm);
		
		JLabel lblNewLabel_3 = new JLabel("Q [g/s] =");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(53, 59, 98, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Contaminacion del medio ambiente");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(293, 0, 510, 50);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboEst = new JComboBox();
		comboEst.setMaximumRowCount(10);
		comboEst.setBounds(462, 99, 50, 35);
		contentPane.add(comboEst);
		comboEst.addItem(" A");
		comboEst.addItem(" B");
		comboEst.addItem(" C");
		comboEst.addItem(" D");
		comboEst.addItem(" E");
		comboEst.addItem(" F");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			double q,h,u,x,y,z;
			String vect[]=new String[6];					
			public void actionPerformed(ActionEvent arg0) {
				// Obteniendo los datos	
				
				if(!Comprobacion()) {
					System.out.println("lleno");
				}
				else {
					JOptionPane.showMessageDialog(null, "Todos los campos Tienen que ser llenados", "\tError", 0);
				}
				System.out.println(comboEst.getSelectedIndex());
				
				
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
			
		});
		
		
		btnCalcular.setBounds(62, 379, 114, 35);
		contentPane.add(btnCalcular);
		
		JLabel lbPlano = new JLabel("");
		lbPlano.setIcon(new ImageIcon(Ventana.class.getResource("/img/Captura1.png")));
		lbPlano.setBounds(25, 181, 961, 479);
		contentPane.add(lbPlano);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Ventana.class.getResource("/img/fondo.jpg")));
		lblFondo.setBounds(0, 0, 1024, 671);
		contentPane.add(lblFondo);
	}
}
