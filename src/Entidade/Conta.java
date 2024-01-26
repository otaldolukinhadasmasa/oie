package Entidade;
public class Conta {
    private int number;
    private String nome;
    private double saldo;
    
    public Conta (int number, String nome){
        this.number = number;
        this.nome = nome;
    }    

    public Conta (int number, String nome, double depositoInicial){
        this.number = number;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double valor){
        saldo += valor; 
    }

    public void saque(double valor){
        if (saldo < valor + 5){
            System.out.println("ERRO");
            System.out.println("Nao foi possivel realizar o saque. Valor de saque maior do que o saldo.");
        } else {
        saldo -= valor - 5;
        }
    }

    public String toString() {
        return "Numero da conta: "
            + number
            + ", holder: "
            + nome
            + ", saldo: $ "
            + String.format("%.2f", saldo);
    }
}
