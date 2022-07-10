package com.limati.javat_jdbc_demo_distritos;

import java.util.List;

import com.limati.javat_jdbc_demo_distritos.dao.DistritoDAO;
import com.limati.javat_jdbc_demo_distritos.gui.SolucionFrame;
import com.limati.javat_jdbc_demo_distritos.model.Distrito;



public class Main {
	/*
    public static void main(String[] args) {
    	DistritoDAO objDisDao = new DistritoDAO();
		List<Distrito> vDistrito = objDisDao.cargaDistritos();

		for (Distrito distrito : vDistrito) {
			System.out.println(distrito.getCodigo());
		}

	}
*/
    public static void main(String[] args) {
    	
        // Create application frame.
        SolucionFrame frame = new SolucionFrame();

        // Show frame.
        frame.setVisible(true);
    }
}
