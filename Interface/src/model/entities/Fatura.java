package model.entities;

public class Fatura {

	private Double pagamentoBasico;
	private Double taxaImposto;
	
	public Fatura() {
	}

	public Fatura(Double pagamentoBasico, Double taxaImposto) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxaImposto = taxaImposto;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getTaxaImposto() {
		return taxaImposto;
	}

	public void setTaxaImposto(Double taxaImposto) {
		this.taxaImposto = taxaImposto;
	}

	public Double getPagamentoTotal() {
		return getPagamentoBasico() + getTaxaImposto();
	}
}
