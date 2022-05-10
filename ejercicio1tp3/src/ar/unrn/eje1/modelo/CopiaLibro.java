package ar.unrn.eje1.modelo;

public class CopiaLibro {
	private Libro libro;

	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}

	public Libro libro() {
		return this.libro;
	}

	public String categoria() {
		return libro.categoria();

	}

	public double calcularMonto(int diasAlquilados) {

		return libro.calcularMonto(diasAlquilados);
	}

	public int sumarPuntosSiEsFrecuente(int diasAlquilados) {
		return this.libro.sumarPuntosSiEsFrecuente(diasAlquilados);
	}

}