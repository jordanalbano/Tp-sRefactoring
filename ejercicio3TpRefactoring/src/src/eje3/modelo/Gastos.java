package src.eje3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Gastos {
	private List<Gasto> gastos;

	public Gastos(ArrayList<Gasto> gastos) {
		this.gastos = gastos;
	}

	public String getGastosDetallados() {
		String stringGasto = "";
		for (Gasto gasto : gastos) {
			String marcaExcesoComidas = gasto.seExcedio();
			stringGasto = stringGasto + "\n" + "\t" + gasto.tipoDeGasto() + " " + gasto.montoGastos() + " $" + "   "
					+ marcaExcesoComidas;
		}
		return stringGasto;
	}

	public int montoDeGastos() {
		return (int) gastos.stream().mapToInt(g -> g.montoGastos()).sum();
	}

	public int gastosDeComida() {
		return (int) gastos.stream().mapToInt(g -> g.sumaComidas()).sum();

	}

}
