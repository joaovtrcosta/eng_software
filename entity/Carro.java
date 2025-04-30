package entiny;

public class Carro extends Automovel{
    private int quantportas;
    private String motor;
    private boolean direcaohidraulica;

    public Carro (int quantportas, String motor, boolean direcaohidraulica, String marca, int anoDeFabricacao, String modelo){
        super (marca, anoDeFabricacao, modelo);
        this.quantportas=quantportas;
        this.motor=motor;
        this.direcaohidraulica=direcaohidraulica;
    }

    public void TrancarPorta(){
        System.out.println("Porta trancada");
    }

    public void LigarAlarme(){
        System.out.println("Alarme ligado");
    }
}