package MensagensInstantaneas2;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		System.out.println("MSN");
		MSNMenssenger msn = new MSNMenssenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("Facebook");
		FacebookMenssenger fcb = new FacebookMenssenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("Telegram");
		TelegramMenssenger tlg = new TelegramMenssenger();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}