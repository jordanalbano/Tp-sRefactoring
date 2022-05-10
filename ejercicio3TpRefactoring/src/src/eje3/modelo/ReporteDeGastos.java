package src.eje3.modelo;

public class ReporteDeGastos {
	private ProveedorDeFecha fechaReporte;
	private Gastos gastos;

	public ReporteDeGastos(ProveedorDeFecha fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public String gastos(Gastos gastos) {

		String gastoDetallado = "Fecha De Reporte: " + fechaReporte.fecha() + " " + "\nDetalles: "
				+ gastos.getGastosDetallados();
		String gastoFinal = "\nMonto De Comidas: " + gastos.gastosDeComida() + "\n" + "Monto Total De Gastos: "
				+ gastos.montoDeGastos();

		return gastoDetallado + gastoFinal;
	}

}
