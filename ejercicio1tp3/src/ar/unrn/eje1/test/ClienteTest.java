package ar.unrn.eje1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.eje1.modelo.Alquiler;
import ar.unrn.eje1.modelo.CategoriaLibro;
import ar.unrn.eje1.modelo.Cliente;
import ar.unrn.eje1.modelo.CopiaLibro;
import ar.unrn.eje1.modelo.Libro;
import ar.unrn.eje1.modelo.RegularCategoriaLibro;

class ClienteTest {

	@Test
	void testCalcularDeudaYPuntosObtenidos() {
		//
		CategoriaLibro categoria = new RegularCategoriaLibro(2, 1.5);
		Libro elTunel = new Libro("El Túnel", categoria);
		Libro antesDelFin = new Libro("Antes del Fin", categoria);
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		double deuda = (double) resultado[0];
		int puntosObtenidos = (int) resultado[1];
		assertEquals(deuda, 10.0);
		assertEquals(puntosObtenidos, 2);

	}

}
