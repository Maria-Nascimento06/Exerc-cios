package Animais;

import static java.lang.System.out;

public class Ave extends Animal {
    public Ave(String nome) {
        super(nome);
    }

    public void voar(){
        System.out.printf("%s voou\n", getNome());
    }
}
