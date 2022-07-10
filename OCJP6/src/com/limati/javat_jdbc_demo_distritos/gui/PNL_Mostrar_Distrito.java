package com.limati.javat_jdbc_demo_distritos.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.limati.javat_jdbc_demo_distritos.dao.DistritoDAO;
import com.limati.javat_jdbc_demo_distritos.model.Distrito;
/*
class EventoBoton implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("clic en boton");
	}
}
*/
public class PNL_Mostrar_Distrito extends JPanel implements ActionListener {

	//JButton btnMostrar = new JButton("Mostrar Distritos");
	JButton btnMostrar2 = new JButton("Mostrar Distritos 2");
	JTextArea txtConsulta = new JTextArea();
	JScrollPane jsp = new JScrollPane(txtConsulta);

	public PNL_Mostrar_Distrito() {
		setLayout(null);
		btnMostrar2.setBounds(20, 20, 320, 24);
		//btnMostrar2.addActionListener(this);
		btnMostrar2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("clic en boton anonimo");
			}
		});
		add(btnMostrar2);

		jsp.setBounds(20, 50, 320, 200);
		add(jsp);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
