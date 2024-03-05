package Concessionaria.Usuarios;

import Concessionaria.Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario extends Usuario{

    private  ArrayList<Double> pagamentos = new ArrayList<>();
    private double salario;
    private int codigo;
    private double comissao;

    public Funcionario(String nome, String usuario, String senha, double salario, int codigo, double comissao) {
        super(nome, usuario, senha);
        this.salario=salario;
        this.codigo=codigo;
        this.comissao=comissao;
    }

    public ArrayList<Double> getPagamentos() {
        return pagamentos;
    }

    public void addPagamento(Double pagamento){
        double pagamentoComissao = pagamento * this.comissao;
        pagamentos.add(pagamentoComissao) ;
    }

    public Usuario procurarCliente(String nome){
        return Usuario.procurarUsuario(nome);
    }

    public Boolean venderVeiculo(Veiculo veiculo, Usuario usuario){
        if (veiculo==null){
            return false;
        }if (usuario==null){
            return false;
        }usuario.addVeiculo(veiculo);
        return true;
    }

    public int getCodigo() {
        return codigo;
    }
}
