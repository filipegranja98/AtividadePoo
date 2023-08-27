import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        Scanner s = new Scanner(System.in);
        Banco banco1 = new Banco(1234567890,"Rua curimatã, nº 302","Banco Jubileus", "(81)98491-0495");
        Banco banco2 = new Banco(1987654321, "Rua do dendê, n° 101", "Banco Joaquim", "(81) 30302224");
        Agencia agencia1 = new Agencia(302302,"Agencia da Boa Vista","Boa vista, número 348","(81) 30302943");
        Agencia agencia2 = new Agencia(302301,"Agencia de Casa Amarela","Boa vista, número 348");
        Conta conta1 = new Conta(302302,"Poupança",629.50);
        Conta conta2 = new Conta(302301,"Corrente",300.89);
        Transacao transacao1 = new Transacao(102131231,"TED","27/08/2023 19:32",1000);
        Transacao transacao2 = new Transacao(103349012,"DOC","26/08/2023 10:11",500);
        Cliente cliente1 = new Cliente("Filipe","12345679011","Morro da conceição, nº 444","(81) 9999-9999" );
        Cliente cliente2 = new Cliente("Antony","12345679011","Campo grande, nº 4002","(81) 98888-9999" );
        CadastrarCliente cadastrar = new CadastrarCliente();

        // Adicionando os clientes a um arraylist
        cadastrar.cadastrarCliente(cliente1);
        cadastrar.cadastrarCliente(cliente2);


        // Exibindo dados
         banco1.mostrarDados();

         agencia2.mostrarDados();

         conta1.mostrarDados();

         transacao2.mostrarDados();

         cadastrar.listarClientes();

        // Alterando os valores dos objetos
        System.out.println("Valores alterados");
        banco1.alterarEnderecoBanco("Rua da Aurora, nº 3010");
        agencia2.alterarTelefone("(81) 9xxxx-xxxx");
        conta1.mudarTipoConta("Poupança");
        transacao2.alterarValor(2000);
        cliente2.alterarTelefone("(81) 99434-1231");

        // Valores alterados
        System.out.println("Dados alterados");
        banco1.mostrarDados();
        agencia2.mostrarDados();
        conta1.mostrarDados();
        transacao2.mostrarDados();
        cliente2.mostrarDados();












    }
}