import entiny.*;

public class TuturialGit {
    public static void main(String[] args) {
        Automovel automovel = new Automovel("chevrolet", 2016, "Astra");

        automovel.Ligar();
        automovel.Desligar();
        automovel.Exibir();


        Carro carro = new Carro ( 4, "V8", false, "Nissan", 2002, "GTR" );

        carro.Exibir();
        carro.TrancarPorta();
        carro.LigarAlarme();


        Moto moto = new Moto ("Yamaha", 2006, "vrumm", "Combustão", "V8", true);

        moto.Exibir();
        moto.abrirValvulaCombustivel();
    }
}