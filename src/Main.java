public class Main {
    public static void main(String[] args) {
        // Instanciando objetos
        Banco banco = new Banco();
        Agencia agencia = new Agencia();
        Conta conta = new Conta();
        Transacao transacao = new Transacao();
        Cliente cliente = new Cliente();

        System.out.println("Atributos do Objeto (Banco)");
        System.out.println("CNPJ: "+banco.cnpj);
        System.out.println("Nome do Banco: "+banco.nome);
        System.out.println("Endereço: "+banco.endereco);
        System.out.println("Telefone: "+banco.telefone+"\n");

        System.out.println("Atributos do Objeto (Agencia)");
        System.out.println("Nome da Agencia: "+agencia.nome);
        System.out.println("Número da Agencia: "+agencia.numAgencia);
        System.out.println("Endereço: "+agencia.endereco);
        System.out.println("Telefone: "+agencia.telefone+"\n");

        System.out.println("Atributos do Objeto (Conta)");
        System.out.println("Número da conta: "+conta.nConta);
        System.out.println("Tipo da Conta: "+conta.tipoConta);
        System.out.println("Saldo: "+conta.saldo+"\n");

        System.out.println("Atributos do Objeto (Transação)");
        System.out.println("Codigo da transação: "+transacao.codTransacao);
        System.out.println("Tipo da transação: "+transacao.tipoTransacao);
        System.out.println("Data e Hora: "+transacao.dataHora);
        System.out.println("Valor: "+transacao.valor+"\n");

        System.out.println("Atributos do Objeto (Cliente)");
        System.out.println("CPF: "+cliente.cpf);
        System.out.println("Nome: "+cliente.nome);
        System.out.println("Endereço: "+cliente.endereco);
        System.out.println("Telefone: "+cliente.telefone);



    }
}