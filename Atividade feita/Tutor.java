public class Tutor extends pessoa {

    public int matricula;
    public int qtd_de_estudantes_tutelados;

    @Override
    public boolean Salvar(){

    
        if (!super.Salvar()) {

        System.out.println("Salvando na tabela tutores.");
        return false;
        
        }

        return true;
    }

}