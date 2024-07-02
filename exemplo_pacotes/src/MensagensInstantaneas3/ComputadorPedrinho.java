package MensagensInstantaneas3;

import Apps_MensagemInstantanea3.ServicoMensagemInstantanea;
import Apps_MensagemInstantanea3.FacebookMenssenger;
import Apps_MensagemInstantanea3.MSNMenssenger;
import Apps_MensagemInstantanea3.TelegramMenssenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMenssenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMenssenger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMenssenger();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}