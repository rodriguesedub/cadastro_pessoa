public class Outstr {
    public static void imprimir(Pessoa p) {
        System.out.println("Nome..........: " + p.getNome());
        System.out.println("Sexo (M/F)....: " + p.getSexo());
        System.out.println("Estado civil..: " + p.getEstadoCivil());
        System.out.println("Data nasc.....: " + p.getDataNasc());
    }
}
