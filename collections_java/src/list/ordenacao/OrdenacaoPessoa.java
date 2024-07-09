package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
		
	
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		
		this.pessoaList = new ArrayList<>();
	}
	
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome,idade,altura));
	}
	
	public List<Pessoa> ordernarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordernarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main(String[] args) {
		
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("Nome 1", 22, 1.88);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 24, 1.67);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 27, 1.75);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 25, 1.30);
		
		
		System.out.println(ordenacaoPessoa.ordernarPorIdade());
		System.out.println(ordenacaoPessoa.ordernarPorAltura());
		
		
		
	}
	
}


	



