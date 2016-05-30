/**
 * 
 */
package br.com.abcr.main;

import java.util.List;

import br.com.abcr.dao.CorredorDao;
import br.com.abcr.model.Corredor;

/**
 * @author jmoraes
 *
 */
public class TestaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CorredorDao dao = new CorredorDao();
		List<Corredor> corredores = dao.getLista();
		for (Corredor corredor : corredores) {
			System.out.println("Nome:" + corredor.getNome());
			System.out.println("cpf:" + corredor.getCpf());
			System.out.println("Data de nascimento:" + corredor.getDataNascimento().getTime() + "\n");
			System.out.println("Sexo:" + corredor.getSexo());
			System.out.println("Endereço:" + corredor.getEndereco());
			System.out.println("Telefone:" + corredor.getTelefone());
			System.out.println("Pessoa Para contato:" + corredor.getPessoaContato());
		}
	}

}
