public class Globin {
    private  String nome;
    private String arma;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public String getArma() {
        return arma;
    }

     void exibeFichaTecnica(){
        System.out.println("O nome de Globin é:" + nome);
        System.out.println("Sua arma é a:" + arma);


    }


}
