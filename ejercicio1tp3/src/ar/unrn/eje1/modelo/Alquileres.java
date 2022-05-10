package ar.unrn.eje1.modelo;

import java.util.ArrayList;

public class Alquileres {
	private ArrayList<Alquiler> alquileres;

	public Alquileres() {
		this.alquileres = new ArrayList<Alquiler>();
	}

	public void alquilar(Alquiler alquiler) {
		this.alquileres.add(alquiler);

	}

	public int cantidadDeAlquileres() {
		return this.alquileres.size();
	}

	public void eliminarAlquiler(Alquiler alquiler) {
		this.alquileres.remove(alquiler);
	}

	public int sumarPuntosObtenidos() {
		int puntos = 0;
		for (Alquiler a : alquileres) {
			puntos += a.sumarPuntosSiEsFrecuente();
		}
		return puntos + this.alquileres.size();
	}

	public double calcularDeuda() {
		double total = 0;
		for (Alquiler alquiler : alquileres) {
			total += alquiler.calcularMonto(alquiler.diasAlquilados()) + 2;
		}
		return total;
	}
}
