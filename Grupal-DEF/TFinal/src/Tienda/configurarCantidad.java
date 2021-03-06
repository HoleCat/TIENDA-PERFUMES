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

public class configurarCantidad extends JDialog implements ActionListener {
	private JButton btnGrabar;
	private JButton btnCerrar;
	private JLabel lblIngreseNuevaCantidad;
	private JTextField txtCanOP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			configurarCantidad dialog = new configurarCantidad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public configurarCantidad() {
		setTitle("Configurar Cantidad Optima");
		setBounds(100, 100, 450, 118);
		getContentPane().setLayout(null);
		
		btnGrabar = new JButton("GRABAR");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnGrabar);
		
		btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 44, 89, 23);
		getContentPane().add(btnCerrar);
		
		lblIngreseNuevaCantidad = new JLabel("INGRESE NUEVA CANTIDAD OPTIMA");
		lblIngreseNuevaCantidad.setBounds(10, 15, 219, 14);
		getContentPane().add(lblIngreseNuevaCantidad);
		
		txtCanOP = new JTextField();
		txtCanOP.setBounds(239, 12, 86, 20);
		getContentPane().add(txtCanOP);
		txtCanOP.setColumns(10);
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
		ventanaPrincipal.cantidadOptima=Integer.parseInt(txtCanOP.getText()); 
	}
}
