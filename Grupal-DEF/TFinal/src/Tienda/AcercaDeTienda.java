package Tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercaDeTienda extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblAutores;
	private JLabel lblJosephIsacMelgarejo;
	private JLabel lblJorgeHospinalFlores;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaDeTienda dialog = new AcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaDeTienda() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTienda = new JLabel("TIENDA 1.0");
			lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
			lblTienda.setFont(new Font("Yu Gothic", Font.BOLD, 25));
			lblTienda.setBounds(143, 28, 147, 42);
			contentPanel.add(lblTienda);
		}
		
		lblAutores = new JLabel("AUTORES");
		lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 15));
		lblAutores.setBounds(177, 81, 80, 14);
		contentPanel.add(lblAutores);
		
		lblJosephIsacMelgarejo = new JLabel("Joseph Isac Melgarejo Reyes");
		lblJosephIsacMelgarejo.setHorizontalAlignment(SwingConstants.CENTER);
		lblJosephIsacMelgarejo.setBounds(132, 123, 169, 14);
		contentPanel.add(lblJosephIsacMelgarejo);
		
		lblJorgeHospinalFlores = new JLabel("Jorge Hospinal Flores");
		lblJorgeHospinalFlores.setHorizontalAlignment(SwingConstants.CENTER);
		lblJorgeHospinalFlores.setBounds(143, 141, 147, 14);
		contentPanel.add(lblJorgeHospinalFlores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(172, 216, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
