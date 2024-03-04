package Concessionaria.Veiculos;

import Concessionaria.Usuarios.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Veiculo {

    private final static List<Veiculo> veiculos = new ArrayList<>();
    private String modelo;
    private String cor;
    private String marca;
    private String alimentacao;
    private int codigo;
    private int ano;
    private double quilometragem;
    private double preco;

    public static List<Veiculo> getVeiculos(){
        return Collections.unmodifiableList(veiculos);
    }

    public static void addVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public static void removeVeiculo(Veiculo veiculo){
        for (Veiculo veiculo1 : veiculos){
            if(veiculo.veiculos == veiculo){
                veiculos.remove(veiculo);
                return;
            }
        }
    }
    public static Veiculo procurarVeiculo (int codigo) {
        for (Veiculo veiculo: veiculos) {
            if(veiculo.codigo == codigo) {
                return veiculo;
            }
        }
        return null;
    }
}
