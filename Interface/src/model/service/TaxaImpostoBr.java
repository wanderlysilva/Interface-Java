package model.service;

/*TaxaimpostoBr implementa a interface TaxaSerico que é um tipo generico
 * com isso eu tenho taxas expecificas que implementam esta classe*/
public class TaxaImpostoBr implements TaxaServico {

	public double taxa (double montante) {
		if (montante <= 100.0) {
			return montante * 0.2;
		}
		else {
			return montante * 0.15;
		}
	}

}
