package ar.unrn.eje1.modelo;

public class InfantilesCategoriaLibro extends CategoriaLibro {
	public InfantilesCategoriaLibro(String categoria, int diasADescontar, double precioTotal) {
		super(categoria, diasADescontar, precioTotal);
	}

	@Override
	public double calcularMonto(int diasAlquilados) {
		return this.precioTotal;
	}

	@Override
	protected int sumarPuntosSiEsFrecuente(int diasAlquilados) {
		return 0;
	}

}
