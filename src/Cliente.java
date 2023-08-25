public class Cliente {
    String cpf ;
    String nome;
    String endereco;
    String telefone;

    Cliente(String cpf, String nome, String endereco, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;

    }
    void clienteDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
    }
}
