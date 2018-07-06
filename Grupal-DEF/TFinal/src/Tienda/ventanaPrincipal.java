package Tienda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ventanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracin;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarPerfume;
	private JMenuItem mntmModificarPerfume;
	private JMenuItem mntmListarPerfumes;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenuItem mntmAcercaDeTienda;
	
	//variables de mrd//
	//Primer Perfume//
	public static String nombre0 = "ALCAZAR"; 
	public static double precio0 = 135.0; 
	public static double contenido0 = 100;
	public static int a�o0 = 2014; 
	public static String casa0 = "Ted Lapidus";
	//Segundo Perfume//
	public static String nombre1 = "ALLURE"; 
	public static double precio1 = 390.0; 
	public static double contenido1 = 50.0; 
	public static int a�o1 = 1998; 
	public static String casa1 = "Chanel";
	//Tercer Perfume//
	public static String nombre2 = "AQUA RUSH"; 
	public static double precio2 = 62.0; 
	public static double contenido2 = 90.0; 
	public static int a�o2 = 2012; 
	public static String casa2 = "Nautica";
	//cuarto Perfume//
	public static String nombre3 = "ENVY"; 
	public static double precio3 = 510.0; 
	public static double contenido3 = 7.5; 
	public static int a�o3 = 1997; 
	public static String casa3 = "Gucci";
	//quinto perfume//
	public static String nombre4 = "ALAIA";
	public static double precio4 = 210.0; 
	public static double contenido4 = 30.0; 
	public static int a�o4 = 2015; 
	public static String casa4 = "Azzedine";
	//Porcentaje de descuento//
	public static double porcentaje1 = 4.0; 
	public static double porcentaje2 = 5.5; 
	public static double porcentaje3 = 7.0; 
	public static double porcentaje4 = 8.5; 
	//cantidad optima//
	public static int cantidadOptima = 40; 
	// Importe a pagar m�nimo para obtener el obsequio//
	public static int importeMinimoObsequiable = 750; 
	// Obsequio por importe m�nimo 
	public static String obsequio = "Billetera"; 
	// N�mero de cliente que recibe el premio sorpresa 
	public static int numeroClienteSorpresa = 5; 
	// Premio sorpresa 
	public static String premioSorpresa = "Un polo"; 
	private JLabel label;
	 
	//
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setResizable(false);
				
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarPerfume = new JMenuItem("Consultar Perfume");
		mntmConsultarPerfume.addActionListener(this);
		mnMantenimiento.add(mntmConsultarPerfume);
		
		mntmModificarPerfume = new JMenuItem("Modificar Perfume");
		mntmModificarPerfume.addActionListener(this);
		mnMantenimiento.add(mntmModificarPerfume);
		
		mntmListarPerfumes = new JMenuItem("Listar Perfumes");
		mntmListarPerfumes.addActionListener(this);
		mnMantenimiento.add(mntmListarPerfumes);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar Obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de perfumes vendidos ");
		mntmConfigurarCantidadptima.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda ");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/img/Perfumes.jpg")));
		label.setBounds(0, 0, 434, 240);
		contentPane.add(label);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmConfigurarCantidadptima) {
			actionPerformedMntmConfigurarCantidadptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
		if (arg0.getSource() == mntmModificarPerfume) {
			actionPerformedMntmModificarPerfume(arg0);
		}
		if (arg0.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListarPerfumes) {
			actionPerformedMntmListarPerfumes(arg0);
		}
		if (arg0.getSource() == mntmConsultarPerfume) {
			actionPerformedMntmConsultarPerfume(arg0);
		}
	}
	protected void actionPerformedMntmConsultarPerfume(ActionEvent arg0) {
		consultarPerfume Consultar = new consultarPerfume();
        Consultar.setModal(true);
        Consultar.setVisible(true);
        Consultar.setLocation(0,0);
	}
	protected void actionPerformedMntmListarPerfumes(ActionEvent arg0) {
		listarPerfumes Listar = new listarPerfumes();
        Listar.setModal(true);
        Listar.setVisible(true);
        Listar.setLocation(0,0);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		vender venta = new vender();
        venta.setModal(true);
        venta.setVisible(true);
        venta.setLocation(0,0);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		generarReporte reporte = new generarReporte();
		reporte.setModal(true);
		reporte.setVisible(true);
		reporte.setLocation(0,0);
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		AcercaDeTienda ayuda = new AcercaDeTienda();
		ayuda.setModal(true);
		ayuda.setVisible(true);
		ayuda.setLocation(0,0);
	}

	protected void actionPerformedMntmModificarPerfume(ActionEvent arg0) {
		modificarPerfume modificar = new modificarPerfume();
		modificar.setModal(true);
		modificar.setVisible(true);
		modificar.setLocation(0,0);
	}
	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent arg0) {
		configurarCantidad modificarCan = new configurarCantidad();
		modificarCan.setModal(true);
		modificarCan.setVisible(true);
		modificarCan.setLocation(0,0);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		configurarDescuentos modificarDes = new configurarDescuentos();
		modificarDes.setModal(true);
		modificarDes.setVisible(true);
		modificarDes.setLocation(0,0);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		configurarObsequio modificarObs = new configurarObsequio();
		modificarObs.setModal(true);
		modificarObs.setVisible(true);
		modificarObs.setLocation(0,0);
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		configurarPremio modificarPre = new configurarPremio();
		modificarPre.setModal(true);
		modificarPre.setVisible(true);
		modificarPre.setLocation(0,0);
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		System.exit(0);
	}
}
