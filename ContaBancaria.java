public class ContaBancaria {

    private int numeroDaConta;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString(){
        return "Conta: " + getNumeroDaConta() + " Saldo: " + getSaldo();
    }

    public ContaBancaria(int numeroDaConta, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        }
    }
