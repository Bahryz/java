public class fabricaDisciplinaESP implements iFabricaFaculdade {
    @Override
    public iDisciplina definirResultado() {
        return new disciplinasEspecializacao();
    }
}
