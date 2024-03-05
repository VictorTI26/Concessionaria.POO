package Concessionaria.Usuarios;

import Concessionaria.Veiculos.Veiculo;

import java.util.ArrayList;

public class Gerente extends Funcionario{
    public Gerente(String nome, String usuario, String senha, double salario, int codigo) {
        super(nome,usuario,senha,salario,codigo,0.02);
    }
    public void cadastrarUsuario(Usuario usuario){
        if(!(usuario instanceof Gerente)) {
            Usuario.addUsuario(usuario);
        }
    }
    public void removerUsuario(Usuario usuario) {
        if (!(usuario instanceof Gerente)) {
            Usuario.removeUsuario(usuario);
        }
    }
    public void cadastrarVeiculo(Veiculo veiculo){
        Veiculo.addVeiculos(veiculo);
    }
    public void removerVeiculo(Veiculo veiculo) {
        Veiculo.removeVeiculo(veiculo);
    }
    public String verClientes(){
        String clientes = "";
            for(Usuario cliente: usuarios){
                if(cliente  instanceof Vendedor){
                    clientes += cliente.toString();
                }
            }
            return clientes;
    }
    public String verPagamento(Vendedor usuario){
        return usuario.getPagamentos().toString();
    }

    public ArrayList<String> verPagamentos() {
        ArrayList<String> pagamentos = new ArrayList<>();
        for (Usuario funcionario : usuarios) {
            if (funcionario instanceof Vendedor) {
                pagamentos.add(((Vendedor) funcionario).getPagamentos().toString());
            }
        }
        return pagamentos;
    }
}
