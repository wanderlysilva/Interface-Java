package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {

	private LocalDateTime dataInicio;
	private LocalDateTime dataEntrega;

	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro() {
	}

	public AluguelCarro(LocalDateTime dataInicio, LocalDateTime dataEntrega, Veiculo veiculo) {
		super();
		this.dataInicio = dataInicio;
		this.dataEntrega = dataEntrega;
		this.veiculo = veiculo;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDateTime dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	


}
