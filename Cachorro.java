package Animais;

public class Cachorro extends Animal {

    public Cachorro(String nome){
     super(nome);

    }
    public void latir(){
        System.out.printf("%S latiu\n", getNome());
    }
    public void lamber(){
        System.out.printf("%S lambeu\n", getNome());
    }



    }

