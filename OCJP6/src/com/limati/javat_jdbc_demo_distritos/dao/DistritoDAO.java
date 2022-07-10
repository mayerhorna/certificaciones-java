package com.limati.javat_jdbc_demo_distritos.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.limati.javat_jdbc_demo_distritos.model.Distrito;
import com.limati.javat_jdbc_demo_distritos.util.DBConn;

public class DistritoDAO {

	private Connection conn;
	private Statement stm;
	public List<Distrito> distritos = new ArrayList<Distrito>();

	public DistritoDAO() {
		conn = DBConn.getConnection();
		try {
			stm = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// buscar distrito por codigo
	public Distrito buscar(String codigo) {
		return null;
	}

	// agregar nuevo distrito
	public void agregaDistrito(Distrito distrito) {
		/*String SQL = "insert into tb_distrito(Cod_dis,Nom_dis,Cod_ven )  values('" + distrito.getCodigo()
				+ "','" + distrito.getNombre() + "','" + distrito.getVendedor()
				+ "')";
		*/		
		//String SQL = "insert into tb_distrito(Cod_dis,Nom_dis,Cod_ven ) values (?,?,?)";
		StringBuilder sb = new StringBuilder();
		sb.append("insert into tb_distrito(Cod_dis,Nom_dis,Cod_ven ) ");
		sb.append("values (?,?,?)");
		try {
			PreparedStatement pstm = conn.prepareStatement(sb.toString());
			pstm.setString(1, distrito.getCodigo());
			pstm.setString(2, distrito.getNombre());
			pstm.setString(3, distrito.getVendedor());			
			//stm.executeUpdate(SQL);
			int nr = pstm.executeUpdate();
			if(nr == 1){
				System.out.println();
			}else{
				
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// eliminar distrito
	public void eliminaDistrito(String codigo) {

	}

	// eliminar distrito
	public void eliminaDistrito(String codigo, String nombre) {

	}

	// actualizar distrito
	public void actualizaDistrito(String codigo, String nombre, String vendedor) {

	}

	// Cargar distritos
	public List cargaDistritos() {
		// Ejecutar Sentencia.
		ResultSet rst;
		try {
			rst = stm.executeQuery("SELECT Cod_dis as codigo, Nom_dis, Cod_ven FROM Tb_Distrito");
			while (rst.next()) {
				// Agrego el registro a los datos.
				distritos.add(
						new Distrito(
						rst.getString("codigo"), 
						rst.getString("Nom_dis"),
						rst.getString("Cod_ven")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return distritos;
	}

	// Obtener distrito del Vector de Distritos
	public Distrito obtener(int ind) {
		return distritos.get(ind);
	}

}
