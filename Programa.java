public class Programa {

public static void main(String[] args){
    Conta minhaConta = new Conta();
    minhaConta.id = 1;
    minhaConta.dono = "Fábio";
    minhaConta.saldo = 100;
    minhaConta.limete = 1000;

    System.out.println("Saldo Atual: " + minhaConta.saldo);

    minhaConta.sacar(50);
    minhaConta.depositar(100);







  }
}