package ar.unrn.eje1.modelo;

public class RegularCategoriaLibro extends CategoriaLibro {

	public RegularCategoriaLibro(double diasADescontar, double precioTotal) {
		super("REGULAR", diasADescontar, precioTotal);
	}

	@Override
	public double calcularMonto(int diasAlquilados) {
		double monto = 0;
		if (diasAlquilados > 2) {
			monto = (diasAlquilados - 2) * 1.5;
		}
		return monto;
	}

	@Override
	protected int sumarPuntosSiEsFrecuente(int diasAlquilados) {

		return 0;
	}

}
