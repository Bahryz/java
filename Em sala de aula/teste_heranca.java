public class teste_heranca {
    public static void main(String[] args) {

        professor prof = new professor();
        prof.cpf = "888";
        faculdade up = new faculdade();
        up.processar(prof); // deve imprimir "Salvando na tabela de professores"

    }
}
