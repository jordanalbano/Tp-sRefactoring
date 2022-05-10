package src.eje3.modelo;

public class CenaTipoDeGasto extends TipoDeGasto {
	public CenaTipoDeGasto(int gasto) {
		super(gasto);
		// TODO Esbozo de constructor generado automáticamente
	}

	public String tipoDeGasto() {
		return "Cena";
	}

	public String seExcedio(int monto) {
		return monto > 5000 ? "X" : "";
	}

	@Override
	public int sumaComidas() {

		return this.gasto;
	}
}
