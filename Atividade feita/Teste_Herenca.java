public class Teste_Herenca {
    public static void main(String[] args) {

        Tutor tutor = new Tutor();
        tutor.cpf = "888";

        Faculdade faculdade = new Faculdade();
        faculdade.processar(tutor);
    }
}