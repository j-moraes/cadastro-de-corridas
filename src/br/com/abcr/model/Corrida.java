/**
 * 
 */
package br.com.abcr.model;

import java.util.Calendar;

/**
 * @author jmoraes
 *
 */
public class Corrida {
	private String id;
	private Calendar dataRealizacao;
	private Calendar start;
	private Calendar end;
	private String percurso;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the dataRealizacao
	 */
	public Calendar getDataRealizacao() {
		return dataRealizacao;
	}

	/**
	 * @param dataRealizacao
	 *            the dataRealizacao to set
	 */
	public void setDataRealizacao(Calendar dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	/**
	 * @return the horarioInicio
	 */
	public Calendar getStart() {
		return start;
	}

	/**
	 * @param horarioInicio
	 *            the horarioInicio to set
	 */
	public void setStart(Calendar start) {
		this.start = start;
	}

	/**
	 * @return the horarioTermino
	 */
	public Calendar getEnd() {
		return end;
	}

	/**
	 * @param horarioTermino
	 *            the horarioTermino to set
	 */
	public void setEnd(Calendar end) {
		this.end = end;
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

	@Override
	public String toString() {
		return "id: " + this.getId() + ", Data De Realização: " + this.getDataRealizacao() + ", Horário de Início: "
				+ this.getStart() + ", Horário de Encerramento: " + this.getEnd() + ", percurso: " + this.getPercurso();
	}

}
