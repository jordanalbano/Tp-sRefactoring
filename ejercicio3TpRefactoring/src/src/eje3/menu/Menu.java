package src.eje3.menu;

import java.util.ArrayList;

import src.eje3.modelo.Fecha;
import src.eje3.modelo.Gasto;
import src.eje3.modelo.ReporteDeGastos;

public class Menu {
	public static void main(String[] args) {
		Fecha fecha = new Fecha();
		ReporteDeGastos reporte = new ReporteDeGastos(fecha);
		ArrayList<Gasto> gastos = new ArrayList<>();
		/*
		 * gastos.add(new Gasto(new CenaTipoDeGasto(), 6000)); gastos.add(new Gasto(new
		 * DesayunoTipoDeGasto(), 500)); gastos.add(new Gasto(new
		 * AlquilerDeAutoTipoDeGasto(), 50)); Gastos g = new Gastos(gastos); String
		 * gasto = reporte.gastos(g); System.out.println(gasto);
		 */

	}

}
