import java.util.Random;

public class ExemplosDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //executando repetidas vezes até alguem atender
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("alo!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ator de continuar tocando
        return ! atendeu;
    }
}
