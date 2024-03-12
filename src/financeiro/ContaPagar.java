package financeiro;

import java.io.Serializable;

public class ContaPagar implements Serializable {
	
	private String descricao;
    private double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    private boolean pago;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPago() {
        return pago;
    }

    public boolean isPendente() {
        return !isPago(); // vai retornar o metodo negativo do 'isPago'
    }

    public void pagar() {
        if (isPago()) { // Se esse metodo estiver pago
            throw new RuntimeException("Conta já está paga");
        }

        pago = true; // o atributo pago vai receber o valor true
    }

    public void cancelarPagamento() {
        if (isPendente()) {
            throw new RuntimeException("Conta já está pendente de pagamento");
        }

        pago = false; // o atributo pago vai receber o valor false
    }


}
