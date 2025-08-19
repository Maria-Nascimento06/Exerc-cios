public class Slime {
    private String nome;
    private String arma;

    void exibeFichaTecnica() {
        System.out.println("Nome de slime é:" + nome);
        System.out.println("Sua arma é:" + arma);

    }

    public String getNome() {
        return nome;
    }

    public String getArma() {
        return arma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void setArma(String arma) {
        this.arma = arma;


    }
    }