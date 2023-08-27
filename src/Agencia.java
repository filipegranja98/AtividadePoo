public class Agencia {
    int numAgencia;
    String nome;
    String endereco;
    String telefone;


    Agencia(int numAgencia, String nome , String endereco, String telefone){
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    Agencia(int numAgencia, String nome , String endereco){
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = null;
    }
    void mostrarDados(){
        System.out.println("Número da agencia: "+numAgencia);
        System.out.println("Nome da agencia: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println(" ");
    }
    void alterarEnderecoAgencia(String endereco){
        this.endereco = endereco;
    }
    void alterarTelefone(String telefone){
        this.endereco = telefone;
    }
}
