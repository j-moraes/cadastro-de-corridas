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

import br.com.abcr.model.AcompanhamentoCorredor;

/**
 * @author jmoraes
 *
 */
public class AcompanhamentoCorredorDao {
	private Connection connection;

	public AcompanhamentoCorredorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(AcompanhamentoCorredor acompanhamentoCorredor) {
		String sql = "insert into corredor"
				+ "(id,dataInsercao,colesterol,triglicerideos,glicose,pressaoArterial,altura,peso,batimentosCardiacosRepouso)"
				+ "values (?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, acompanhamentoCorredor.getId());
			stmt.setDate(2, new Date(acompanhamentoCorredor.getDataInsercao().getTimeInMillis()));
			stmt.setString(3, acompanhamentoCorredor.getColesterol());
			stmt.setString(4, acompanhamentoCorredor.getTriglicerideos());
			stmt.setString(5, acompanhamentoCorredor.getTriglicerideos());
			stmt.setString(6, acompanhamentoCorredor.getGlicose());
			stmt.setString(7, acompanhamentoCorredor.getPressaoArterial());
			stmt.setString(8, acompanhamentoCorredor.getAltura());
			stmt.setString(9, acompanhamentoCorredor.getPeso());
			stmt.setString(10, acompanhamentoCorredor.getBatimentosCardiacosRepouso());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<AcompanhamentoCorredor> getLista() {
		try {
		List<AcompanhamentoCorredor> dadosSaude = new ArrayList<>();
		PreparedStatement stmt = this.connection.prepareStatement("select * from acompanhamentoCorredor");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			AcompanhamentoCorredor acompanhamento = new AcompanhamentoCorredor();
			acompanhamento.setId(rs.getString("id"));
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataInsercao"));
			acompanhamento.setDataInsercao(data);
			acompanhamento.setColesterol(rs.getString("colesterol"));
			acompanhamento.setTriglicerideos(rs.getString("triglicerideos"));
			acompanhamento.setGlicose(rs.getString("glicose"));
			acompanhamento.setPressaoArterial(rs.getString("pressaoArterial"));
			acompanhamento.setAltura(rs.getString("altura"));
			acompanhamento.setPeso(rs.getString("peso"));
			acompanhamento.setBatimentosCardiacosRepouso(rs.getString("batimentosCardiacosRepouso"));
			dadosSaude.add(acompanhamento);
		}
		stmt.close();
		rs.close();
		return dadosSaude;
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}

	}

	public void altera(AcompanhamentoCorredor acompanhamentoCorredor) {
		String sql = "update acompanhamentoCorredor set id=?, dataInsercao=?,"
				+ "colesterol=?, triglicerideos=?, glicose=?, pressaoArterial=?, altura=?, peso=?, batimentosCardiacosRepouso=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, acompanhamentoCorredor.getId());
			stmt.setDate(2, new Date(acompanhamentoCorredor.getDataInsercao().getTimeInMillis()));
			stmt.setString(3, acompanhamentoCorredor.getColesterol());
			stmt.setString(4, acompanhamentoCorredor.getTriglicerideos());
			stmt.setString(5, acompanhamentoCorredor.getTriglicerideos());
			stmt.setString(6, acompanhamentoCorredor.getGlicose());
			stmt.setString(7, acompanhamentoCorredor.getPressaoArterial());
			stmt.setString(8, acompanhamentoCorredor.getAltura());
			stmt.setString(9, acompanhamentoCorredor.getPeso());
			stmt.setString(10, acompanhamentoCorredor.getBatimentosCardiacosRepouso());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(AcompanhamentoCorredor acompanhamentoCorredor) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from dadosSaude where id=?");
			stmt.setString(1, acompanhamentoCorredor.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
