package Veiculo;

public class Carro {
	public void ligar() {
		verificaCombustivel();
		verificaCambio();
		System.out.println("Carro ligado");
	}
	private void verificaCombustivel() {
		System.out.println("Verificando Combustivel");
	}
	
	private void verificaCambio() {
		System.out.println("Verificando se o carro não está engrenado");
	}
}
