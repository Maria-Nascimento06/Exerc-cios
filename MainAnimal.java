import Animais.Cachorro;
import Animais.Dragao;
import Animais.Gato2;
import Animais.Pombo;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo");
        cachorro.setNome("Caramelo");
        cachorro.comer();
        cachorro.latir();

        Gato2 gato = new Gato2("nina");
        gato.miar();

        Dragao dragao = new Dragao("Dragão branco de olhos azuis");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombinha = new Pombo("Pombo correio Sedex");
        pombinha.voar();
        pombinha.enviarCarta();
        pombinha.fazerPru();
    }
}