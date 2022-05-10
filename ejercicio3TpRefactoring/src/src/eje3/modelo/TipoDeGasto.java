package src.eje3.modelo;

public abstract class TipoDeGasto {
	protected int gasto;

	public TipoDeGasto(int gasto) {
		this.gasto = gasto;
	}

	public int monto() {
		return this.gasto;
	}

	public abstract String tipoDeGasto();

	public abstract String seExcedio(int monto);

	public abstract int sumaComidas();

}
