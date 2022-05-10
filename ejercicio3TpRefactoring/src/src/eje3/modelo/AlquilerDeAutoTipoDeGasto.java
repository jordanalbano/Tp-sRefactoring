package src.eje3.modelo;

public class AlquilerDeAutoTipoDeGasto extends TipoDeGasto {

	public AlquilerDeAutoTipoDeGasto(int gasto) {
		super(gasto);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public String tipoDeGasto() {

		return "Alquiler De Auto";
	}

	public String seExcedio(int monto) {

		return "";
	}

	@Override
	public int sumaComidas() {
		return 0;
	}

}
