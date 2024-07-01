package Veiculo;

public class Autodromo {
	public static void main(String[] args) {
			
			//Abstração
			Carro corsa =  new Carro();
			corsa.setChassi("53921");
			corsa.ligar();
			
			
			//Polimorfismo
			Moto R15 = new Moto();
			R15.setChassi("38212");
			R15.ligar();
			
			
			
			Veiculo coringa = corsa;
			coringa.ligar();
			
	}
}
