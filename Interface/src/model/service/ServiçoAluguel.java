package model.service;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServiçoAluguel {

	private Double precoHora;
	private Double precoDia;

	// composição com a classe TaxaImpostoBr
	private TaxaServico taxaImpostoBr;

	// Não vou colocar o construtor sem argumento porque eu quero obrigar a passar
	// estes valores ao estanciar
	public ServiçoAluguel(Double precoHora, Double precoDia, TaxaServico taxaImpostoBr) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxaImpostoBr = taxaImpostoBr;
	}

	public void processoFatura(AluguelCarro aluguelCarro) {

		// minutos recebe a duração entre os dois horarios e converte em minutos
		double minutos = Duration.between(aluguelCarro.getDataInicio(), aluguelCarro.getDataEntrega()).toMinutes();
		double horas = minutos / 60;

		double pagamentoBasico;
		if (horas <= 12.0) {

			pagamentoBasico = precoHora * Math.ceil(horas);
		}

		else {
			pagamentoBasico = precoDia * Math.ceil(horas / 24.0);
		}

		double taxaImposto = taxaImpostoBr.taxa(pagamentoBasico);
		
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxaImposto));
	}

}
