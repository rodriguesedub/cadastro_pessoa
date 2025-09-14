/*6) Escrever um programa em Java que 

cadastre os dados de uma pessoa e depois os imprima.

criar uma classe Pessoa com esses atributos: nome, sexo, estado civil e data de nascimento. 
-------------------OK-------------------

Para passar a data em forma de string para um objeto da classe Pessoa
criar uma classe Data com atributos inteiros dia, mes e ano, os quais devem ser validados ao serem definidos para um objeto data 
(dia entre 1 e 31, mês entre 1 e 12, ano não negativo). Essa classe deverá ter um método que retorne a data (validada) como uma string no formato dd/mm/aaaa.
-------------------OK-------------------

Os dados para cada objeto Pessoa serão definidos no programa cliente (por código para simplificar), 
sendo a data fornecida em forma de três inteiros, dd, mm e aaaa, ao objeto Data, que posteriormente fornecerá a string ao objeto Pessoa.

A classe Pessoa deverá ter método para definição dos atributos (construtor e/ou "setters")
e outros para recuperá-los ("getters").

Por fim, para imprimir os dados das pessoas, usar uma classe (Outstr) que monte um
formato de saída semelhante ao abaixo com os dados de um objeto Pessoa (parâmetro)
obtidos a partir dos "getters" dessa classe.
Nome..........: Pedro Silva
Sexo (M/F)....: M
Estado civil..: Solteiro
Data nasc.....: 23/08/1998
Para testar o programa, devem ser definidos os dados para pelo menos duas pessoas e, em
seguida, estes devem ser impressos.
 */

public class cliente {
    public static void main(String[] args) {
        // Criando pessoas diretamente no código (sem Scanner)
        Data d1 = new Data(23, 8, 1998);
        Pessoa p1 = new Pessoa("Pedro Silva", 'M', "Solteiro", d1);

        Data d2 = new Data(15, 4, 2002);
        Pessoa p2 = new Pessoa("Maria Oliveira", 'F', "Casada", d2);

        // Impressão formatada
        Outstr.imprimir(p1);
        System.out.println("-----------------------------");
        Outstr.imprimir(p2);
    }
}
