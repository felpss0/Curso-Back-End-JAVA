package ExemploInterfaceEstabelecimento;

import Equipamentos_ExemploInterface.copiadora.Copiadora;
import Equipamentos_ExemploInterface.digitalizadora.Digitalizadora;
import Equipamentos_ExemploInterface.impressora.Impressora;
import Equipamentos_ExemploInterface.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
		public static void main(String[] args) {
			EquipamentoMultifuncional em = new EquipamentoMultifuncional();
			Impressora impressora = em;
			Digitalizadora digitalizadora = em;
			Copiadora copiadora = em;
			
			impressora.imprimir();
			digitalizadora.digitalizar();
			copiadora.copiar();
			
		}
}
