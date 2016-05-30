/**
 * 
 */
package br.com.abcr.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.abcr.model.DesempenhoCorredor;

/**
 * @author jmoraes
 *
 */
public class DesempenhoCorredorDao {
	private Connection connection;

	public DesempenhoCorredorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(DesempenhoCorredor desempenhoCorredor) {
		String sql = "insert into desempenhoCorredor"
				+ "(idCorrida,nome,tempoChegada,corridaCompleta,corridaIncompleta)" + "values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, desempenhoCorredor.getIdCorrida());
			stmt.setString(2, desempenhoCorredor.getNome());
			stmt.setDate(3, new Date(desempenhoCorredor.getTempoChegada().getTimeInMillis()));
			stmt.setString(4, desempenhoCorredor.getCorridaCompleta());
			stmt.setString(5, desempenhoCorredor.getCorridaIncompleta());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<DesempenhoCorredor> getLista() {
		try {
			List<DesempenhoCorredor> desempenhoCorrida = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from desempenhoCorredor");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				DesempenhoCorredor desempenho = new DesempenhoCorredor();
				desempenho.setIdCorrida(rs.getString("idCorrida"));
				desempenho.setNome(rs.getString("nome"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("tempoChegada"));
				desempenho.setTempoChegada(data);
				desempenho.setCorridaCompleta(rs.getString("corridaCompleta"));
				desempenho.setCorridaIncompleta(rs.getString("corridaIncompleta"));
				desempenhoCorrida.add(desempenho);
			}
			stmt.close();
			rs.close();
			return desempenhoCorrida;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(DesempenhoCorredor desempenhoCorredor) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from desempenhoCorrida id=?");
			stmt.setString(1, desempenhoCorredor.getIdCorrida());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

}
