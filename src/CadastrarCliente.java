import java.util.ArrayList;

public class CadastrarCliente {
    ArrayList<Cliente> listaCliente = new ArrayList<>();

    void cadastrarCliente(Cliente novoCliente){

        listaCliente.add(novoCliente);
    }
    void listarClientes(){
        for (Cliente cliente: listaCliente){
            cliente.mostrarDados();
            System.out.println(" ");
        }

    }
}
