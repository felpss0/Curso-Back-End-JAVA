package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
		
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
			this.contatoSet = new HashSet<>();
		}
		
		
		public void adicionarContato(String nome, int numero) {
			contatoSet.add(new Contato(nome, numero));
		}
		
		
		public void exibirContatos() {
			System.out.println(contatoSet);
		}
		
		public Set<Contato> pesquisarPorNome(String nome){
			Set<Contato> contatosPorNome = new HashSet<>();
			for(Contato c : contatoSet ) {
				if(c.getNome().startsWith(nome)) {
					contatosPorNome.add(c);
				}
			}
			
			return contatosPorNome;
				
		}
		
		public Contato atualizarNumeroContato(String nome, int novoNumero) {
			Contato contatoAtualizado = null;
			for(Contato c : contatoSet) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNumero(novoNumero);
					contatoAtualizado = c;
					break;
				}
			}
			return contatoAtualizado;
			
			
		}
		
		
		public static void main(String[] args) {
			AgendaContatos agendaContatos = new AgendaContatos();
			
			agendaContatos.exibirContatos();
			
			
			agendaContatos.adicionarContato("Camila", 12345);
			agendaContatos.adicionarContato("Camila", 12344);
			agendaContatos.adicionarContato("Camila Cavalcante", 12355);
			agendaContatos.adicionarContato("Camila DIO", 12333);
			agendaContatos.adicionarContato("Maria Silva", 12222);
			
			
			System.out.println(agendaContatos.pesquisarPorNome("Maria"));
			System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555));
			
			agendaContatos.exibirContatos();
			
		}
		
	}
 


