package entity;

public class Moto extends Automovel {
    private String tipo;
    private boolean partidaEletrica;

    public Moto(String marca, int anoDeFabricacao, String modelo, String tipo, boolean partidaEletrica) {
        super(marca, anoDeFabricacao, modelo);
        this.tipo = tipo;
        this.partidaEletrica = partidaEletrica;
    }

    public void abrirValvulaCombustivel() {
        System.out.println("Abrindo válvula...");
    }

    @Override
    public void Exibir() {
        super.Exibir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }
}
