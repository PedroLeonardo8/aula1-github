package util;

public class CurrencyConverter {

	public double dollarPrice;
	public double dollarBought;
	
	public double convert() {
		return dollarPrice*dollarBought;
	}
	
	public double iof() {
		return 6 * convert() / 100;
		
	}
	public double total() {
		return iof() + convert();
	}
}
