package com.pblazquez.conexion.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE TABLE clientes (id INT PRIMARY KEY," + "nif VARCHAR(10) NOT NULL,"
				+ "nombre VARCHAR(60) NOT NULL," + "edad VARCHAR(2))";
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/baseDatosPablo", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Tabla creada con éxito");
			conn.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}