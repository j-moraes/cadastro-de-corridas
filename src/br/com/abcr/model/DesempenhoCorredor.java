/**
 * 
 */
package br.com.abcr.model;

import java.util.Calendar;

/**
 * @author jmoraes
 *
 */
public class DesempenhoCorredor {
	private String idCorrida;
	private String nome;
	private Calendar tempoChegada;
	private String corridaCompleta;
	private String corridaIncompleta;

	/**
	 * @return the idCorrida
	 */
	public String getIdCorrida() {
		return idCorrida;
	}

	/**
	 * @param idCorrida
	 *            the idCorrida to set
	 */
	public void setIdCorrida(String idCorrida) {
		this.idCorrida = idCorrida;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tempoChegada
	 */
	public Calendar getTempoChegada() {
		return tempoChegada;
	}

	/**
	 * @param tempoChegada
	 *            the tempoChegada to set
	 */
	public void setTempoChegada(Calendar tempoChegada) {
		this.tempoChegada = tempoChegada;
	}

	/**
	 * @return the corridaCompleta
	 */
	public String getCorridaCompleta() {
		return corridaCompleta;
	}

	/**
	 * @param corridaCompleta
	 *            the corridaCompleta to set
	 */
	public void setCorridaCompleta(String corridaCompleta) {
		this.corridaCompleta = corridaCompleta;
	}

	/**
	 * @return the corridaIncompleta
	 */
	public String getCorridaIncompleta() {
		return corridaIncompleta;
	}

	/**
	 * @param corridaIncompleta
	 *            the corridaIncompleta to set
	 */
	public void setCorridaIncompleta(String corridaIncompleta) {
		this.corridaIncompleta = corridaIncompleta;
	}

}
