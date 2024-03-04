package Concessionaria.Usuarios;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, String usuario, String senha, double salario, int codigo, double comissao) {
        super(nome, usuario, senha, salario,1,0.02);
    }
}

