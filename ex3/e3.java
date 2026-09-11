public class ContaBancaria {
    // Requisito 1
    private int numero;
    private String titular;
    private double saldo;

    // Requisito 2
    public ContaBancaria(int numero, String titular, double saldo) throws Exception {
        
        // Requisitos 3 e 6
        if(numero <= 0) throw new Exception("Número inválido");
        this.numero = numero;

        // Requisitos 4 e 6
        if(titular == null || titular.equals("")) throw new Exception("Titular inválido");
        this.titular = titular;

        // Requisitos 5 e 6
        if(saldo < 0) throw new Exception("Saldo inválido");
        this.saldo = saldo;
    }

    // Requisito 7
    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Requisito 8
    public void setTitular(String titular) throws Exception {
        if(titular == null || titular.equals("")) throw new Exception("Titular inválido");
        this.titular = titular;
    }

    // Métodos
    public void depositar(double valor) throws Exception {
        if(valor <= 0) throw new Exception("Valor inválido");
        this.saldo += valor;
    }

    public void sacar(double valor) throws Exception {
        if(valor <= 0) throw new Exception("Valor inválido");
        if(valor > saldo) throw new Exception("Valor inválido");
        this.saldo -= valor;
    }
    
}