
package com.ies;

import static org.junit.Assert.*;

import org.junit.Test;

public class BancoTest {

	@Test
	public void testBuscarTitular() {
		Banco banco = new Banco();
        Titular titular1 = new Titular("Sergio", "Fuentes", "12345678A", "677780106");
        banco.anadirTitular(titular1);
        int indice1 = banco.buscarTitular(titular1);
        assertEquals(0, indice1);
        //valor esperado es 0, porque es su posicion en el array y su índice coincide.
	}
	
	@Test
	public void testBuscarTitularKo() {
		Banco banco = new Banco();
        Titular titular1 = new Titular("Sergio", "Fuentes", "12345678A", "677780106");
        banco.anadirTitular(titular1);
        int indice1 = banco.buscarTitular(titular1);
        assertEquals(3, indice1);
        //valor esperado es 0 porque es su posicion en el array y al ser 3 no coincide con su índice.
	}
	 @Test
    public void testAnadirTitular() {
        Banco banco = new Banco();
        Titular titular1 = new Titular("Carlos", "Rodríguez", "12478956A", "123456789");
        boolean anadido1 = banco.anadirTitular(titular1);
        assertTrue(anadido1);
        //comprobamos que el titular se ha añadido correctamente.
	 }
	 
	 @Test
	 public void testAnadirTitularKo() {
	        Banco banco = new Banco();
	        Titular titular1 = new Titular("Carlos", "Rodríguez", "12478956A", "123456789");
	        boolean anadido1 = banco.anadirTitular(titular1);
	        assertTrue(anadido1);
	        //comprobamos que el titular se ha añadido correctamente.
		 }
	 

}

	

	