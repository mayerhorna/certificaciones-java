package com.limati.javat_jdbc_demo_distritos.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.limati.javat_jdbc_demo_distritos.dao.DistritoDAO;
import com.limati.javat_jdbc_demo_distritos.model.Distrito;

public class PNL_Nuevo_Distrito extends JPanel implements ActionListener {
	JLabel lblCodigo = new JLabel("Codigo");
	JLabel lblNombre = new JLabel("Nombre");
	JLabel lblVendedor = new JLabel("Vendedor");
	JTextField txtCodigo = new JTextField();
	JTextField txtNombre = new JTextField();
	JTextField txtVendedor = new JTextField();
	JButton btnAgregar = new JButton("Guardar");

	public PNL_Nuevo_Distrito() {
		setLayout(null);
		lblCodigo.setBounds(20, 20, 80, 25);
		lblNombre.setBounds(20, 50, 80, 25);
		lblVendedor.setBounds(20, 80, 80, 25);

		txtCodigo.setBounds(80, 20, 80, 25);
		txtNombre.setBounds(80, 50, 80, 25);
		txtVendedor.setBounds(80, 80, 80, 25);
		btnAgregar.setBounds(40, 110, 80, 25);

		btnAgregar.addActionListener(this);

		add(lblCodigo);
		add(lblNombre);
		add(lblVendedor);
		add(txtCodigo);
		add(txtNombre);
		add(txtVendedor);
		add(btnAgregar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAgregar) {
			try {

				DistritoDAO objDisDao = new DistritoDAO();
				Distrito distrito = new Distrito();
				distrito.setCodigo(txtCodigo.getText());
				distrito.setNombre(txtNombre.getText());
				distrito.setVendedor(txtVendedor.getText());
				objDisDao.agregaDistrito(distrito);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
