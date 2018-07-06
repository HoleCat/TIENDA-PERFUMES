package Tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class configurarObsequio extends JDialog implements ActionListener {
	private JButton btnCerrar;
	private JLabel lblImporteMinimoA;
	private JTextField txtImpM;
	private JLabel lblObsequio;
	private JTextField txtObs;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurarObsequio dialog = new configurarObsequio();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurarObsequio() {
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 450, 128);
		getContentPane().setLayout(null);
		{
			btnGrabar = new JButton("GRABAR");
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(335, 11, 89, 23);
			getContentPane().add(btnGrabar);
		}
		{
			btnCerrar = new JButton("CERRAR");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 45, 89, 23);
			getContentPane().add(btnCerrar);
		}
		
		lblImporteMinimoA = new JLabel("Importe minimo a pagar :");
		lblImporteMinimoA.setBounds(10, 15, 163, 19);
		getContentPane().add(lblImporteMinimoA);
		
		txtImpM = new JTextField();
		txtImpM.setBounds(183, 12, 86, 20);
		getContentPane().add(txtImpM);
		txtImpM.setColumns(10);
		
		lblObsequio = new JLabel("Obsequio :");
		lblObsequio.setBounds(10, 49, 163, 14);
		getContentPane().add(lblObsequio);
		
		txtObs = new JTextField();
		txtObs.setBounds(183, 46, 86, 20);
		getContentPane().add(txtObs);
		txtObs.setColumns(10);
		
		txtImpM.setText(""+ventanaPrincipal.importeMinimoObsequiable);
		txtObs.setText(""+ventanaPrincipal.obsequio);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		ventanaPrincipal.porcentaje1=Double.parseDouble(txtImpM.getText());
		ventanaPrincipal.obsequio=txtObs.getText(); 
	}
}
