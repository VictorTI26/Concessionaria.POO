package Concessionaria.Veiculos;

import Concessionaria.Usuarios.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Veiculo {

    private final static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private String modelo;
    private String cor;
    private String marca;
    private String alimentacao;
    private int codigo;
    private int ano;
    private double quilometragem;
    private double preco;

    public Veiculo(int codigo, String modelo, int ano, String cor, String marca, double quilometragem, String alimentacao, double preco) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.quilometragem = quilometragem;
        this.alimentacao = alimentacao;
        this.preco = preco;
    }

    public static void addVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public static void removeVeiculo(Veiculo veiculo) {
        for (Veiculo veiculo1 : veiculos) {
            if (veiculo.veiculos.equals(veiculo) ) {
                veiculos.remove(veiculo);
                return;
            }
        }
    }

    public static Veiculo procurarVeiculo(int codigo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.codigo == codigo) {
                return veiculo;
            }
        }
        return null;
    }

    public static List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", codigo=" + codigo +
                ", ano=" + ano +
                ", quilometragem=" + quilometragem +
                ", preco=" + preco +
                '}';
    }
}
