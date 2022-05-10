package src.eje3.modelo;

public class DesayunoTipoDeGasto extends TipoDeGasto {

	public DesayunoTipoDeGasto(int gasto) {
		super(gasto);
		// TODO Esbozo de constructor generado automáticamente
	}

	public String seExcedio(int monto) {
		return monto > 1000 ? "X" : "";
	}

	@Override
	public int sumaComidas() {

		return this.gasto;
	}

	@Override
	public String tipoDeGasto() {
		// TODO Esbozo de método generado automáticamente
		return "Desayuno";
	}

}
