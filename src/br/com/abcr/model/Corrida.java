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
	private String id;
	private Date dataRealizacao;
	private Date start;
	private Date end;
	private String percurso;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	public Date getStart() {
		return start;
	}

	/**
	 * @param horarioInicio
	 *            the horarioInicio to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return the horarioTermino
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * @param horarioTermino
	 *            the horarioTermino to set
	 */
	public void setEnd(Date end) {
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

}
