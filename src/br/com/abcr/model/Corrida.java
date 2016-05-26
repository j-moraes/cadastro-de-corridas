/**
 * 
 */
package br.com.abcr.model;

import java.util.Date;

/**
 * @author jmoraes
 *
 */
public class Corrida {
	private Date dataRealizacao;
	private Date horarioInicio;
	private Date horarioTermino;
	private String percurso;

	/**
	 * @return the dataRealizacao
	 */
	public Date getDataRealizacao() {
		return dataRealizacao;
	}

	/**
	 * @param dataRealizacao
	 *            the dataRealizacao to set
	 */
	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	/**
	 * @return the horarioInicio
	 */
	public Date getHorarioInicio() {
		return horarioInicio;
	}

	/**
	 * @param horarioInicio
	 *            the horarioInicio to set
	 */
	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	/**
	 * @return the horarioTermino
	 */
	public Date getHorarioTermino() {
		return horarioTermino;
	}

	/**
	 * @param horarioTermino
	 *            the horarioTermino to set
	 */
	public void setHorarioTermino(Date horarioTermino) {
		this.horarioTermino = horarioTermino;
	}

	/**
	 * @return the percurso
	 */
	public String getPercurso() {
		return percurso;
	}

	/**
	 * @param percurso
	 *            the percurso to set
	 */
	public void setPercurso(String percurso) {
		this.percurso = percurso;
	}

}
