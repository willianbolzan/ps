package patterns.strategy.exemplos.pagamento.v2;



public class CartaoCredito implements Pagamento {
    private double saldoDisponivel;

    public CartaoCredito(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public void processarPagamento(double valor) {
        if (saldoDisponivel >= valor) {
            System.out.println("Pagamento de R$" + valor + " realizado no cartão de crédito.");
        } else {
            System.out.println("Pagamento recusado: saldo insuficiente no cartão de crédito.");
        }
    }
}

