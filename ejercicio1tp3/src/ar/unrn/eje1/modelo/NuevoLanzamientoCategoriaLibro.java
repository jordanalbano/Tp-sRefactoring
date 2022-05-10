package ar.unrn.eje1.modelo;

public class NuevoLanzamientoCategoriaLibro extends CategoriaLibro {

	public NuevoLanzamientoCategoriaLibro(String categoria, int diasADescontar, double precioTotal) {
		super(categoria, diasADescontar, precioTotal);
	}

	@Override
	public double calcularMonto(int diasAlquilados) {
		return diasAlquilados * 3;
	}

	@Override
	protected int sumarPuntosSiEsFrecuente(int diasAlquilados) {
		return (diasAlquilados > 1) ? 1 : 0;
	}
}
