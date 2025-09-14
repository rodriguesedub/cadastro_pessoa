public class Pessoa {
    private String nome;
    private char sexo;
    private String estadoCivil;
    private Data dataNasc;

    public Pessoa(String nome, char sexo, String estadoCivil, Data dataNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public Data getDataNasc() {
        return dataNasc;
    }
}
