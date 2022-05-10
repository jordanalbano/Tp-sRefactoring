package src.eje3.modelo;

public class Gasto {
	private TipoDeGasto tipoGasto;
	private int montoTotal;

	public Gasto(TipoDeGasto tipoGasto) {
		this.tipoGasto = tipoGasto;

	}

	public String tipoDeGasto() {
		return this.tipoGasto.tipoDeGasto();
	}

	public String seExcedio() {
		return this.tipoGasto.seExcedio(this.tipoGasto.monto());
	}

	public int sumaComidas() {

		return this.tipoGasto.sumaComidas();
	}

	public int montoGastos() {
		return this.tipoGasto.monto();
	}
}
