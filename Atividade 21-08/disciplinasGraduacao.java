public class disciplinasGraduacao implements iDisciplina {
    
    Double media;

    public void setMedia(Double media) {
        this.media = media;
    }
    
    @Override
    public void getResultado() {
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}