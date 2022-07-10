package com.limati.javat_jdbc_demo_distritos.gui;

import javax.swing.*;
import java.awt.Color;

public class Escritorio extends JDesktopPane {
	
	JInternalFrame v1 = new JInternalFrame("Listar distrito",true,true,true,true);
	JInternalFrame v2 = new JInternalFrame("Agregar distrito",true,true,true,true);

	public Escritorio() {
		setBackground(Color.orange);
		
		v1.setLocation(40,40);
		v1.setSize(370,300);
		v1.add(new PNL_Mostrar_Distrito());
		v1.show();
		add(v1);
		
		v2.setLocation(440,40);
		v2.setSize(270,300);
		v2.add(new PNL_Nuevo_Distrito());
		v2.show();
		add(v2);
		
	}	
}
