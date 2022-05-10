package ar.unrn.eje1.modelo;

public class Alquiler {
	private CopiaLibro copia;
	private int diasAlquilados;

	public Alquiler(CopiaLibro copia, int diasAlquilados) {
		this.copia = copia;
		this.diasAlquilados = diasAlquilados;
	}

	public String categoriaLibro() {
		return copia.categoria();
	}

	public double calcularMonto(int diasAlquilados) {
		return this.copia.calcularMonto(diasAlquilados);
	}

	public int diasAlquilados() {
		return this.diasAlquilados;
	}

	public CopiaLibro copia() {
		return this.copia;
	}

	public int sumarPuntosSiEsFrecuente() {
		return copia.sumarPuntosSiEsFrecuente(this.diasAlquilados);
	}
}
