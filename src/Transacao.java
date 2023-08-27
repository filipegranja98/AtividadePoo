public class Transacao {
    int codTransacao ;
    String tipoTransacao;
    String dataHora ;
    double valor;

    Transacao(int codTransacao, String tipoTransacao, String dataHora, double valor){
        this.codTransacao = codTransacao;
        this.tipoTransacao = tipoTransacao;
        this.dataHora = dataHora;
        this.valor = valor;
    }
    void mostrarDados(){
        System.out.println("Id: "+ codTransacao);
        System.out.println("Tipo da transação: "+tipoTransacao);
        System.out.println("Data e Hora: "+dataHora);
        System.out.println("Valor: "+valor);
        System.out.println(" ");
    }
    void alterarValor(double valor){
        this.valor = valor;
    }
}
