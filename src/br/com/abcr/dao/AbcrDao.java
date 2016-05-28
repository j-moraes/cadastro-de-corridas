package br.com.abcr.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.abcr.model.Corredor;

public class AbcrDao {

	private Connection connection;

	public AbcrDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Corredor corredor) {
		String sql = "insert into corredor" + "(nome,cpf,sexo,telefone,dataNascimento,endereco,pessoaContato)"
				+ "values (?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, corredor.getNome());
			stmt.setString(2, corredor.getCpf());
			stmt.setString(3, corredor.getSexo());
			stmt.setString(4, corredor.getTelefone());
			stmt.setDate(5, new Date(corredor.getDataNascimento().getTimeInMillis()));
			stmt.setString(6, corredor.getEndereco());
			stmt.setString(7, corredor.getPessoaContato());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Corredor> getLista() {
		try {
			List<Corredor> corredores = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from corredor");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Corredor corredor = new Corredor();
				corredor.setCpf(rs.getString("cpf"));
				corredor.setNome(rs.getString("nome"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				corredor.setDataNascimento(data);
				corredor.setSexo(rs.getString("sexo"));
				corredor.setTelefone(rs.getString("telefone"));
				corredor.setEndereco(rs.getString("endereco"));
				corredor.setPessoaContato(rs.getString("pessoaContato"));
				corredores.add(corredor);
			}
			stmt.close();
			rs.close();
			return corredores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Corredor corredor) {
		String sql = "update corredores set nome=?, cpf=?,"
				+ "sexo=?, telefone=?, endereco=?, dataNascimento=?, pessoaContato=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, corredor.getNome());
			stmt.setString(2, corredor.getCpf());
			stmt.setString(3, corredor.getSexo());
			stmt.setString(4, corredor.getTelefone());
			stmt.setDate(5, new Date(corredor.getDataNascimento().getTimeInMillis()));
			stmt.setString(6, corredor.getEndereco());
			stmt.setString(7, corredor.getPessoaContato());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Corredor corredor) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from corredores where id=?");
			stmt.setString(1, corredor.getCpf());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
