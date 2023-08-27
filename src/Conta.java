public class Conta {
    int nConta;
    String tipoConta;
    double saldo;

    Conta(int nConta, String tipoConta, double saldo){
        this.nConta = nConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    void mostrarDados(){
        System.out.println("Número da Conta: "+nConta);
        System.out.println("Tipo da Conta: "+tipoConta);
        System.out.println("Saldo: "+saldo);
        System.out.println(" ");
    }
    void mudarTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }


}
