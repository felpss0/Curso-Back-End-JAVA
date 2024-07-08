package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
		
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		
		this.produtoSet = new HashSet<>();
			}
	
	public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		
		return produtoPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1, "Produto 5", 15, 5);
		cadastroProdutos.adicionarProduto(2, "Produto 0", 20, 10);
		cadastroProdutos.adicionarProduto(3, "Produto 3", 10, 2);
		cadastroProdutos.adicionarProduto(4, "Produto 9", 2, 2);
		
		
		System.out.println(cadastroProdutos.produtoSet);
		
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}
