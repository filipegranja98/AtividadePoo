public class Banco {
    int cnpj;
    String endereco;
    String nome;
    String telefone;


    Banco(int cnpj, String endereco, String nome, String telefone){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }

    void mostrarDados(){
        System.out.println("CNPJ: "+cnpj);
        System.out.println("Endereço: "+endereco);
        System.out.println("Nome: "+nome);
        System.out.println("Telefone: "+telefone);
        System.out.println(" ");
    }
    void alterarTelefone(String telefone){
        this.telefone = telefone;
    }
    void alterarEnderecoBanco(String endereco){
        this.endereco = endereco;
    }
}
