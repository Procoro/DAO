package com.pblazquez.conexion.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;

		String sql = "INSERT INTO clientes (id,nif,nombre,edad) VALUES (1,'777777','Pablo','22')";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/baseDatosPablo", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Datos insertados en la tabla clientes");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}