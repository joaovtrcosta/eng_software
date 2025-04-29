package entity;

public class Automovel {
    private String marca;
    private int anoDeFabricacao;
    private String modelo;

    public Automovel(String marca, int anoDeFabricacao, String modelo) {
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
    }

    public void Exibir() {
        System.out.println("Marca: " + marca + "\nAno: " + anoDeFabricacao + "\nModelo: " + modelo);
    }
}
