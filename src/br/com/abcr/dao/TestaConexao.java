package br.com.abcr.dao;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.List;

import br.com.abcr.model.Corredor;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		List<Corredor> corredores;
		
		System.out.println("Conexão aberta!");
		connection.close();
	}
}
