package Equipamentos_ExemploInterface.multifuncional;

import Equipamentos_ExemploInterface.copiadora.Copiadora;
import Equipamentos_ExemploInterface.digitalizadora.Digitalizadora;
import Equipamentos_ExemploInterface.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
			public void copiar() {
				System.out.println("Copiando via equipamento multifuncional");
			}
			
			public void digitalizar() {
				System.out.println("Digitalizando via equipamento multifuncional");
			}
			
			public void imprimir() {
				System.out.println("Imprimindo via equipamento multifuncional");
			}

			
			
}
