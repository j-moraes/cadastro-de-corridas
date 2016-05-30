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

import br.com.abcr.model.Corrida;

/**
 * @author jmoraes
 *
 */
public class CorridaDao {
	private Connection connection;

	public CorridaDao() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public void adiciona(Corrida corrida) {
		String sql = "insert into corrida" + "(id,dataRealizacao,start,end,percurso)" + "values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, corrida.getId());
			stmt.setDate(2, new Date(corrida.getDataRealizacao().getTimeInMillis()));
			stmt.setDate(3, new Date(corrida.getStart().getTimeInMillis()));
			stmt.setDate(4, new Date(corrida.getEnd().getTimeInMillis()));
			stmt.setString(5, corrida.getPercurso());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Corrida> getLista() {
		try {
			List<Corrida> dadosCorrida = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from corrida");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Corrida corrida = new Corrida();
				corrida.setId(rs.getString("id"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataRealizacao"));
				corrida.setDataRealizacao(data);
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("start"));
				corrida.setStart(data);
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("end"));
				corrida.setEnd(data);
				corrida.setPercurso(rs.getString("percurso"));
				dadosCorrida.add(corrida);
			}
			stmt.close();
			rs.close();
			return dadosCorrida;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Corrida corrida) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from dadosCorridaid=?");
			stmt.setString(1, corrida.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
