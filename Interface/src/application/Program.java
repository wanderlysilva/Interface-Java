package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.service.ServiçoAluguel;
import model.service.TaxaImpostoBr;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do veiculo: ");
		String modeloVeiculo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime dataInicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Devolução (dd/MM/yyyy hh:mm): ");
		LocalDateTime  dataEntrega = LocalDateTime.parse(sc.nextLine(), fmt);
		//AluguelCarro esta associado a data e tambem esta associado a classe veiculo
		AluguelCarro alc = new AluguelCarro(dataInicio, dataEntrega, new Veiculo(modeloVeiculo));
	
		System.out.print("Entre como o preço por Hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double precoDia = sc.nextDouble();
	
	
		ServiçoAluguel serviçoAluguel = new ServiçoAluguel(precoHora, precoDia,new TaxaImpostoBr());
		
		serviçoAluguel.processoFatura(alc);
		
		System.out.println("Fatura:");
		System.out.println("Pagamento basíco: " + String.format("%.2f",  alc.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", alc.getFatura().getTaxaImposto()));
		System.out.println("Pagamento total: " + String.format("%.2f", alc.getFatura().getPagamentoTotal()));
	
	
		sc.close();
	}
	

}
