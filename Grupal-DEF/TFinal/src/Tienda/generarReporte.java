package Tienda;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class generarReporte extends JDialog implements ItemListener, ActionListener {
	private JLabel lblTipoDeReporte;
	private JComboBox cboReporte;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generarReporte dialog = new generarReporte();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public generarReporte() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblTipoDeReporte = new JLabel("Tipo de Reporte :");
		lblTipoDeReporte.setBounds(10, 24, 101, 14);
		getContentPane().add(lblTipoDeReporte);
		
		cboReporte = new JComboBox();
		cboReporte.addItemListener(this);
		cboReporte.setModel(new DefaultComboBoxModel(new String[] {"", "Ventas por perfume", "Perfumes con venta optima", "Precios con relacion al promedio", "Promedios , maximos y minimos"}));
		cboReporte.setBounds(110, 21, 213, 20);
		getContentPane().add(cboReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 20, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 414, 159);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboReporte) {
			itemStateChangedCboReporte(e);
		}
	}
	protected void itemStateChangedCboReporte(ItemEvent e) {
		int posi;
		int can;
		double total;

		total = getTotalImporte();
		posi = getPosi();
		
		switch(posi)
		{
		case 0 :break;
		case 1 : MostrarVentasPorProducto(total);break;
		case 2 : MostrarPerfumesConVentaOptima(); break;
		case 3 : PreciosEnRelacionAlPromedio(); break;
		default: PromediosMinimosYMaximos(); break;
		}
	}
	int getPosi() {
		return cboReporte.getSelectedIndex();
	}
	void MostrarVentasPorProducto(double total) {
		txtS.setText("");
		txtS.append("\n");
		txtS.append("Ventas por perfume");
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre0);
		txtS.append("\nCantidad de Ventas"+"\t\t:"+ vender.covM0);
		txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM0);
		txtS.append("\nImporte Total Acumulado"+ "\t\t:"+vender.acu0);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre1);
		txtS.append("\nCantidad de Ventas"+"\t\t:"+ vender.covM1);
		txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM1);
		txtS.append("\nImporte Total Acumulado"+ "\t\t:"+vender.acu1);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre2);
		txtS.append("\nCantidad de Ventas"+"\t\t:"+ vender.covM2);
		txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM2);
		txtS.append("\nImporte Total Acumulado"+ "\t\t:"+vender.acu2);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre3);
		txtS.append("\nCantidad de Ventas"+"\t\t:"+ vender.covM3);
		txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM3);
		txtS.append("\nImporte Total Acumulado"+ "\t\t:"+vender.acu3);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre4);
		txtS.append("\nCantidad de Ventas"+"\t\t:"+ vender.covM4);
		txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM4);
		txtS.append("\nImporte Total Acumulado"+ "\t\t:"+vender.acu4);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("TOTAL DE IMPORTE ACUMULADO : "+ total);
	}
	Double getTotalImporte () {
		return vender.acu0 + vender.acu1 + vender.acu2 + vender.acu3 + vender.acu4;
	}
	void PreciosEnRelacionAlPromedio() {
		double promedio = (ventanaPrincipal.precio0+ventanaPrincipal.precio1+ventanaPrincipal.precio2+ventanaPrincipal.precio3+ventanaPrincipal.precio4)/5;
		txtS.setText("");
		txtS.append("PreciosEnRelacionAlPromedio");
		txtS.append("\n");
		txtS.append("\n");
		if (ventanaPrincipal.precio0>promedio) {
			txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre0);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio0+" (Mayor al promedio)");}
			else
			{txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre0);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio0+" (Menor al promedio)");}
		txtS.append("\n");
		if (ventanaPrincipal.precio1>promedio) {
			txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre1);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio1+" (Mayor al promedio)");}
			else
			{txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre1);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio1+" (Menor al promedio)");}
		txtS.append("\n");
		if (ventanaPrincipal.precio2>promedio) {
			txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre2);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio2+" (Mayor al promedio)");}
			else
			{txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre2);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio2+" (Menor al promedio)");}
		txtS.append("\n");
		if (ventanaPrincipal.precio3>promedio) {
			txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre3);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio3+" (Mayor al promedio)");}
			else
			{txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre3);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio3+" (Menor al promedio)");}
		txtS.append("\n");
		if (ventanaPrincipal.precio4>promedio) {
			txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre4);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio4+" (Mayor al promedio)");}
			else
			{txtS.append("\nNOMBRE: "+ ventanaPrincipal.nombre4);
			txtS.append("\nPrecio Unitario"+"\t:"+ ventanaPrincipal.precio4+" (Menor al promedio)");}
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("El precio promedio es :"+promedio);
	}
	void MostrarPerfumesConVentaOptima() {
		int faltan=0;
		
		txtS.setText("");
		txtS.append("\n");
		txtS.append("PRODUCTOS QUE NO ALCANZAN LA CANTIDAD OPTIMA :\n");
		if (vender.couM0<ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre0);
			faltan=ventanaPrincipal.cantidadOptima-vender.couM0;
			txtS.append("\nUnidades faltantes para cantidad Optima vendida :"+"\t:"+ faltan);}
		else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM1<ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre1);
			faltan=ventanaPrincipal.cantidadOptima-vender.couM1;
			txtS.append("\nUnidades faltantes para cantidad Optima vendida :"+"\t:"+ faltan);}
			else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM2<ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre2);
			faltan=ventanaPrincipal.cantidadOptima-vender.couM2;
			txtS.append("\nUnidades faltantes para cantidad Optima vendida :"+"\t:"+ faltan);}
			else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM3<ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre3);
			faltan=ventanaPrincipal.cantidadOptima-vender.couM3;
			txtS.append("\nUnidades faltantes para cantidad Optima vendida :"+"\t:"+ faltan);}
			else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM4<ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre4);
			faltan=ventanaPrincipal.cantidadOptima-vender.couM4;
			txtS.append("\nUnidades faltantes para cantidad Optima vendida :"+"\t:"+ faltan);}
			else {txtS.append("");}
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("PRODUCTOS QUE ALCANZAN LA CANTIDAD OPTIMA :\n");
		if (vender.couM0>=ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre0);
			txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM0);}
		else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM1>=ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre1);
			txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM1);}
			else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM2>=ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre2);
			txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM2);}
			else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM3>=ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre3);
			txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM3);}
			else {txtS.append("");}
		txtS.append("\n");
		if (vender.couM4>=ventanaPrincipal.cantidadOptima) {
			txtS.append("\nNOMBRE"+"\t\t\t:"+ ventanaPrincipal.nombre4);
			txtS.append("\nCantidad total de unidades vendidas"+"\t:"+ vender.couM4);}
			else {txtS.append("");}
		txtS.append("\n");
	}
	void PromediosMinimosYMaximos() {
		txtS.setText("");
		txtS.append("PROMEDIO, MAXIMOS Y MINIMOS");
		txtS.append("\n");
		txtS.append("\n");
		//precio promedio
		double promedio = (ventanaPrincipal.precio0+ventanaPrincipal.precio1+ventanaPrincipal.precio2+ventanaPrincipal.precio3+ventanaPrincipal.precio4)/5;
		txtS.append("El precio promedio es :"+promedio);
		//precio maximo
		if (ventanaPrincipal.precio0>ventanaPrincipal.precio1 && ventanaPrincipal.precio0>ventanaPrincipal.precio2 && ventanaPrincipal.precio0>ventanaPrincipal.precio3 && ventanaPrincipal.precio0>ventanaPrincipal.precio4)
			txtS.append("\nPrecio Maximo: "+ "S/" + ventanaPrincipal.precio0);
		else if (ventanaPrincipal.precio1>ventanaPrincipal.precio0 && ventanaPrincipal.precio1>ventanaPrincipal.precio2 && ventanaPrincipal.precio1>ventanaPrincipal.precio3 && ventanaPrincipal.precio1>ventanaPrincipal.precio4)
			txtS.append("\nPrecio Maximo: "+ "S/" + ventanaPrincipal.precio1);
		else if (ventanaPrincipal.precio2>ventanaPrincipal.precio0 && ventanaPrincipal.precio2>ventanaPrincipal.precio1 && ventanaPrincipal.precio2>ventanaPrincipal.precio3 && ventanaPrincipal.precio2>ventanaPrincipal.precio4)
			txtS.append("\nPrecio Maximo: "+ "S/" + ventanaPrincipal.precio2);
		else if (ventanaPrincipal.precio3>ventanaPrincipal.precio0 && ventanaPrincipal.precio3>ventanaPrincipal.precio1 && ventanaPrincipal.precio3>ventanaPrincipal.precio2 && ventanaPrincipal.precio3>ventanaPrincipal.precio4)
			txtS.append("\nPrecio Maximo: "+ "S/" + ventanaPrincipal.precio3);
		else if (ventanaPrincipal.precio4>ventanaPrincipal.precio0 && ventanaPrincipal.precio4>ventanaPrincipal.precio1 && ventanaPrincipal.precio4>ventanaPrincipal.precio2 && ventanaPrincipal.precio4>ventanaPrincipal.precio3)
			txtS.append("\nPrecio Maximo: "+ "S/" + ventanaPrincipal.precio4);
		else txtS.append("");
		//precio minimo
		if (ventanaPrincipal.precio0<ventanaPrincipal.precio1 && ventanaPrincipal.precio0<ventanaPrincipal.precio2 && ventanaPrincipal.precio0<ventanaPrincipal.precio3 && ventanaPrincipal.precio0<ventanaPrincipal.precio4)
			txtS.append("\nPrecio Minimo: "+ "S/" + ventanaPrincipal.precio0);
		else if (ventanaPrincipal.precio1<ventanaPrincipal.precio0 && ventanaPrincipal.precio1<ventanaPrincipal.precio2 && ventanaPrincipal.precio1<ventanaPrincipal.precio3 && ventanaPrincipal.precio1<ventanaPrincipal.precio4)
			txtS.append("\nPrecio Minimo: "+ "S/" + ventanaPrincipal.precio1);
		else if (ventanaPrincipal.precio2<ventanaPrincipal.precio0 && ventanaPrincipal.precio2<ventanaPrincipal.precio1 && ventanaPrincipal.precio2<ventanaPrincipal.precio3 && ventanaPrincipal.precio2<ventanaPrincipal.precio4)
			txtS.append("\nPrecio Minimo: "+ "S/" + ventanaPrincipal.precio2);
		else if (ventanaPrincipal.precio3<ventanaPrincipal.precio0 && ventanaPrincipal.precio3<ventanaPrincipal.precio1 && ventanaPrincipal.precio3<ventanaPrincipal.precio2 && ventanaPrincipal.precio3<ventanaPrincipal.precio4)
			txtS.append("\nPrecio Minimo: "+ "S/" + ventanaPrincipal.precio3);
		else if (ventanaPrincipal.precio4<ventanaPrincipal.precio0 && ventanaPrincipal.precio4<ventanaPrincipal.precio1 && ventanaPrincipal.precio4<ventanaPrincipal.precio2 && ventanaPrincipal.precio4<ventanaPrincipal.precio3)
			txtS.append("\nPrecio Minimo: "+ "S/" + ventanaPrincipal.precio4);
		else txtS.append("");
		txtS.append("\n");
		txtS.append("\n");
		//precio promedio
		double promedioContenidos = (ventanaPrincipal.contenido0+ventanaPrincipal.contenido1+ventanaPrincipal.contenido2+ventanaPrincipal.contenido3+ventanaPrincipal.contenido4)/5;
		txtS.append("El contenido promedio es :"+promedioContenidos);
		//contenido maximo
		if (ventanaPrincipal.contenido0>ventanaPrincipal.contenido1 && ventanaPrincipal.contenido0>ventanaPrincipal.contenido2 && ventanaPrincipal.contenido0>ventanaPrincipal.contenido3 && ventanaPrincipal.contenido0>ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Maximo: "+ ventanaPrincipal.contenido0 + "ml");
		else if (ventanaPrincipal.contenido1>ventanaPrincipal.contenido0 && ventanaPrincipal.contenido1>ventanaPrincipal.contenido2 && ventanaPrincipal.contenido1>ventanaPrincipal.contenido3 && ventanaPrincipal.contenido1>ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Maximo: "+ ventanaPrincipal.contenido1+ "ml");
		else if (ventanaPrincipal.contenido2>ventanaPrincipal.contenido0 && ventanaPrincipal.contenido2>ventanaPrincipal.contenido1 && ventanaPrincipal.contenido2>ventanaPrincipal.contenido3 && ventanaPrincipal.contenido2>ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Maximo: "+ ventanaPrincipal.contenido2+ "ml");
		else if (ventanaPrincipal.contenido3>ventanaPrincipal.contenido0 && ventanaPrincipal.contenido3>ventanaPrincipal.contenido1 && ventanaPrincipal.contenido3>ventanaPrincipal.contenido2 && ventanaPrincipal.contenido3>ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Maximo: "+ ventanaPrincipal.contenido3+ "ml");
		else if (ventanaPrincipal.contenido4>ventanaPrincipal.contenido0 && ventanaPrincipal.contenido4>ventanaPrincipal.contenido1 && ventanaPrincipal.contenido4>ventanaPrincipal.contenido2 && ventanaPrincipal.contenido4>ventanaPrincipal.contenido3)
			txtS.append("\ncontenido Maximo: "+ ventanaPrincipal.contenido4+ "ml");
		else txtS.append("");
		//precio minimo
		if (ventanaPrincipal.contenido0<ventanaPrincipal.contenido1 && ventanaPrincipal.contenido0<ventanaPrincipal.contenido2 && ventanaPrincipal.contenido0<ventanaPrincipal.contenido3 && ventanaPrincipal.contenido0<ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Minimo: "+ ventanaPrincipal.contenido0+ "ml");
		else if (ventanaPrincipal.contenido1<ventanaPrincipal.contenido0 && ventanaPrincipal.contenido1<ventanaPrincipal.contenido2 && ventanaPrincipal.contenido1<ventanaPrincipal.contenido3 && ventanaPrincipal.contenido1<ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Minimo: "+ ventanaPrincipal.contenido1+ "ml");
		else if (ventanaPrincipal.contenido2<ventanaPrincipal.contenido0 && ventanaPrincipal.contenido2<ventanaPrincipal.contenido1 && ventanaPrincipal.contenido2<ventanaPrincipal.contenido3 && ventanaPrincipal.contenido2<ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Minimo: "+ ventanaPrincipal.contenido2+ "ml");
		else if (ventanaPrincipal.contenido3<ventanaPrincipal.contenido0 && ventanaPrincipal.contenido3<ventanaPrincipal.contenido1 && ventanaPrincipal.contenido3<ventanaPrincipal.contenido2 && ventanaPrincipal.contenido3<ventanaPrincipal.contenido4)
			txtS.append("\ncontenido Minimo: "+ ventanaPrincipal.contenido3+ "ml");
		else if (ventanaPrincipal.contenido4<ventanaPrincipal.contenido0 && ventanaPrincipal.contenido4<ventanaPrincipal.contenido1 && ventanaPrincipal.contenido4<ventanaPrincipal.contenido2 && ventanaPrincipal.contenido4<ventanaPrincipal.contenido3)
			txtS.append("\ncontenido Minimo: "+ ventanaPrincipal.contenido4+ "ml");
		else txtS.append("");
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


