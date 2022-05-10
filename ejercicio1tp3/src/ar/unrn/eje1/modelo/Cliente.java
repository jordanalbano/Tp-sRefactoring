package ar.unrn.eje1.modelo;

public class Cliente {
	private Alquileres alquileres;
	private String name;

	public Cliente(String nombre) {
		this.name = nombre;
		alquileres = new Alquileres();
	}

	public Object[] calcularDeudaYPuntosObtenidos() {
		Object[] resultado = { calcularDeuda(), calcularPuntosObtenidos() };
		return resultado;
	}

	private int calcularPuntosObtenidos() {
		return alquileres.sumarPuntosObtenidos();
	}

	private double calcularDeuda() {
		return alquileres.calcularDeuda();

	}

	public void alquilar(Alquiler rental) {
		this.alquileres.alquilar(rental);
	}
}