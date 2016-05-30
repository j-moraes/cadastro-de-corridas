/**
 * 
 */
package br.com.abcr.model;

import java.util.Calendar;

/**
 * @author jmoraes
 *
 */
public class AcompanhamentoCorredor {
	private String id;
	private Calendar dataInsercao;
	private String colesterol;
	private String triglicerideos;
	private String glicose;
	private String pressaoArterial;
	private String altura;
	private String peso;
	private String batimentosCardiacosRepouso;

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
	 * @return the dataInsercao
	 */
	public Calendar getDataInsercao() {
		return dataInsercao;
	}

	/**
	 * @param dataInsercao
	 *            the dataInsercao to set
	 */
	public void setDataInsercao(Calendar dataInsercao) {
		this.dataInsercao = dataInsercao;
	}

	/**
	 * @return the colesterol
	 */
	public String getColesterol() {
		return colesterol;
	}

	/**
	 * @param colesterol
	 *            the colesterol to set
	 */
	public void setColesterol(String colesterol) {
		this.colesterol = colesterol;
	}

	/**
	 * @return the triglicerideos
	 */
	public String getTriglicerideos() {
		return triglicerideos;
	}

	/**
	 * @param triglicerideos
	 *            the triglicerideos to set
	 */
	public void setTriglicerideos(String triglicerideos) {
		this.triglicerideos = triglicerideos;
	}

	/**
	 * @return the glicose
	 */
	public String getGlicose() {
		return glicose;
	}

	/**
	 * @param glicose
	 *            the glicose to set
	 */
	public void setGlicose(String glicose) {
		this.glicose = glicose;
	}

	/**
	 * @return the pressaoArterial
	 */
	public String getPressaoArterial() {
		return pressaoArterial;
	}

	/**
	 * @param pressaoArterial
	 *            the pressaoArterial to set
	 */
	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}

	/**
	 * @return the altura
	 */
	public String getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(String altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	/**
	 * @return the batimentosCardiacosRepouso
	 */
	public String getBatimentosCardiacosRepouso() {
		return batimentosCardiacosRepouso;
	}

	/**
	 * @param batimentosCardiacosRepouso
	 *            the batimentosCardiacosRepouso to set
	 */
	public void setBatimentosCardiacosRepouso(String batimentosCardiacosRepouso) {
		this.batimentosCardiacosRepouso = batimentosCardiacosRepouso;
	}

}
