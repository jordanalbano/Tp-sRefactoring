package ar.unrn.eje1.modelo;

public abstract class CategoriaLibro {
	protected String categoria;
	protected double diasADescontar;
	protected double precioTotal;

	public CategoriaLibro(String categoria, double diasADescontar, double precioTotal) {
		this.categoria = categoria;
		this.diasADescontar = diasADescontar;
		this.precioTotal = precioTotal;
	}

	public String categoria() {
		return this.categoria;
	}

	public abstract double calcularMonto(int diasAlquilados);

	protected abstract int sumarPuntosSiEsFrecuente(int diasAlquilados);

}
