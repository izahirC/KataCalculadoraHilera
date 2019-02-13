package test.cenfotec.katas.ch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cenfotec.katas.ch.CalculadoraHilera;

	public class TestCalculadoraHileras {
		
		@Test
		public void agrega2Valores(){
			String cadena = new String ("1,2");
			assertEquals(3, CalculadoraHilera.Add(cadena));
		}
		
		@Test
		public void agrega4Valores(){
			String cadena = new String ("1,2,3,4");
			assertEquals(10, CalculadoraHilera.Add(cadena));
		}
		
		@Test
		public void agregaConPuntoComa(){
			String cadena = new String ("1;2;3");
			assertEquals(6, CalculadoraHilera.Add(cadena));
		}
		@Test
		public void agregaConComa(){
			String cadena = new String ("2,2,2,2");
			assertEquals(8, CalculadoraHilera.Add(cadena));
		}
		
		@Test
		public void retornaUno(){
			String cadena = new String ("1");
			assertEquals(1, CalculadoraHilera.Add(cadena));
		}
	

}
