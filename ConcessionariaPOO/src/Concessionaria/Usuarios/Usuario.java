package Concessionaria.Usuarios;

import Concessionaria.Veiculos.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    protected final static ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private String nome;
    private String usuario;
    private String senha;

    public Usuario(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public static Usuario procurarUsuario(String usuario) {
        for(Usuario user: usuarios) {
            if(user.nome.equals(usuario)){
                return user;
            }
        }
        return null;
    }
    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public static void removeUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public static Usuario login(String usuario, String senha) {
        for (Usuario userProcurado: usuarios) {
            if(userProcurado.usuario.equals(usuario) &&
                    userProcurado.senha.equals(senha)){
                return userProcurado;
            }
        }
        return null;
    }

    public void removeVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }
    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}

