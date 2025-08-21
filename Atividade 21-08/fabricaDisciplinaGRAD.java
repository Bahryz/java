public class fabricaDisciplinaGRAD implements iFabricaFaculdade {
    @Override
    public iDisciplina definirResultado() {
        return new disciplinasGraduacao();
    }
}
