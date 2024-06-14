package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrestamoTest {

	@Test
	void test() {
	Lector L1 = new Lector(1, "Pedro", "223313", "PedroMiamigo@gmail", "12345");
	EjemplarLibro E1 = new EjemplarLibro("2312", "uno", "pepe", 1978);
	Prestamo P1 = new Prestamo(1, L1, E1, 1, 9);
	double devolver = P1.devolverPrestamo(1, 9);
	
	
	}

}
