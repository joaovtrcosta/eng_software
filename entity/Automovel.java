package entiny;

public class Automovel {
    private String marca;
    private int anoDeFabricacao;
    private String modelo;

    public Automovel(String marca, int anoDeFabricacao, String modelo){
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
    }

    public void Ligar(){
        System.out.println("Ligando.....");
    }

    public void Desligar(){
        System.out.println("Desligando...");
    }

    public void Exibir(){
        System.out.println("Marca: " + marca + "\nAno: "+ anoDeFabricacao + "\nModelo: " + modelo);
    }
}