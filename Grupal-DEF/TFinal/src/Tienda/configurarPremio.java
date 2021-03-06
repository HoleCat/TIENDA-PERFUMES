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

public class configurarPremio extends JDialog implements ActionListener {
	private JTextField txtNcliente;
	private JTextField txtSor;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurarPremio dialog = new configurarPremio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurarPremio() {
		setTitle("Configurar Premio Sorpresa");
		setBounds(100, 100, 450, 149);
		getContentPane().setLayout(null);
		{
			JLabel lblNumeroDeCliente = new JLabel("Numero de Cliente :");
			lblNumeroDeCliente.setBounds(10, 28, 127, 14);
			getContentPane().add(lblNumeroDeCliente);
		}
		{
			JLabel lblPremioSorpresa = new JLabel("Premio Sorpresa :");
			lblPremioSorpresa.setBounds(10, 65, 113, 14);
			getContentPane().add(lblPremioSorpresa);
		}
		{
			txtNcliente = new JTextField();
			txtNcliente.setBounds(132, 25, 86, 20);
			getContentPane().add(txtNcliente);
			txtNcliente.setColumns(10);
			txtNcliente.setText(""+ventanaPrincipal.numeroClienteSorpresa);
		}
		{
			txtSor = new JTextField();
			txtSor.setBounds(133, 62, 86, 20);
			getContentPane().add(txtSor);
			txtSor.setColumns(10);
			txtSor.setText(""+ventanaPrincipal.premioSorpresa);
		}
		{
			btnGrabar = new JButton("GRABAR");
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(335, 24, 89, 23);
			getContentPane().add(btnGrabar);
		}
		{
			btnCerrar = new JButton("CERRAR");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 61, 89, 23);
			getContentPane().add(btnCerrar);
		}
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
		ventanaPrincipal.numeroClienteSorpresa=Integer.parseInt(txtNcliente.getText()); 
		ventanaPrincipal.premioSorpresa=txtSor.getText();
	}
}
