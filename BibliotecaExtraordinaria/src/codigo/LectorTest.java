package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LectorTest {

	@Test
	@DisplayName("EL codigo postal es null")
	void test() {
		Lector L1 = new Lector(1, "", "", "", null);
		boolean validar = L1.validarCodigoPostal(null);
		assertFalse(validar);
		//assertThrows(IllegalArgumentException.class, () -> L1.validarCodigoPostal(""));
	}
	
	@Test
	@DisplayName("El codigoPostal es !5")
	void test2() {
		Lector L1 = new Lector(1, "", "", "", "121212121212");
		boolean validar = L1.validarCodigoPostal("121212121212");
		assertFalse(validar);
		
	}
	
	@Test
	@DisplayName("El codigoPostal es 5")
	void test3() {
		Lector L1 = new Lector(1, "", "", "", "12345");
		boolean validar = L1.validarCodigoPostal("12345");
		assertTrue(validar);
		
	}
	
	
	@Test
	@DisplayName("El email es null")
	void test4() {
		Lector L1 = new Lector(1, "", "", "", null);
		boolean validar = L1.validarEmail(null);
		assertFalse(validar);
		
	}
	
	@Test
	@DisplayName("El email es menor de 3 caracteres")
	void test5() {
		Lector L1 = new Lector(1, "", "", "", "2");
		boolean validar = L1.validarEmail("2");
		assertFalse(validar);	
		
	}
	
	@Test
	@DisplayName("si no lleva @")
	void test6() {
		Lector L1 = new Lector(1, "", "", "", "pepitoelpe23");
		boolean validar = L1.validarEmail("pepitoelpe23");
		assertFalse(validar);	
		
	}
	
	@Test
	@DisplayName("el gmail es correcto")
	void test7() {
		Lector L1 = new Lector(1, "", "", "", "pepitoelpe23@gmal.com");
		boolean validar = L1.validarEmail("pepitoelpe23@gmal.com");
		assertTrue(validar);	
		
	}
	
	@Test
	@DisplayName("el gmail es correcto")
	void test8() {
		Lector L1 = new Lector(1, "", "", "", "pepitoelpe23@@@");
		boolean validar = L1.validarEmail("pepitoelpe23@@@");
		assertFalse(validar);	
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
