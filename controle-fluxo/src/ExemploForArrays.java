public class ExemploForArrays {
    public static void main(String[] args) {
        String alunos[] = {"Filipe", "Jonas", "Julia", "Marcos"};
        
        // Arrays inicia o indice sempre em 0 
      for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos [x]);

        }

        // Obtenção dos indices de forma abreviada
        String funcionarios[] = {"Jorge", "Julio", "Julia", "Marcelo"};

        for(String funcionario : funcionarios){
            System.out.println("Nome do funcionario é " + funcionario);
        }

    }
}
