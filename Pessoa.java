public class Pessoa {
    String nome;
    int idade;
    String documento;

    Pessoa (String nome, int idade, String documento){
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    public void imprimirInfo(){
        System.out.println("nome:" + this.nome);
        System.out.println("idade:" + this.idade);
        System.out.println("documento:" + this.documento);

    }

}
