/**
 * 
 */
package br.com.abcr.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.abcr.dao.AcompanhamentoCorredorDao;
import br.com.abcr.dao.CorredorDao;
import br.com.abcr.dao.CorridaDao;
import br.com.abcr.dao.DesempenhoCorredorDao;
import br.com.abcr.model.AcompanhamentoCorredor;
import br.com.abcr.model.Corredor;
import br.com.abcr.model.Corrida;
import br.com.abcr.model.DesempenhoCorredor;

/**
 * @author jmoraes
 *
 */
public class TestaInsere {
	private static CorredorDao abcrDao;

	private static CorridaDao corridaDao;

	private static AcompanhamentoCorredorDao acompanhamentoDao;

	private static DesempenhoCorredorDao desempenhoDao;

	private static Scanner pegaValor;
	private static Corredor corredor;

	private static AcompanhamentoCorredor acompanhamentoCorredor;

	private static Corrida corrida;

	private static DesempenhoCorredor desempenho;

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		corredor = new Corredor();

		acompanhamentoCorredor = new AcompanhamentoCorredor();

		corrida = new Corrida();

		desempenho = new DesempenhoCorredor();

		abcrDao = new CorredorDao();

		acompanhamentoDao = new AcompanhamentoCorredorDao();

		corridaDao = new CorridaDao();

		desempenhoDao = new DesempenhoCorredorDao();

		int op = 0;

