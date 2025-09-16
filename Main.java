import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // EXERCICIO 1
        // Arraylist de String
        // ArrayList<String> listaDeNomes = new ArrayList<>();

        // listaDeNomes.add("Rodrigo");
        // listaDeNomes.add("Maria");
        // listaDeNomes.add("Nathalia");
        // listaDeNomes.add("Eduarda");

        // imprimir cada elemento?
        // for (String nome : listaDeNomes) {
        // System.out.println(nome);
        // --------------------------------------------------

        // EXERCICIO 2
        // Cachorro meuCachorro = new Cachorro();

        // Animal animal = (Animal) meuCachorro;

        // ArrayList<Animal> listaAnimais = new ArrayList<>();
        // listaAnimais.add(animal);
        // --------------------------------------------------


        // EXERCICIO 3
        // for (Animal a : listaAnimais) {
        // a.latir();

        // Verificando objeto
        // if (a instanceof Cachorro) {
        // meuCachorro = (Cachorro) a;
        // meuCachorro.latir();
        //--------------------------------------------------

        // EXERCICIO 4
        // ArrayList<Produto> listaDeProdutos = new ArrayList<>();

       // listaDeProdutos.add(new Produto("Livro", 89.99));
       // listaDeProdutos.add(new Produto("Pot-it", 16.00));

       // double soma = 0;
       // for (Produto produto : listaDeProdutos){
       // soma += produto.preco;
       // }

       // double media = soma / listaDeProdutos.size();
       // System.out.println("Media de preço: " + media);

       ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

       listaDeContas.add(new ContaBancaria(87956900, 1.000));
       listaDeContas.add(new ContaBancaria(64582398, 578.99));
       listaDeContas.add(new ContaBancaria(37599901, 55.00));

        for (ContaBancaria c : listaDeContas){
            System.out.println("Numero da conta: " + c.getNumeroDaConta() + " Saldo: " + c.getSaldo());

            //System.out.println("Conta com maior saldo");

           // ContaBancaria maiorSaldo = listaDeContas.get(0);
           // for (ContaBancaria conta : listaDeContas){
             //   if (conta.getSaldo() > maiorSaldo.getSaldo()){
                //    System.out.println(conta);
               // }
           // }

            ContaBancaria contaMaiorSaldo = listaDeContas.get(0);

            for (ContaBancaria conta : listaDeContas) {
                if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                    contaMaiorSaldo = conta;
                }
            }

            System.out.println("Conta com maior saldo: " + contaMaiorSaldo.getNumeroDaConta() + " - Saldo: " + contaMaiorSaldo.getSaldo());

        }
    }
}




