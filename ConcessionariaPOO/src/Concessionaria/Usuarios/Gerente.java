package Concessionaria.Usuarios;

import Concessionaria.Veiculos.Veiculo;

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
    public void verClientes(Cliente ){

    }
}
