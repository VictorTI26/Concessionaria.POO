package Concessionaria.Usuarios;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario extends Usuario{

    private final static List<Funcionario> pagamentos = new ArrayList<>();
    private double salario;
    private int codigo;
    private double comissao;

    public Funcionario(String nome, String usuario, String senha, double salario, int codigo, double comissao) {
        super(nome, usuario, senha);
        this.salario=salario;
        this.codigo=codigo;
        this.comissao=comissao;
    }

    public List<Funcionario> getPagamentos(){
        return pagamentos;
    }
}
