// Classe Data
public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            System.out.println("Dia inválido! Deve estar entre 1 e 31.");
            System.exit(1);
        }
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido! Deve estar entre 1 e 12.");
            System.exit(1);
        }
        if (ano < 1900) {
            System.out.println("Ano inválido! Deve ser maior ou igual a 1900.");
            System.exit(1);
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
