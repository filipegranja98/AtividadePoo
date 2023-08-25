import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        Scanner s = new Scanner(System.in);
        Banco banco = new Banco();
        Agencia agencia = new Agencia();
        Conta conta = new Conta();
        Transacao transacao = new Transacao();

        CadastrarCliente cadastrar = new CadastrarCliente();

        System.out.println("Nome do Cliente: ");
        String nome = s.next();

        System.out.println("CPF: ");
        String cpf = s.next();

        System.out.println("Endereço: ");
        String endereco = s.next();

        System.out.println("telefone: ");
        String telefone = s.next();
        s.close();

        Cliente cliente = new Cliente(cpf,nome,endereco,telefone);

        cadastrar.adicionarCliente(cliente);

        cadastrar.listarClientes();








    }
}