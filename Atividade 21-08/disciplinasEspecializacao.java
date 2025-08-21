public class disciplinasEspecializacao implements iDisciplina {
    
    String conceito;

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }

    @Override
    public void getResultado() {
        switch (conceito) {
            case "A":
            case "B":
            case "C":
                System.out.println("Aluno APROVADO com conceito: " + conceito);
            case "D":
                System.out.println("Aluno REPROVADO com conceito: " + conceito);    
            default:
                System.out.println("Conceito inválido: " + conceito);
                break;
        }
    }

}
