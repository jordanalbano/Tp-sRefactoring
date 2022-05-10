package ar.unrn.eje1.menu;

import ar.unrn.eje1.modelo.Alquiler;
import ar.unrn.eje1.modelo.CategoriaLibro;
import ar.unrn.eje1.modelo.Cliente;
import ar.unrn.eje1.modelo.CopiaLibro;
import ar.unrn.eje1.modelo.Libro;
import ar.unrn.eje1.modelo.RegularCategoriaLibro;

public class Menu {

	public static void main(String[] args) {
		CategoriaLibro categoria = new RegularCategoriaLibro(2, 1.5);

		Libro elTunel = new Libro("El Túnel", categoria);
		Libro antesDelFin = new Libro("Antes de Fin", categoria);
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		System.out.println(resultado[0]);
		System.out.println(resultado[1]);

	}

}
