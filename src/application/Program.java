package application;

import java.util.Scanner;

import util.CurrencyConverter;


public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CurrencyConverter conversor = new CurrencyConverter();
	
	System.out.print("What´s the dollar price: ");
	conversor.dollarPrice = sc.nextDouble();
	
	System.out.print("How many dollars will be bought?");
	conversor.dollarBought = sc.nextDouble();
	
	System.out.println("Converted price: " + conversor.convert());
	System.out.println("IOF: " +conversor.iof());
	
	System.out.println("Total (IOF included): " + conversor.total());
	sc.close();

	}

}
