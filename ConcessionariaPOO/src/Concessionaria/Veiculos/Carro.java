package Concessionaria.Veiculos;

public class Carro extends Veiculo{
    private String tipo;
    private int numeroPortas;
    private String cambio;
    private boolean completo;

    public Carro(int codigo, String modelo, int ano, String cor, String marca, double quilometragem, String alimentacao, double preco, String tipo, int numeroPortas, String cambio, boolean completo) {
        super(codigo, modelo, ano, cor, marca, quilometragem, alimentacao, preco);
        this.tipo = tipo;
        this.numeroPortas = numeroPortas;
        this.cambio = cambio;
        this.completo = completo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipo='" + tipo + '\'' +
                ", numeroPortas=" + numeroPortas +
                ", cambio='" + cambio + '\'' +
                ", completo=" + completo +
                '}';
    }
}
