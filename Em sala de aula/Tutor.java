public class Tutor extends pessoa {

    public String cpf;
    public String nome;
    public int Matricula;
    public int qtd_de_estudantes_tutelados;

    @Override
    public boolean Salvar(){
        if(super.Salvar()){
        System.out.println("Salvando na tabela de tutores");
        }
        return true;
    }
}
