public class Orc {
    private String nome;
    private  String arma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

     void exibeFichaTecnica(){
        System.out.println("O node de Orc é:" + nome);
        System.out.println("Sua arma é:" + arma);
    }
}
