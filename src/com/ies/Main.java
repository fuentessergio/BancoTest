package com.ies;

public class Main {
	
	public static void main(String[] args) { 
	
	Titular Sergio = new Titular ("Sergio", "Fuentes", "54210338", "677801036");
	Banco Caixa = new Banco();
	
	
	System.out.println(Caixa.anadirTitular(Sergio));

	}
}
