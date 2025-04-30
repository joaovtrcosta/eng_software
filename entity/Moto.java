package entiny;

public class Moto extends Automovel{
    private String tipo;
    private String motor;
    private boolean partidaEletrica;

    public Moto(String marca, int anoDeFabricacao, String modelo, String tipo, String motor, boolean partidaEletrica){
        super(marca, anoDeFabricacao, modelo);
        this.tipo = tipo;
        this.motor = motor;
        this.partidaEletrica = partidaEletrica;
    }

    public void abrirValvulaCombustivel() {
        System.out.println("Abrindo valvula...");
    }

}