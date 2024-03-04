package Concessionaria.Usuarios;

import Concessionaria.Veiculos.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private final static List<Usuario> usuarios = new ArrayList<>();
    private String nome;
    private String usuario;
    private String senha;

    public Usuario(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
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

    public ArrayList<Veiculo> getVeiculos() {
        return getVeiculos();
    }
    public static void removeVeiculo(Veiculo veiculo){
        usuarios.remove(veiculo);
    }
}

