package Animais;

//Gato --> subClasse
//Animal --> superClasse (classe mãe)
public class Gato2 extends Animal{
    public Gato2(String nome){
        super(nome);
    }
    public void miar(){
        System.out.printf("%S miou\n", getNome());

    }



}
