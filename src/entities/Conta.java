package entities;

public class Conta {
    private String nome;
    private Integer numeroDaConta;
    private Double saldoDaConta;
    private final  Double taxaDebito = 5.00;

   /* public Conta(String nome, Integer numero){
        this.nome = nome;
        this.numeroDaConta = numero;
    }
*/
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta(Integer numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }
    public Double getSaldoDaConta(){
        return saldoDaConta;
    }
    public void setSaldoDaConta(Double saldoDaConta){
        this.saldoDaConta = saldoDaConta;
    }

    public void credito(Double valor){
        this.saldoDaConta += valor;
    }
     public void debito(Double valor){
        if(saldoDaConta == 0.00 || saldoDaConta < (valor + taxaDebito) ){
            System.out.println("Desculpe, mas não é possivel realizar esta transação saldo indisponível :(");
        }else{
            this.saldoDaConta -= (valor + taxaDebito);
        }
     }
     public double saldo(){
        return saldoDaConta;
     }
}
