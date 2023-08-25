import java.util.ArrayList;

public class CadastrarCliente {
    ArrayList<Cliente> listaCliente = new ArrayList<>();

    void adicionarCliente(Cliente novoCliente){
        listaCliente.add(novoCliente);
    }
    void listarClientes(){
        for (Cliente cliente: listaCliente){
            cliente.clienteDados();
            System.out.println(" ");
        }

    }
}
