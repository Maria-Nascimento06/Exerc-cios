//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principall {
    public static void main(String[] args) {

        System.out.println("Informações do paciente");

       Paciente paciente = new Paciente("1234", "Sulamerica", "José", 25, "1234567" );
       paciente.imprimirInfo();

        System.out.println("Informações do enfermeiro");

        Pessoa enfermeiro = new Enfermeiro(12, "UTI", "123456", "Fernanda", 35, "11223344");
        enfermeiro.imprimirInfo();










        }
    }
