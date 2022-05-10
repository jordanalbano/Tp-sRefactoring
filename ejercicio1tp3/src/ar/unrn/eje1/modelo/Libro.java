package ar.unrn.eje1.modelo;

public class Libro {
	public static final int INFANTILES = 2;
	public static final int REGULARES = 0;
	public static final int NUEVO_LANZAMIENTO = 1;
	private CategoriaLibro categoria;
	private String nombre;

	public Libro(String nombre, CategoriaLibro categoria) {
		this.nombre = nombre;

		this.categoria = categoria;
	}

	public double calcularMonto(int diasAlquilados) {
		return this.categoria.calcularMonto(diasAlquilados);
	}

	public String categoria() {

		return this.categoria.categoria();
	}

	public String nombre() {
		return this.nombre;
	}

	public int sumarPuntosSiEsFrecuente(int diasAlquilados) {

		return categoria.sumarPuntosSiEsFrecuente(diasAlquilados);
	}
}