package Concessionaria;

import Concessionaria.Usuarios.*;
import Concessionaria.Veiculos.*;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static Usuario usuarioLogado;

    public static void main(String[] args) {
        Usuario.addUsuario(new Cliente("Victor", "victor", "123"));
        Usuario.addUsuario(new Vendedor("Carlos", "carlos", "1234", 1300, 1, 500));
        Usuario.addUsuario(new Gerente("Enzo","enzo","12345",1500,1));

        do {
            System.out.println("Bem vindo a concessionaria");
            System.out.printf("""
                    1- Cadastro de Usuário
                    2- Login
                    3- Sair
                    """);
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> cadastroUsuario();
                case 2 -> login();
                case 3 -> System.exit(0);
            }
        } while (true);
    }
    private static void cadastroUsuario () {
        System.out.println("nome: ");
        String nome = sc.next();
        System.out.println("usuario: ");
        String usuario = sc.next();
        System.out.println("senha: ");
        String senha = sc.next();

        Usuario cliente = new Cliente(nome, usuario, senha);

        Usuario.addUsuario(cliente);
    }
    private static void login() {
        do {
            System.out.println("usuario: ");
            String usuario = sc.next();
            System.out.println("senha: ");
            String senha = sc.next();

            usuarioLogado = Usuario.login(usuario, senha);

        } while (usuarioLogado == null);
        menu();
    }
    private static void menu(){
        do{
            System.out.printf("""
                   Bem vindo
                    """);
            if (usuarioLogado instanceof Funcionario){
                System.out.printf("""
                        2- Gerenciar Pagamentos
                        3- Adicionar Pagamentos
                        4- Procurar cliente
                        5- Vender veiculo
                        """);
            }if (usuarioLogado instanceof Gerente){
                System.out.printf("""
                        6- Cadastrar veiculo
                        7- Remover veiculo
                        8- Editar veiculo
                        9- Alterar preço
                        10- Cadastrar usuario
                        11- Remover usuario
                        12- Editar usuario
                        13- Ver vendedores
                        14- Ver clientes 
                        15- Ver pagamentos
                        16- Ver pagamento 
                        """);
            }
                System.out.println("0- Logout");

            int escolha = sc.nextInt();

            switch (escolha){
                case 0 -> logout();
            }
        }while (usuarioLogado!=null);
    }

    public static void logout(){
        usuarioLogado=null;
    }


}
