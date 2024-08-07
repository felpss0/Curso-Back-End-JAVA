package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
		private Map<Long, Produto> estoqueProdutosMap;

		public EstoqueProdutos() {
			
			this.estoqueProdutosMap = new HashMap<>();
		}
		
		public void adicionarProdutos(Long cod, String nome, int quantidade, double preco) {
			estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
		}
		
		public void exibirProdutos() {
			System.out.println(estoqueProdutosMap);
		}
		
		public double calcularValorTOtalEstoque() {
			double valorTotalEstoque = 0;
			if(!estoqueProdutosMap.isEmpty()) {
				for(Produto p : estoqueProdutosMap.values()) {
					valorTotalEstoque += p.getQuantidade() * p.getPreco();
				}
			}
			return valorTotalEstoque;
		
		}
		
		
		public Produto obterProdutoMaisCaro() {
			
			Produto produtoMaisCaro = null;
			double maiorPreco = Double.MIN_VALUE;
			if(!estoqueProdutosMap.isEmpty()) {
				for(Produto p : estoqueProdutosMap.values()) {
					if(p.getPreco() > maiorPreco) {
						produtoMaisCaro = p;
						}
					}
				}
			return produtoMaisCaro;
		}
		
		public static void main(String[] args) {
			EstoqueProdutos estoque = new EstoqueProdutos();
			
			estoque.adicionarProdutos(1L, "Produto A", 10, 5.0);
			estoque.adicionarProdutos(2L, "Produto B", 5, 10.0);
			estoque.adicionarProdutos(3L, "Produto C", 2, 15.0);
			estoque.adicionarProdutos(4L, "Produto D", 2, 20.0);
			
			estoque.exibirProdutos();
			
			System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTOtalEstoque());
			System.out.println("Produto mais caro:  " + estoque.obterProdutoMaisCaro());
			
			
			
		}
		
}
