class Conta {
    // Atributos / Váriaveis do Objt.
    int id;
    String dono;
    double saldo;
    double limete;

    // Métodos / Comporotamentos.
    void sacar(double quantia) {
        double novoSaldo = this.saldo - quantia;
        this.saldo = novoSaldo;
    }

    void depositar(double quantia) {
        this.saldo += quantia;
    }
    
}