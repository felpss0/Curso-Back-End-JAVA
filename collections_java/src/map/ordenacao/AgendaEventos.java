package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		//Métodos nao funcionais
		/*Set<LocalDate> dateSet = eventosMap.keySet();
		Collection<Evento> values = eventosMap.values();*/
		//eventosMap.get();
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O proximo evento: " + proximoEvento + "Acontecera na data " + proximaData);
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 10), "Evento 4", "Atracao 4");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
	
	
	
}
