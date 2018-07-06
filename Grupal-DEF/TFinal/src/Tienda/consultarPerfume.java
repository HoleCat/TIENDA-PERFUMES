package Tienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class consultarPerfume extends JDialog implements ActionListener, ItemListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNombre;
	private JLabel lblPrecios;
	private JLabel lblContenido;
	private JLabel lblAoDeLanzamiento;
	private JLabel lblCasa;
	private JComboBox cboNombre;
	private JTextField txtPrecio;
	private JTextField txtContenido;
	private JTextField txtAdL;
	private JTextField txtCasa;
	private JButton btnCerrar;
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			consultarPerfume dialog = new consultarPerfume();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public consultarPerfume() {
		setTitle("Consultar Perfume");
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		setBounds(100, 100, 450, 208);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNombre = new JLabel("NOMBRE :");
		lblNombre.setBounds(10, 11, 54, 19);
		contentPanel.add(lblNombre);
		
		lblPrecios = new JLabel("PRECIO (S/) :");
		lblPrecios.setBounds(10, 41, 75, 19);
		contentPanel.add(lblPrecios);
		
		lblContenido = new JLabel("CONTENIDO :");
		lblContenido.setBounds(10, 71, 75, 19);
		contentPanel.add(lblContenido);
		
		lblAoDeLanzamiento = new JLabel("A\u00D1O DE LANZAMIENTO :");
		lblAoDeLanzamiento.setBounds(10, 101, 126, 19);
		contentPanel.add(lblAoDeLanzamiento);
		
		lblCasa = new JLabel("CASA :");
		lblCasa.setBounds(10, 131, 64, 19);
		contentPanel.add(lblCasa);
		
		cboNombre = new JComboBox();
		cboNombre.addItemListener(this);
		cboNombre.setModel(new DefaultComboBoxModel(new String[] {"ALCAZAR", "ALLURE", "AQUA RUSH", "ENVY", "ALAIA"}));
		cboNombre.setBounds(142, 10, 137, 19);
		contentPanel.add(cboNombre);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(142, 40, 137, 19);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.setBounds(142, 70, 137, 19);
		contentPanel.add(txtContenido);
		txtContenido.setColumns(10);
		
		txtAdL = new JTextField();
		txtAdL.setText("");
		txtAdL.setBounds(142, 100, 137, 19);
		contentPanel.add(txtAdL);
		txtAdL.setColumns(10);
		
		txtCasa = new JTextField();
		txtCasa.setBounds(142, 130, 137, 19);
		contentPanel.add(txtCasa);
		txtCasa.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 9, 89, 23);
		contentPanel.add(btnCerrar);
		
		cboNombre.setToolTipText(ventanaPrincipal.nombre0);
		txtPrecio.setText(""+ventanaPrincipal.precio0);
		txtContenido.setText(""+ventanaPrincipal.contenido0);
		txtAdL.setText(""+ventanaPrincipal.a�o0);
		txtCasa.setText(""+ventanaPrincipal.casa0);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(consultarPerfume.class.getResource("/img/PerfumeAlcazar.jpg")));
		lblImage.setBounds(286, 41, 129, 100);
		contentPanel.add(lblImage);
				
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboNombre) {
			itemStateChangedCboNombre(arg0);
		}
	}
	protected void itemStateChangedCboNombre(ItemEvent arg0) {
		int posi,a�o;
		String nombre,casa;
		double contenido,precio;
		
		posi = getPosi();
		nombre = getNombre();
		a�o = getA�o(posi);
		casa = getCasa(posi);
		contenido = getContenido(posi);
		precio = getPrecio(posi);
		mostrarInfoPerfume(a�o,casa,contenido,precio);
		mostrarImagen(posi);
	}
	
	int getPosi() {
		return cboNombre.getSelectedIndex();
	}
	String getNombre() {
		return cboNombre.getSelectedItem().toString();
	}
	double getPrecio(int posi) {
		switch (posi) {
		case 0: return ventanaPrincipal.precio0;
		case 1: return ventanaPrincipal.precio1;
		case 2: return ventanaPrincipal.precio2;
		case 3: return ventanaPrincipal.precio3;
		default: return ventanaPrincipal.precio4;
		}
	}
	int getA�o(int posi) {
		switch (posi) {
		case 0: return ventanaPrincipal.a�o0;
		case 1: return ventanaPrincipal.a�o1;
		case 2: return ventanaPrincipal.a�o2;
		case 3: return ventanaPrincipal.a�o3;
		default: return ventanaPrincipal.a�o4;
		}
	}
	String getCasa(int posi) {
		switch (posi) {
		case 0: return ventanaPrincipal.casa0;
		case 1: return ventanaPrincipal.casa1;
		case 2: return ventanaPrincipal.casa2;
		case 3: return ventanaPrincipal.casa3;
		default: return ventanaPrincipal.casa4;
		}
	}
	double getContenido(int posi) {
		switch (posi) {
		case 0: return ventanaPrincipal.contenido0;
		case 1: return ventanaPrincipal.contenido1;
		case 2: return ventanaPrincipal.contenido2;
		case 3: return ventanaPrincipal.contenido3;
		default: return ventanaPrincipal.contenido4;
		}
	}
	void mostrarInfoPerfume(int a�o, String casa, double contenido, double precio)
	{
	   txtPrecio.setText(""+precio);
	   txtContenido.setText(""+contenido);
	   txtAdL.setText(""+a�o);
	   txtCasa.setText(""+casa);   
	}
	void mostrarImagen(int posi) {
		switch (posi) {
		case 0: lblImage.setIcon(new ImageIcon(vender.class.getResource("/img/PerfumeAlcazar.jpg"))); break;
		case 1: lblImage.setIcon(new ImageIcon(vender.class.getResource("/img/PerfumeAllure.jpg"))); break;
		case 2: lblImage.setIcon(new ImageIcon(vender.class.getResource("/img/PerfumeAquaRush.jpg"))); break;
		case 3: lblImage.setIcon(new ImageIcon(vender.class.getResource("/img/PerfumeEnvy.jpg"))); break;
		default: lblImage.setIcon(new ImageIcon(vender.class.getResource("/img/PerfumeAlaia.jpg")));
		}
	}
}
