package entity;

public class Carro extends Automovel {
    private int quantPortas;
    private boolean direcaoHidraulica;

    public Carro(int quantPortas, boolean direcaoHidraulica, String marca, int anoDeFabricacao, String modelo) {
        super(marca, anoDeFabricacao, modelo);
        this.quantPortas = quantPortas;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public void TrancarPorta() {
        System.out.println("Porta trancada");
    }

    public void LigarAlarme() {
        System.out.println("Alarme ligado");
    }

    @Override
    public void Exibir() {
        super.Exibir();
        System.out.println("Quantidade de portas: " + quantPortas);
        System.out.println("Direção hidráulica: " + (direcaoHidraul
