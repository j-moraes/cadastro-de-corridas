/**
 * 
 */
package br.com.abcr.model;

import java.util.Calendar;

/**
 * @author jmoraes
 *
 */
public class Corredor {
	private String nome;
	private String cpf;
	private Calendar dataNascimento;
	private String sexo;
	private String telefone;
	private String endereco;
	private String pessoaContato;

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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the pessoaContato
	 */
	public String getPessoaContato() {
		return pessoaContato;
	}

	/**
	 * @param pessoaContato
	 *            the pessoaContato to set
	 */
	public void setPessoaContato(String pessoaContato) {
		this.pessoaContato = pessoaContato;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar data) {
		this.dataNascimento = data;
	}

}
