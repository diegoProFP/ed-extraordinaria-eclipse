package codigo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrestamoTest {

	@Test
	@DisplayName("devolvemos el libro por los pelos")
	void test() {
	Lector L1 = new Lector(1, "Pedro", "223313", "PedroMiamigo@gmail", "12345");
	EjemplarLibro E1 = new EjemplarLibro("2312", "uno", "pepe", 1978);
	Prestamo P1 = new Prestamo(1, L1, E1, 1, 9);
	double devolver = P1.devolverPrestamo(1, 9);
	assertEquals(0, devolver);
	
	}
	
	@Test
	@DisplayName("los dias no cuadran")
	void test2() {
	Lector L1 = new Lector(1, "Pedro", "223313", "PedroMiamigo@gmail", "12345");
	EjemplarLibro E1 = new EjemplarLibro("2312", "uno", "pepe", 1978);
	Prestamo P1 = new Prestamo(1, L1, E1, 1111, 9);
	assertThrows(IllegalArgumentException.class, () -> P1.devolverPrestamo(1111, 9));
	
	}
	
	
	@Test
	@DisplayName("los meses no cuadran")
	void test3() {
	Lector L1 = new Lector(1, "Pedro", "223313", "PedroMiamigo@gmail", "12345");
	EjemplarLibro E1 = new EjemplarLibro("2312", "uno", "pepe", 1978);
	Prestamo P1 = new Prestamo(1, L1, E1, 1, 9999);
	assertThrows(IllegalArgumentException.class, () -> P1.devolverPrestamo(1, 9999));
	
	}
	
	@Test
	@DisplayName("penal")
	void test4() {
	Lector L1 = new Lector(1, "Pedro", "223313", "PedroMiamigo@gmail", "12345");
	EjemplarLibro E1 = new EjemplarLibro("2312", "uno", "pepe", 1978);
	Prestamo P1 = new Prestamo(1, L1, E1, 1, 9);
	double devolver = P1.devolverPrestamo(3, 8);
	assertEquals(0, devolver);

	}
	
	@Test
	@DisplayName("todo ok")
	void test5() {
	Lector L1 = new Lector(1, "Pedro", "223313", "PedroMiamigo@gmail", "12345");
	EjemplarLibro E1 = new EjemplarLibro("2312", "uno", "pepe", 1978);
	Prestamo P1 = new Prestamo(1, L1, E1, 1, 9);
	double devolver = P1.devolverPrestamo(3, 10);
	assertEquals(48.0, devolver);

	}
	

	
	
	
	
	
	
	

}
