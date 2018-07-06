package Tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listarPerfumes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTextArea txtSL;
	private JButton btnCancelar;
	private JButton btnListar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			listarPerfumes dialog = new listarPerfumes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public listarPerfumes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 186);
		contentPanel.add(scrollPane);
		
		txtSL = new JTextArea();
		scrollPane.setViewportView(txtSL);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(50, 208, 89, 23);
		contentPanel.add(btnCancelar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(165, 208, 95, 23);
		contentPanel.add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(304, 208, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		txtSL.setText("");
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		mostrarLista();
	}
	void mostrarLista () {
		
		txtSL.setText("");
		txtSL.append("LISTA DE PERFUMES DE LA TIENDA");
		//Primer Perfume//
		txtSL.append("\n");
		txtSL.append("\n"+"NOMBRE:\t"+ventanaPrincipal.nombre0);
		txtSL.append("\n"+"PRECIO:\t"+ventanaPrincipal.precio0); 
		txtSL.append("\n"+"CONTENIDO:\t"+ventanaPrincipal.contenido0);
		txtSL.append("\n"+"AÑO:\t"+ventanaPrincipal.año0); 
		txtSL.append("\n"+"CASA:\t"+ventanaPrincipal.casa0);
		//Segundo Perfume//
		txtSL.append("\n");
		txtSL.append("\n"+"NOMBRE:\t"+ventanaPrincipal.nombre1);
		txtSL.append("\n"+"PRECIO:\t"+ventanaPrincipal.precio1); 
		txtSL.append("\n"+"CONTENIDO:\t"+ventanaPrincipal.contenido1);
		txtSL.append("\n"+"AÑO:\t"+ventanaPrincipal.año1); 
		txtSL.append("\n"+"CASA:\t"+ventanaPrincipal.casa1);
		//Tercer Perfume//
		txtSL.append("\n");
		txtSL.append("\n"+"NOMBRE:\t"+ventanaPrincipal.nombre2);
		txtSL.append("\n"+"PRECIO:\t"+ventanaPrincipal.precio2); 
		txtSL.append("\n"+"CONTENIDO:\t"+ventanaPrincipal.contenido2);
		txtSL.append("\n"+"AÑO:\t"+ventanaPrincipal.año2); 
		txtSL.append("\n"+"CASA:\t"+ventanaPrincipal.casa2);
		//cuarto Perfume//
		txtSL.append("\n");
		txtSL.append("\n"+"NOMBRE:\t"+ventanaPrincipal.nombre3);
		txtSL.append("\n"+"PRECIO:\t"+ventanaPrincipal.precio3); 
		txtSL.append("\n"+"CONTENIDO:\t"+ventanaPrincipal.contenido3);
		txtSL.append("\n"+"AÑO:\t"+ventanaPrincipal.año3); 
		txtSL.append("\n"+"CASA:\t"+ventanaPrincipal.casa3);
		//quinto perfume//
		txtSL.append("\n");
		txtSL.append("\n"+"NOMBRE:\t"+ventanaPrincipal.nombre4);
		txtSL.append("\n"+"PRECIO:\t"+ventanaPrincipal.precio4); 
		txtSL.append("\n"+"CONTENIDO:\t"+ventanaPrincipal.contenido4);
		txtSL.append("\n"+"AÑO:\t"+ventanaPrincipal.año4); 
		txtSL.append("\n"+"CASA:\t"+ventanaPrincipal.casa4);
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
}
