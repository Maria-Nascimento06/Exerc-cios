package Animais;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;

    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void comer(){
        //<nome> comeu

        System.out.printf("%S comeu\n", nome);
    }

    public void beber(){
        System.out.printf("%S comeu\n", nome);

    }


}