		while (op != 6) {
			System.out.println("Menu");
			System.out.println("1 - Cadastro de Corredores");
			System.out.println("2 - Consulta Saúde do Corredor");
			System.out.println("3 - Cadastro de Corrida");
			System.out.println("4 - Consulta desempenho do corredor");
			System.out.println("5 - Listar Dados do Corredor");
			System.out.println("6 - Sair");

			System.out.print("Selecione uma opção : ");

			pegaValor = new Scanner(System.in);
			op = pegaValor.nextInt();

			switch (op) {
			case 1:
				cadastroCorredor();

				break;

			case 2:

				cadastroDadosSaude();

				break;

			case 3:
				cadastroCorrida();

				break;

			case 4:

				cadastroDesempenhoCorredor();

				break;

			case 5:
				exibe();

			default:
				break;
			}
		}
	}

	public static void cadastroCorredor() throws ParseException {
		// pega cpf
		System.out.print("CPF : ");
		pegaValor = new Scanner(System.in);
		corredor.setCpf(pegaValor.nextLine());

		// pega nome
		System.out.print("Nome : ");
		pegaValor = new Scanner(System.in);
		corredor.setNome(pegaValor.nextLine());

		// pega data de nascimento
		System.out.print("Data de Nascimento : ");
		pegaValor = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(pegaValor.nextLine()));

		corredor.setDataNascimento(cal);

		// sexo
		System.out.print("Sexo : ");
		pegaValor = new Scanner(System.in);

		corredor.setSexo(pegaValor.nextLine());

		// telefone
		System.out.print("Telefone : ");
		pegaValor = new Scanner(System.in);

		corredor.setTelefone(pegaValor.nextLine());

		// endereço
		System.out.print("Endereço : ");
		pegaValor = new Scanner(pegaValor.nextLine());

		corredor.setEndereco(pegaValor.nextLine());

		// Contato Conhecido
		System.out.print("Contato Conhecido : ");
		pegaValor = new Scanner(System.in);

		corredor.setPessoaContato(pegaValor.nextLine());

		abcrDao.adiciona(corredor);

		System.out.println("Dados salvos com sucesso!");
	}

	public static void cadastroDadosSaude() throws ParseException {
		// pega id
		System.out.print("ID : ");
		pegaValor = new Scanner(System.in);
		acompanhamentoCorredor.setId(pegaValor.nextLine());

		// pega data do cadastro
		System.out.print("Data Do cadastro : ");
		pegaValor = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(pegaValor.nextLine()));

		acompanhamentoCorredor.setDataInsercao(cal);

		// pega colesterol
		System.out.print("Índice de colesterol : ");
		pegaValor = new Scanner(System.in);
		acompanhamentoCorredor.setColesterol(pegaValor.nextLine());

		// triglicerideos
		System.out.print("TriGlicerídeos : ");
		pegaValor = new Scanner(System.in);

		acompanhamentoCorredor.setTriglicerideos(pegaValor.nextLine());

		// glicose
		System.out.print("Glicose : ");
		pegaValor = new Scanner(System.in);

		acompanhamentoCorredor.setGlicose(pegaValor.nextLine());

		// pressão arterial
		System.out.print("Pressão Arterial : ");
		pegaValor = new Scanner(pegaValor.nextLine());

		acompanhamentoCorredor.setPressaoArterial(pegaValor.nextLine());

		// Altura
		System.out.print("Altura : ");
		pegaValor = new Scanner(System.in);

		acompanhamentoCorredor.setAltura(pegaValor.nextLine());

		System.out.print("Peso : ");
		pegaValor = new Scanner(System.in);

		acompanhamentoCorredor.setPeso(pegaValor.nextLine());
		System.out.print("Batimentos Cardíacos em Repouso : ");
		pegaValor = new Scanner(System.in);

		acompanhamentoCorredor.setBatimentosCardiacosRepouso(pegaValor.nextLine());

		acompanhamentoDao.adiciona(acompanhamentoCorredor);

		System.out.println("Dados salvos com sucesso!");
	}

	public static void cadastroCorrida() throws ParseException {
		// pega id
		System.out.print("ID : ");
		pegaValor = new Scanner(System.in);
		corrida.setId(pegaValor.nextLine());

		// pega Data de Realização
		System.out.print("Data de Realização : ");

		pegaValor = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(pegaValor.nextLine()));

		corrida.setDataRealizacao(cal);

		// Horário de início.
		System.out.print("Horário de início : ");
		pegaValor = new Scanner(System.in);

		new SimpleDateFormat("dd/MM/yyyy");
		Calendar.getInstance();
		cal.setTime(sdf.parse(pegaValor.nextLine()));

		corrida.setStart(cal);

		// Horário de encerramento

		System.out.print("Horário de encerramento : ");
		pegaValor = new Scanner(System.in);

		new SimpleDateFormat("dd/MM/yyyy");
		Calendar.getInstance();
		cal.setTime(sdf.parse(pegaValor.nextLine()));

		corrida.setEnd(cal);

		// percurso
		System.out.print("Percurso : ");
		pegaValor = new Scanner(pegaValor.nextLine());

		corrida.setPercurso(pegaValor.nextLine());

		corridaDao.adiciona(corrida);

		System.out.println("Dados salvos com sucesso!");
	}

	public static void cadastroDesempenhoCorredor() throws ParseException {
		// pega id
		System.out.print("ID : ");
		pegaValor = new Scanner(System.in);
		desempenho.setIdCorrida(pegaValor.nextLine());

		// pega Nome
		System.out.print("Nome : ");

		pegaValor = new Scanner(System.in);

		desempenho.setNome(pegaValor.nextLine());

		// Tempo de chegada
		System.out.print("Tempo de chegada : ");
		pegaValor = new Scanner(System.in);

		new SimpleDateFormat("dd/MM/yyyy");
		Calendar.getInstance();

		Calendar cal = Calendar.getInstance();

		desempenho.setTempoChegada(cal);

		// corrida completa

		System.out.print("corrida completa : ");
		pegaValor = new Scanner(System.in);

		desempenho.setCorridaCompleta(pegaValor.nextLine());

		// corrida incompleta
		System.out.print("Corrida completa : ");
		pegaValor = new Scanner(pegaValor.nextLine());

		desempenho.setCorridaCompleta(pegaValor.nextLine());

		desempenhoDao.adiciona(desempenho);

		System.out.println("Dados salvos com sucesso!");
	}

	public static void exibe() {
		List<Corredor> corredores = abcrDao.getLista();

		acompanhamentoDao.getLista();

		corridaDao.getLista();

		desempenhoDao.getLista();

		for (Corredor corredor : corredores) {
			System.out.println(corredor);
			System.out.println(acompanhamentoCorredor);
			System.out.println(corrida);
			System.out.println(desempenho);
		}
	}

}
