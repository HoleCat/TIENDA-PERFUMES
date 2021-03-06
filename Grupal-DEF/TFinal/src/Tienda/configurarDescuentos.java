package Tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class configurarDescuentos extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnGrabar;
	private JButton btnCerrar;
	private JLabel lblUnidades;
	private JLabel lblUnidades_1;
	private JLabel lblUnidades_2;
	private JLabel lblMsDe;
	private JTextField txtDesUno;
	private JTextField txtDesDos;
	private JTextField txtDesTres;
	private JTextField txtDesCuatro;
	private JLabel lblInstrucciones;
	private JLabel lblColocarSiempreUn;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurarDescuentos dialog = new configurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurarDescuentos() {
		setTitle("Configurar Descuentos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnGrabar = new JButton("GRABAR");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnGrabar);
		
		btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 42, 89, 23);
		getContentPane().add(btnCerrar);
		
		lblUnidades = new JLabel("1-5 unidades ");
		lblUnidades.setBounds(10, 15, 80, 14);
		getContentPane().add(lblUnidades);
		
		lblUnidades_1 = new JLabel("6-10 unidades");
		lblUnidades_1.setBounds(10, 46, 80, 14);
		getContentPane().add(lblUnidades_1);
		
		lblUnidades_2 = new JLabel("11-15 unidades");
		lblUnidades_2.setBounds(10, 76, 103, 14);
		getContentPane().add(lblUnidades_2);
		
		lblMsDe = new JLabel("M\u00E1s de 15 unidades");
		lblMsDe.setBounds(10, 106, 124, 14);
		getContentPane().add(lblMsDe);
		
		txtDesUno = new JTextField();
		txtDesUno.setBounds(144, 12, 42, 20);
		getContentPane().add(txtDesUno);
		txtDesUno.setColumns(10);
		
		txtDesDos = new JTextField();
		txtDesDos.setBounds(144, 43, 42, 20);
		getContentPane().add(txtDesDos);
		txtDesDos.setColumns(10);
		
		txtDesTres = new JTextField();
		txtDesTres.setBounds(144, 73, 42, 20);
		getContentPane().add(txtDesTres);
		txtDesTres.setColumns(10);
		
		txtDesCuatro = new JTextField();
		txtDesCuatro.setBounds(144, 103, 42, 20);
		getContentPane().add(txtDesCuatro);
		txtDesCuatro.setColumns(10);
		
		txtDesUno.setText(""+ventanaPrincipal.porcentaje1);
		txtDesDos.setText(""+ventanaPrincipal.porcentaje2);
		txtDesTres.setText(""+ventanaPrincipal.porcentaje3);
		txtDesCuatro.setText(""+ventanaPrincipal.porcentaje4);
		
		lblInstrucciones = new JLabel("Instrucciones :");
		lblInstrucciones.setBounds(10, 148, 103, 23);
		getContentPane().add(lblInstrucciones);
		
		lblColocarSiempreUn = new JLabel("COLOCAR SIEMPRE UN DECIMAL, EJ. \"1.0\"");
		lblColocarSiempreUn.setBounds(10, 182, 414, 23);
		getContentPane().add(lblColocarSiempreUn);
		
		label = new JLabel("%");
		label.setBounds(196, 15, 19, 14);
		getContentPane().add(label);
		
		label_1 = new JLabel("%");
		label_1.setBounds(196, 46, 19, 14);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("%");
		label_2.setBounds(196, 76, 19, 14);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("%");
		label_3.setBounds(196, 106, 19, 14);
		getContentPane().add(label_3);
		}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
	ventanaPrincipal.porcentaje1=Double.parseDouble(txtDesUno.getText()); 
	ventanaPrincipal.porcentaje2=Double.parseDouble(txtDesDos.getText()); 
	ventanaPrincipal.porcentaje3=Double.parseDouble(txtDesTres.getText()); 
	ventanaPrincipal.porcentaje4=Double.parseDouble(txtDesCuatro.getText()); 
	}
	}


